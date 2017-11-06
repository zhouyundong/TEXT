<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%String path=request.getContextPath(); %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>新闻显示</title>
<link rel="stylesheet" href="<%=path%>/js/index.css">
<script type="text/javascript"src="<%=path%>/js/jquery-1.8.2.min.js"></script>
   <script type="text/javascript">
   
   function add(){
	   location.href="<%=path%>/toadd"
   }
       function delece(id){
    	    alert(id);
    	    location.href="<%=path%>/del?id="+id;
       }
       function update(id){
    	   alert(id);
    	    location.href="<%=path%>/toedit?id="+id;
       }
       
   </script>
</head>
<body>  
        <center>
            <form action="<%=path%>/list">
               <h2 style="color: red">笔记管理系统</h2>
               <input type="text" name="titile">
               <input type="submit" value="搜索">
               <input type="button" value="写笔记" onclick="add()">
            </form>
        </center>
        <form>
      <table>
          <tr>
             <td>标题</td>
             <td>内容</td>
             <td>日期</td>
             <td>操作</td>
          </tr>
          <c:forEach items="${list}" var="n">
             <tr>
               <td>${n.titile}</td>
               <td>${n.roo}</td>
               <td>${n.data}</td>
               <td>
                  <input type="button" value="删除" onclick="delece(${n.id})">
                  <input type="button" value="修改" onclick="update(${n.id})">
               </td>
             </tr>
          </c:forEach>
      </table>
      </form>
</body>
</html>