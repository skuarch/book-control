<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        hay x libros en el sistema ${bookList.books.size()}
        
        <br/>
        
        <a href="addBook.html">
            addBook
        </a>

        <br/>

        <a href="faces/bookList.xhtml">
            view books
        </a>

    </body>
</html>
