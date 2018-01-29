<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="">
    <select>
        <option value="1"></option>
    </select>
</form>
<table>
    <tr>
        <th>电子文档</th>
    </tr>
    <tr>
        <th>文档编号</th>
        <th>文档名称</th>
        <th>文档摘要</th>
        <th>上传人</th>
        <th>上传时间</th>
        <th>操作</th>
    </tr>
    <s:iterator value="edocEntryList">
        <tr>
            <td>${id}</td>
            <td>${title}</td>
            <td>${summary}</td>
            <td>${uploadUser}</td>
            <td>${createDate}</td>
            <td><a href="<s:url value="MyNewsComment"><s:param name="nid" value="id"/></s:url>">修改</a><a href="<s:url value="deleteNewsDetail"><s:param name="nid" value="id"/></s:url>">删除</a></td>
        </tr>
    </s:iterator>
</table>
</body>
</html>
