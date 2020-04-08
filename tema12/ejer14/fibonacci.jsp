<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
  </head>
  <body>
    
    <%
      int numero = Integer.parseInt(request.getParameter("numero"));
      
      long primero=0;
      long segundo=1;
      long suma;
      
      switch (numero) {
        case 1:
          out.print("0");
          break;
        case 2:
          out.print("0 1");
          break;
        default:
          out.print("0 1");
          for (int i=2; i<numero; i++) {
            suma=primero+segundo;
            out.print(" "+suma);
            primero=segundo;
            segundo=suma;
          }
      }      
    %>
    
  </body>
</html>
