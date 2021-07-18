<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link href="/Check3/css/style.css" rel="stylesheet" type="text/css" media="all">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%@include file= "header.jsp" %>
<div class = "jspTest">
<!-- name、idの入力エリアを作成しなさい -->
<table>
 <tr>
  <td align="center">name</td>
  <td align="center"> <input type="text" name="name" /></td>
 </tr>
 <tr>
  <td align="center">id</td>
  <td align="center"> <input type="text" name="id" /></td>
 </tr>
</table>
</div>
	<%@include file= "footer.jsp" %>
</body>
</html>