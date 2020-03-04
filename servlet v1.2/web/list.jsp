<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: Alex
  Date: 16.03.2020
  Time: 13:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>List</title>
    <style>
        body{
            background-color: #FF9B73;
            text-align: center;
            display: block;
        }
        .wrapper{
            color: black;
            font-size: medium;
            margin: auto;
            height: 100%;
            padding: 20px;
            align-content: center;
            text-align: center;
        }
        li{
            background-color: #FF7640;
            border: none;
            border-radius: 55px;
            font-size: 15px;
            list-style-type: none;
            margin-bottom: 5px;
            margin-top: 5px;
            padding-top: 7px;
            padding-bottom: 7px;
        }
        lo{
            padding: 7px;
            margin-left: 20px;
            border: 1px solid black;
            border-radius: 55px;
        }
        button{
            border: none;
            background-color: #00AC6B;
            border-radius: 55px;
            padding: 10px;
        }
        button:hover{
            background-color: #20815D;
        }
    </style>
</head>
<body>
    <label>
        List of users
    </label>
    <div class="wrapper">
    <%
        List<String> names = (List<String>) request.getAttribute("userNames");
        List<String> passwords = (List<String>) request.getAttribute("userPasswords");
        if(names != null && !names.isEmpty() && passwords != null && !passwords.isEmpty())
        {
            for(int i = 0; i < names.size() && i < passwords.size(); i++)
            {
                out.println("<li> <lo>name: " + names.get(i)  + "</lo><lo> password: " + passwords.get(i) + "</lo></li>");
            }
        }
    %>
        <button onclick="location.href = '/'">Back</button>
    </div>
</body>
</html>
