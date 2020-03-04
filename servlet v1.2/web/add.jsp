<%--
  Created by IntelliJ IDEA.
  User: Alex
  Date: 15.03.2020
  Time: 20:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add User</title>
    <style>
        body{
            background-color: #FF4900;
        }
        .wrapper{
            color: black;
            font-size: medium;
            margin: auto;
            height: auto;
            padding: 20px;
            background-color: #FF9B73;
            align-content: center;
            text-align: center;
        }
        .inBox{
            margin: 15px auto  20px;
            display: block;
        }
        button{
            padding: 10px;
            border: none;
            border-radius: 55px;
            background-color: #00AF64;
        }

        button:hover{
            background-color: #218359;
        }

        input{
            border: none;
            padding: 10px;
            border-radius: 55px;
        }

        input:focus{
            padding-left: 20px;
            padding-right: 20px;
        }
    </style>
</head>
<body>
    <form method="post">
        <div class="wrapper">
            <label> UserName</label>
            <input class="inBox" type="text" name="UserName" required>
            <label> Password</label>
            <input class="inBox" type="password" name="UserPassword" required>
            <button input class="inBox" type="submit">Register</button>
            <label>
                <%
                    if (request.getParameter("result")!= null){
                        out.print(request.getParameter("result"));
                    }
                %>
            </label>
        </div>
    </form>
    <div>
        <button input class="inBox" onclick="location.href = '/'">back</button>
    </div>
</body>
</html>
