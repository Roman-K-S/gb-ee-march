<%@ page import="ru.home.servlet.model.Product" %>
<%@ page import ="java.util.List" %>
<%--
  Created by IntelliJ IDEA.
  User: roman_k
  Date: 26.03.2022
  Time: 18:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Product</title>
</head>
<body>
<ul>
    <% for (Product value : (List<Product>)(request.getAttribute("product"))) { %>
    <li>id: <%=value.getId()%>; title: <%=value.getTitle()%>; cost: <%=value.getCost()%></li>
    <% } %>
</ul>

</body>
</html>
