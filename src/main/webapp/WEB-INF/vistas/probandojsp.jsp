<%--
  Created by IntelliJ IDEA.
  User: pcfab
  Date: 18/7/2023
  Time: 00:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page import="java.util.ArrayList" %>
<html>
<head>
    <title>Probando 1, 2, 3....</title>
</head>
<body>
<header>
    <h1>Probando JSP</h1>
</header>
<main>
    <section>
        <%
   double num = Double.parseDouble(request.getAttribute("numeroRandom").toString());
    //double num = Math.random();
        if(num > 0.95){
        %>
      <h2>Tendras un dia de Suerte</h2><p>(<%= num %>)</p>
        <% }else{
            %>
        <h2>Segui participando</h2><p>(<%= num %>)</p>
        <%}
        %>
    </section>

</main>
</body>
</html>
