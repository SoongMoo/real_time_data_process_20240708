<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>detailView.jsp</title>
<script src="https://ajax.aspnetcdn.com/ajax/jQuery/jquery-1.8.1.min.js"></script>
<script type="text/javascript">
	$(function(){
		$("#buyItem").click(function(){
			location.href
				="buyItem.item?goodsNum=${dto.goodsNum}&cartQty="+$("#cartQty").val();
		});
		$("#cartBtn").click(function(){
			if(${!empty auth}){
				$.ajax({
					type:"post",
					//url:"cart.item?goodsNum=${dto.goodsNum}&cartQty="+$("#cartQty").val(),
					url : "cart.item",
					data : {"goodsNum":"${dto.goodsNum}","cartQty":$("#cartQty").val()},
					success:function(){
						con = confirm("장바구니로 이동하시겠습니까?"); 
						if(con){
							location.href="cartList.item";
						}else{
							document.location.reload();
						}
					},
					error : function(){
						alert("로그 아웃되었습니다. 다시로그인 해주세요.");
						window.open("loginCk.login","loginck","width=400,height=400");
					}
				});
			}else{
				window.open("loginCk.login","loginck","width=400,height=400");
			}
		});
		$("#wish").click(function(){
			//json으로 값을 전달
			$.ajax({
				type : "post", 
				url : "wishItem.item",
				data : {"goodsNum":"${dto.goodsNum }"},
				success:function(){
					if($("#wish").attr("src") == "images/hart1.jpg"){
						$("#wish").attr("src","images/hart.jpg");
					}else{
						$("#wish").attr("src","images/hart1.jpg");
					}
				},
				error:function(){
					alert('로그인 아웃 되었습니다.\n다시 로그인 해 주세요.');
					location.href="<c:url value='/' />";
					// /jspMVCMisoShopping/
					return false;
				}
			}); 
		});
		$("#descript").click(function(){
			descript();
		});
		
		$("#review").click(function(){
			//location.href = "reviewList.review?goodsNum=${dto.goodsNum}";
			$.ajax({
				type:"post",
				url : "reviewList.review",
				data : {"goodsNum":"${dto.goodsNum}"},
				dataType : "html",
				success : function(result){
					$("#content").html(result);
				},
				error : function(){
					alert('에러가 나왔다 홀홀홀~');
					return;
				}
			});
		});
	});
	
	$(function(){
		descript();
	});
	
	
	function descript(){
		//location.href="descript.item?goodsNum=${dto.goodsNum}";
		$.ajax({
			type:"post",
			url:"descript.item",
			data : {"goodsNum":"${dto.goodsNum}"},
			dataType : "html",
			success : function(result){
				$("#content").html(result);
			},
			error : function(){
				alert('에러가 나왔다 홀홀홀~');
				return;
			}
		});
	}
	function inquire(){
		//location.href= "inquireList.inq?goodsNum=${dto.goodsNum}";
			$.ajax({
				type:"post",
				url : "inquireList.inq",
				data : {"goodsNum":"${dto.goodsNum}"},
				dataType : "html",
				success : function(result){
					$("#content").html(result);
				},
				error : function(){
					alert('에러가 나왔다 홀홀홀~');
					return;
				}
			});
	}
</script>
</head>
<body>
<table width="800" align="center">
<caption>${dto.goodsName } 상품정보입니다.</caption>
<tr><td rowspan="5"><img src="goods/upload/${dto.goodsMainImage }" height="200" /></td>
					<td>${dto.goodsName }</td></tr>
<tr>                <td>${dto.goodsPrice }</td></tr>
<tr>                <td>들여다본 수 : ${dto.visitCount }</td>
<tr>                <td>수량 : <input type="number" min="1" step="1" value="1" id="cartQty"/> </td></tr>
<tr>                <td><button type="button" id="cartBtn">장바구니</button> | 
 						<button type="button" id="buyItem">바로구매 </button> | 
 						<c:if test="${ empty isTrue }">
							<img src="images/hart1.jpg" width="20" id="wish"/>
						</c:if>
						<c:if test="${!empty isTrue }">
							<img src="images/hart.jpg" width="20" id="wish"/>
						</c:if>
					찜</td></tr>
<tr><td colspan="2">
		<span id="descript">제품 상세 설명</span> | 
		<span id="review">리뷰</span> | 
		<span id="inquire" onclick="inquire();">상품문의</span>
	</td></tr>
<tr><td colspan="2"><div id="content"></div></td></tr>
</table>
</body>
</html>