<%-- 
    Document   : index
    Created on : Sep 22, 2023, 12:50:17 PM
    Author     : PC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="styles/style.css" rel="stylesheet">
        <title>JSP Page</title>
    </head>
    <body>
        <section align="center">
        <jsp:include page="styles/header.jsp" ></jsp:include>
        <h1>Triangle Calculator</h1>
        <form action="TriangleServlet" method="POST">
            
            <label for="sidea">Side a</label><br>
            <input type="text" id="sidea" name="sidea"><br>

            <label for="sideb">Side b</label><br>
            <input type="text" id="sideb" name="sideb"><br>

            <label for="sidec">Side c</label><br>
            <input type="text" id="sidec" name="sidec"><br>
            <br>

            <label for="operator">Operator </label>
            <select id="operator" name="operator">
              <option value="perimeter" selected>Perimeter</option>
              <option value="area">Area</option>
            </select>
            <br>
            <input type="text"value= ${result}><br>
        <br>
            <input type="submit"  value="Compute">
  
        </form>
            <jsp:include page="styles/footer.jsp" ></jsp:include>
        </section>
    </body>
</html>
