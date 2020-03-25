<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>新闻列表</title>
<LINK href="resources/css/css.css" type="text/css" rel="stylesheet">
<script src="resource/jquery-3.2.1.js"></script>
</head>
<body>
<form action="/goods" method="post">
 关键词:<input type="title" value="${list.title }">
 排序:<select>
    <option value="权重"></option>
    <option value="倒序"></option>
 </select>
 <button value="submit">提交</button>
</form>
  <table>
    <tr>
      <td>ID</td>
      <td>新闻标题</td>
      <td>链接地址</td>
      <td>权重</td>
      <td>发布时间</td>
    </tr>
  </table>
  <c:forEach items="${info.list }" var="n" varStatus="count">
    <tr>
       <td>${count.count+page.startRow-1 }</td>
       <td>${n.title }</td>
       <td>${n.url}</td>
       <td>${n.score}</td>
       <td>${n.created}</td>
    </tr>
  </c:forEach>
</body>
<script type="text/javascript">
  function gopage(pageNum){
	  location.href="pageNum"+page;
  }
</script>
</html>