<%@page language="java"%>

<html>
    <head>
        <link rel="stylesheet" type="text/css" href="style.css">
    </head>
    <body>
        <!-- result page -->

        <h2>Result is ::</h2>
       <!-- <h2> Result = <%= session.getAttribute("result") %></h2>
       <h2>Result of adding 2 numbers = ${result}</h2>  it will directly search for session object-->
    
       <h2>welcome web page to add person</h2>
       <p>${person}</p>

        <p>Welcome to Spring MVC and JSP</p>

        <p>Welcome to ${course} world</p><!--give course as model attribute-->

      <!--<p>${person1}</p> to represent particular name in model attribute-->
    </body>
</html>