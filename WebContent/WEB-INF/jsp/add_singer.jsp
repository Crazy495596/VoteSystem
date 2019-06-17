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
    param=$("#form1").serialize();
    $.ajax({
        url:"${pageContext.request.contextPath}/add_singer_submit",
        data:param,
        success: function(data) {
            alert(data);
        }
        });
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