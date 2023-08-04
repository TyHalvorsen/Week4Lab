<%-- 
    Document   : EditNote
    Created on : 9-Jun-2023, 12:59:30 PM
    Author     : TyHalvorsen
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Simple Note Keeper</title>
    </head>
    <body>
        <h1>Simple Note Keeper</h1>

        <h2>Edit Note</h2>

        <form method ="post" action="note">
            <div>
                <label for="title">Title</label>
                <input type="text" name="title">
                <br>
                <label for="title">Content</label>
                <input type="text" name="content" rows="60" cols="60">
                <br>
                <input type="submit" value="Save">  
            </div>
        </form>
    </body>
</html>