<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>cartList.jsp</title>
<script src="https://ajax.aspnetcdn.com/ajax/jQuery/jquery-1.8.1.min.js"></script>
<script type="text/javascript">
$(function(){
	$("#checkBoxs").click(function(){
		if($("#checkBoxs").prop("checked")){
			$(":checkbox[name='prodCk']").prop("checked",true);
		}else{
			$(":checkbox[name='prodCk']").prop("checked",false);
		}
		prodChk();
	});
	$("input:checkbox[name='prodCk']").click(function(){
		var checkCnt = $("input:checkbox[name='prodCk']").length;
		var checked = $("input:checkbox[name='prodCk']:checked").length;
		
		if(checkCnt == checked) $("#checkBoxs").prop("checked",true);
		else $("#checkBoxs").prop("checked",false);
		prodChk();
	});
});
function prodChk(){
	var cnt = $(":checkbox[name='prodCk']:checked").length;
	var totalQty = 0; // 총 상품 수량
	var totalPrice = 0; // 총 상품 금액
	var checkboxCnt = $(":checkbox[name='prodCk']").length;
	for(var idx = 0; idx < checkboxCnt ; idx++ ){
		if($(":checkbox[name='prodCk']")[idx].checked){
			totalPrice += Number($(".cartPrice:eq("+idx+")").text());
			totalQty += Number($(".cartQty:eq("+idx+")").text());
		}
	}
	$("#prodCnt").text(cnt);
	$("#totQty").text(totalQty);
	$("#totalPrice").text(totalPrice);
}
function goodsCartAdd(goodsNum , idx, goodsPrice){
	option = {
		type: "post",
		url: "cart.item",
		data:{"goodsNum": goodsNum , "cartQty" : 1},
		success :  function(){
			$(".cartQty:eq("+idx+")").text( 
					Number($(".cartQty:eq("+idx+")").text()) + 1 
			);
			$(".cartPrice:eq("+idx+")").text( 
					Number($(".cartPrice:eq("+idx+")").text()) + goodsPrice 
			);
		},
		error : err ,
		complete : prodChk
	};
	$.ajax(option);
}
function err(){
	alert("로그 아웃되었습니다. 다시로그인 해주세요.");
	window.open("loginCk.login","loginck","width=400,height=400");
}
function checkQty(idx, goodsNum, goodsPrice){
	var val = $(".cartQty:eq("+idx+")").text( );
	if(val <= 1) alert("최소 수량은 1개 이상이어야 합니다.");
	else{
		$.ajax({
			type: "post",
			url: "cartQtyDown.item",
			data: {"goodsNum":goodsNum},
			success : function(){
				$(".cartQty:eq("+idx+")").text( 
						Number($(".cartQty:eq("+idx+")").text()) - 1 
				);
				$(".cartPrice:eq("+idx+")").text( 
						Number($(".cartPrice:eq("+idx+")").text()) - goodsPrice 
				);
			},
			error :err,
			complete:prodChk
		});
	}
}
function itemDel(goodsNum){
	con = confirm ("정말 삭제하시겠나?");
	if(con) location.href="cartItemsDel.item?goodsNums="+goodsNum;
}
function itemsDel(){
	if($(":checkbox[name=prodCk]:checked").length <= 0)
		alert("적어도 하나이상 체크되어 있어야합니다.");
	else{
		con = confirm("삭제한 상품은 복구가 불가능합니다. \n그래도 삭제하시겠습니까?");
		var goodsNums = "";
		if(con){
			$(":checkbox[name=prodCk]:checked").each(function(){
				goodsNums +=  $(this).val() + "-"
			});
			location.href="cartItemsDel.item?goodsNums="+goodsNums;
		}
	}
}
function goodsCheck(){
	if( $(":checkbox[name=prodCk]:checked").length <= 0 ){
		alert("주문하실 상품은 1개 이상 선택하셔야 합니다.");
		return false;
	}
}
</script>
</head>
<body>
<form action="itemBuy.item" method="post" onsubmit="return goodsCheck();">
<table width="600" align = "center">
	<tr><td><input type="checkbox" id="checkBoxs"  /></td>
		<td>이미지</td><td>제품이름</td><td>수량</td><td>합계금액</td>
		<td><button type="button" onclick="itemsDel();">선택삭제</button></td>
	</tr>
	<c:forEach items="${list }" var="dto" varStatus="idx"><!-- 0,1,2,3 -->
		<tr><td><input type="checkbox" name="prodCk"  value="${dto.goodsNum }" /></td>
			<td><img src="goods/upload/${dto.goodsImage }" width="30"/></td>
			<td>${dto.goodsName }</td>
			<td><a href="javascript:checkQty(${idx.index }, '${dto.goodsNum }', ${dto.goodsPrice })">[ - ]</a> 
				<span class="cartQty">${dto.cartQty }</span>
				<a href="javascript:goodsCartAdd('${dto.goodsNum }',${idx.index },${dto.goodsPrice })">[ + ]</a></td>
			<td><span class="cartPrice">${dto.totalPrice }</span></td>
			<td><button type="button" onclick="itemDel('${dto.goodsNum}')">삭제</button></td>	
		</tr>
	</c:forEach>
	<!-- 추가 -->
	<tr><td colspan="6" align="right">
			상품수 : <span id="prodCnt">0</span>개<br />
			총수량 : <span id="totQty">0</span>개<br />
			전체 합계 : <span id="totalPrice">0</span>원
		</td>
	</tr>
	<tr><td colspan="6" align="right"><input type="submit" value="구매하기"/></td></tr>
</table>
</form>
</body>
</html>