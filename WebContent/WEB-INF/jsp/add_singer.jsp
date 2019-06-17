<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="./js/jquery-3.4.1.min.js" ></script>
<script>
function add_singer() {
	url="${pageContext.request.contextPath}/add_singer_submit"
    param=$("#form1").serialize();
    $.post(url,param,function (date) {
        alert(date.content);
        if(date.flag==1){
            location.href="${pageContext.request.contextPath}/employee/list";
        }
    })
}
</script>
</head>
<body>
<form id="form1" method="post">
歌手名字：<input class="singer_name" name="singer_name" type="text"><br>
<button onclick="add_singer()">提交</button>
</form>
</body>
</html>