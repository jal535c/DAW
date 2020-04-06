<%-- 
    Document   : media
    Created on : 13-feb-2020, 9:46:51
    Author     : 
--%>

<%@page import="java.text.DecimalFormat"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
  </head>
  <body>
    <%
      double n1 = Double.valueOf(request.getParameter("nota1"));
      double n2 = Double.parseDouble(request.getParameter("nota2"));
      double n3 = Double.parseDouble(request.getParameter("nota3"));
      
      double resul=(n1+n2+n3)/3;
      
      //DecimalFormat decf = new DecimalFormat("0.00");
      //out.print("La media es "+decf.format(resul));
    %>
    
    <h1><% out.print("La media es: "+String.format("%.2f", resul)); %></h1>
  </body>
</html>
