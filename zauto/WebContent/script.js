/**
 * 
 */

$(document).ready(function() {
	$("#zasubmit").hover(function() {


		alert("hi");

		$.ajax({
			url : "http://localhost:8888/zauto/conf/fetch",
			dataType: "json",
			type: "GET",
			success : function(result) {
				alert(JSON.stringify(result));
			}
		});
	});
});