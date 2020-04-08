<%-- 
    Document   : juego
    Created on : 03-mar-2020, 9:15:30
    Author     : 
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
    <link rel="stylesheet" href="css/estilos.css">
  </head>
  <body>
    
    <h1>Apuesta y gana</h1>
    <div id="principal">
    
    <%
      int dinero = Integer.parseInt(request.getParameter("dinero"));
      
      int jugada = (int)(Math.random()*3);
      String[] imagen = { "gatochinosuerte.gif", "mediolimon.jpg", "calavera.png" };
      String[] mensaje = { "Ha doblado el dinero", "Ha perdido la mitad", "Lo siento, ha perdido" };
        
      if (jugada == 0) {  //Gato chino: dobla el dinero
        dinero *= 2;
      } else if (jugada == 1) {   //Medio limon: se pierde la mitad
        dinero /= 2;
      } else {    //Calavera: pierde
        dinero = 0;
      }
    %>
      

    <p> 
    <img src="img/<% out.print(imagen[jugada]); %> "><br>
    <h2><%= mensaje[jugada] %></h2> 
    </p>
    
        
    <%
      if ((jugada == 0) || (jugada == 1)) {   //El jugador puede seguir jugando o plantarse
    %>
    
      <h2>Ahora tiene <%= dinero %> €</h2>
      <form method="post" action="juego.jsp">
        <input type="hidden" name="dinero" value="<%= dinero %>">
        <input type="submit" value="Sigo jugando">
      </form>

      <form method="post" action="fin.jsp">
        <input type="hidden" name="dinero" value="<%= dinero %>">
        <input type="submit" value="Me planto">
      </form> 
    
    <%
      } else {
    %>
    
      <form method="post" action="index.jsp">
        <input type="submit" value="Volver a jugar">
      </form>
    
    <%
      } // if     
    %>
    
    </div>
    
  </body>
</html>
