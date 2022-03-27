<%@ page import="ru.home.servlet.model.Cat" %>
<%@ page import ="java.util.List" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Cat</title>
</head>
<body>
    <h1>Cat</h1>
    <p>Name: ${cat.name}</p>
    <p>Age: ${cat.age}</p>
    <p>Children</p>
    <hr>
    <ul>
        <% if (((Cat)request.getAttribute("cat")).getChildren() != null) {%>
        <% for (Cat value : ((Cat) request.getAttribute("cat")).getChildren()) { %>
        <li>name: <%=value.getName()%>; age: <%=value.getAge()%></li>
        <% } } %>
    </ul>
</body>
</html>