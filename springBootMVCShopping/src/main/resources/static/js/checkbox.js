/**
 * checkbox.js
 */
$(function(){
	$("#checkBoxs").click(function(){
		if($("#checkBoxs").prop("checked")){
			$(":checkbox[name=nums]").prop("checked",true);
		}else{
			$("input:checkbox[name='nums']").prop("checked",false);
		}
		prodChk();
	});
	$("input:checkbox[name='nums']").click(function(){
		var tot = $("input:checkbox[name='nums']").length;
		var cnt = $("input:checkbox[name='nums']:checked").length;
		if(tot==cnt) $("#checkBoxs").prop("checked",true);
		else $("#checkBoxs").prop("checked",false);
		prodChk();
	})
});