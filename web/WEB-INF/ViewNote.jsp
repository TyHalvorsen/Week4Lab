<%-- 
    Document   : ViewNote
    Created on : 9-Jun-2023, 12:59:43 PM
    Author     : octov
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Note Keeper</title>
    </head>
    <body>
        <h1>Simple Note Keeper</h1>
        
           <h2>View Note </h2>
           <div>
               <label for="title">Title</label>
               <p name="title">${newNote.title} </p>
               <label for="title">Content</label>
               <p name="title">${newNote.content} </p>
               <a href="/EditNote.jsp" name="link">Edit</a>

           </div>
    </body>
</html>