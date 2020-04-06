<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Piramide</title>
  </head>
  <body>
    <%
      int altura = Integer.parseInt(request.getParameter("altura"));
      int ancho = 1;
      int blancos = altura-1;

      for (int fila=0; fila<altura; fila++) {

        for (int i=0; i<blancos; i++) {
          out.print("<img src=\"blanco.png\">");
        }
        blancos--;
        
        for (int i=0; i<ancho; i++) {
          out.print("<img src=\"ladrillo.png\">");
        }
        ancho+=2;
        
        out.println("<br>");
        
      }
     %>
  </body>
</html>
