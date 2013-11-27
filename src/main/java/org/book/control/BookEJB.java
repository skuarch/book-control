package org.book.control;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author skuarch
 */
@Stateless
public class BookEJB {
    
    @PersistenceContext
    private EntityManager em;
    public void addBook(Book book){   
        
        em.persist(book);        
        System.out.println("book saved:");
        
    }
    
    
    public List<Book> getBook(){    
        return em.createQuery("Select b from Book b").getResultList();        
    }
    
    
    public void removeBook(Book book){
        book = em.merge(book);
        em.remove(book);
    }
    
} // end class
