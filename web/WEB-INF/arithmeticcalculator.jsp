

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Arithmetic Calculator Page</title>
    </head>
    <body>
        <h1>Arithmetic Calculator</h1>

        <form action="arithmetic" method="post">
            First:  <input type="text" name="first" value="${firstn}">
            <br><br>
            Second: <input type="text" name="second" value="${lastn}">
            <br>
            <br>
            <input type="submit" value="+" name="btn">
            <input type="submit" value="-" name="btn">
            <input type="submit" value="*" name="btn">
            <input type="submit" value="/" name="btn">

        </form>
    </div>
    <h2>Result: ${finalresult} </h2>
    <br>
    <a href="/Week2Lab_Calculators/age"> Age Calculator
</body>
</html>
