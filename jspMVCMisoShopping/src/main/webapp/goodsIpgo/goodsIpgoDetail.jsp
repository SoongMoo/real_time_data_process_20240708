<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
function ipgoUpdate(){
	location.href="goodsIpgoUpdate.ipgo";
}
function ipgoDelte(){
	location.href="goodsIpgoDelete.ipgo";
}
</script>
</head>
<body>
입고번호 : <br />
상품번호 : <br />
상품명 : <br />
입고일 : <br />
입고 수량 : <br />
제조일 : <br />
가격 : <br />
등록한 사원 : <br />
<button type="button" onclick="">입고 수정</button> | 
<button type="button" onclick="">입고 삭제</button>
</body>
</html>