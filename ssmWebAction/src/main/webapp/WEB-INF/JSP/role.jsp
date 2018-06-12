<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
</body>
<center>
<table border = "1">           
<tr>
<td>标签</td>          
<td>值</td>           
</tr>
<tr>
<td>编号</td>                  
<td>${role.id}</td>
</tr>
<tr>
<td>角色名称</td>         
<td>${role.rolename}</td>                                         
</tr>
<tr>  
<td>角色note</td>          
<td>${role.note}</td>
</tr>
</table>
</center>
</html>