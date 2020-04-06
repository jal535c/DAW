<%-- 
    Document   : index
    Created on : 24-feb-2020, 16:59:24
    Author     : 
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
    <link href="estilos.css" rel="stylesheet">
  </head>
  <body>
    <div id="principal">
      <h1>Genera 100 numeros aleatorios</h1>
      <%
        int num;
      
        for (int i=0; i<100; i++) {
          num = (int)(Math.random()*200+1);
          if (esPrimo(num)) {
            out.print("<span class=\"rojo\">" + num + "</span> ");    //div genera salto, necesita span y despues espacio
          } else {
            out.print(num+" ");
          }        
        }
      %>
    </div>
  </body>
</html>


<%!
  public static boolean esPrimo(int num) {
    boolean primo=true;
    
    for (int i=2; i<num && primo==true; i++) {
      if (num%i == 0) {
        primo=false;
      }
    }
    
    return primo;
  }
%>
