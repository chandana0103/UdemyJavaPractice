<%@page language="java"%>

<html>
    <head>
        <link rel="stylesheet" type="text/css" href="style.css">
    </head>
    <body>
        <h2>hello world by JSP</h2>
        
        <h2>My Caluculator</h2>
        <!-- to read form  and to add 2 numbers and a submit button

        <form action="add">
            <label for="n1">Enter 1st number :</label>
            <input type="text" id="n1" name="n1"><br>
            <label for="n2">Enter 2nd number :</label>
            <input type="text" id="n2" name="n2"><br>
            <input type="submit" value="Submit">
        </form>-->

        <!-- form to add a person id and name -->
        <form action="addPerson">
            <label for="pid">Enter Id :</label>
            <input type="text" id="pid" name="pid"><br>
            <label for="pname">Enter Name :</label>
            <input type="text" id="pname" name="pname"><br>
            <input type="submit" value="Submit">
        </form>

    </body>
</html>