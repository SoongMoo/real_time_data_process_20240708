/**
 * 
 */

$(function(){
	$("#userId").bind("click", function(){
			$("#userId").val("");
			window.open("idCheck.nhn","아이디검색","width=400, height=200, left=130, top=150");
	});
});