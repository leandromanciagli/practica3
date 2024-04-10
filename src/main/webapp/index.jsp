<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8">
    <title>Redirecciones</title>
  </head>
  <body>
    <h1>Redirecciones</h1>
    <form action="controla" method="GET">
      <label for="name">Servlet Hola</label>
      <input type="radio" name="redireccion" value="1" />
      <br>
      <label for="name">Productos</label>
      <input type="radio" name="redireccion" value="2" />
      <br>
      <label for="name">Google</label>
      <input type="radio" name="redireccion" value="3" />
      <br>
      <label for="name">Ingrese su nombre</label>
      <input type="text" name="name" id="name">
      <br>
      <input type="submit" value="Redireccionar">
    </form>
  </body>
</html>