<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%String path=request.getContextPath(); %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>添加新闻</title>
</head>
<body>
     <form action="<%=path%>/add">
        标题：<input type="text" name="titile">
        内容：<input type="text" name="roo">
        日期：<input type="text" name="data">
        <input type="submit" value="添加">
     </form>
</body>
</html>