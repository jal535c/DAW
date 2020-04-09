<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Menú</title>
    <link rel="stylesheet" href="css/estilos.css">
  </head>
  <body>

    <%
      
      String[] imagenes = {"hamburguesa", "pasta", "pizza", "quinoa", "agua", "cerveza", "refresco"};
      String[] descripciones = {"Hamburguesa vegetariana", "Pasta al pesto", "Pizza caprese", "Quinoa con verdura", "Agua", "Cerveza", "Refresco"};
    
    %>

    <h1>Pide la comida más sana a domicilio</h1>

    <form action="pedido.jsp" method="get">
      <div class="fotos">
      <%
        for (int i=0; i<4; i++) {   //fila de las comidas
      %>
      
        <div>
          <img src="imagenes/<%= imagenes[i]%>.png" width="200px"><br><br>
          <% out.print(descripciones[i]); %><br><br>
          <input type="number" name="comida<%= i%>" value="0" min="0">
        </div>

      <%
        }
      %>
      </div>

      <div class="fotos">
      <%
        for (int i=4; i<7; i++) {   //fila de las bebidas
      %>
        
        <div>
          <img src="imagenes/<%= imagenes[i]%>.png" width="100px"><br><br>
          <% out.print(descripciones[i]); %><br><br>
          <input type="number" name="comida<%= i%>" value="0" min="0">
        </div>
        
      <%
        }   
      %>
      </div>
      
      <br><br>
      
      <div class="fotos">
        <button type="submit">Hacer pedido</button>
      </div>       
    </form>

  </body>
</html>
