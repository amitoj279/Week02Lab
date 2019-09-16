<%-- 
    Document   : newjspagecalculator
    Created on : Sep 13, 2019, 12:10:31 PM
    Author     : 794473
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Age Calculator Form</title>
    </head>
    <body>
        <h1>AGE CALCULATOR</h1>
        <div>
            <form action="age" method="post">
                Enter Your Age: <input type="text" name="age" value="${vage}">
                <br>
                <br>
                <input type="submit" value="Age Next Birthday">

            </form>
        </div>

        <h2>${message}${nextage}</h2>
        <br>
        <a href="/Week2Lab_Calculators/arithmetic"> Arithmetic Calculator
    </body>
</html>
