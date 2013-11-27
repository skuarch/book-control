package org.book.control;

import java.io.IOException;
import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author skuarch
 */
@WebServlet(urlPatterns = "/AddBookServlet")
public class AddBookServlet extends HttpServlet{

    @Inject 
    private BookEJB bookEJB;
    
    //==========================================================================
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    
        response.getWriter().println("ok");
        
        Book book = new Book();
        book.setIsbn(request.getParameter("isbn"));
        book.setYear(Integer.parseInt(request.getParameter("year")));
        book.setAuthor(request.getParameter("author"));
        book.setAuthor(request.getParameter("title"));       
        
        bookEJB.addBook(book);
        
    } // end doPost   
    
} // end class
