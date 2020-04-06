<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
    <link href="estilos.css" rel="stylesheet">
  </head>
  <body>
    <h1>Juego El Trile</h1>
    
    <%
      String salida="";
      int cubilete = Integer.parseInt(request.getParameter("cubilete"));
      int posicionBola = (int)(Math.random()*3);
            
      String[] nombres = { "cubilete_sin_bola.png", "cubilete_sin_bola.png", "cubilete_sin_bola.png" };
      nombres[posicionBola]="cubilete_con_bola.png";
      
      if (cubilete==posicionBola) {
        salida="Enhorabuena! Has encontrado la bolita";
      } else {
        salida="Lo siento. Has perdido";
      }
    %>
    
    <table>
      <tr>
        <td><img src="<% out.print(nombres[0]); %>"></td>
        <td><img src="<% out.print(nombres[1]); %>"></td>
        <td><img src="<% out.print(nombres[2]); %>"></td>
      </tr>
    </table>
    
    <p><% out.print(salida); %></p>
    
    <p><a href="index.jsp"><button>Volver a jugar</button></a></p>
    
  </body>
</html>
