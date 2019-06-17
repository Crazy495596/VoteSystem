<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="https://cdn.bootcss.com/jquery/3.2.1/jquery.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.qrcode.min.js" ></script>
<script type="text/javascript">
$(function(){

	      
	
	  var qrcode=$(".link_erwei").qrcode({ 
      //  render:'canvas||table',
        width: 200, //宽度 
        height:200, //高度 
        text: "http://47.101.48.212/WeiXin_Demo" //任意内容 
    }).show(); 

	     //   $('.link_erwei').qrcode({ width: 80, height: 80, correctLevel: 0, text: qrcode_text }); 

	      })

</script>

</head>
<body>
<div>
<div class="link_erwei fl" style="display: inline-block;">
                 
</div>



<select>
	<option>dd</option>
</select>
<br>
<select>
	<option>tt</option>
</select>
<br>
<button>添加</button>
</body>
</html>