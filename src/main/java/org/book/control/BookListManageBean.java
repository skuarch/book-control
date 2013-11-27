package org.book.control;

import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author skuarch
 */
@Named("bookList")
@RequestScoped
public class BookListManageBean {
   
    @Inject
    private BookEJB bookEJB;
    
    public List<Book> getBooks(){
        return bookEJB.getBook();
    }
    
    public void removeBook(Book book){
        bookEJB.removeBook(book);
    }
    
}
