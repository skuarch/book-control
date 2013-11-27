package org.book.control;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

/**
 *
 * @author skuarch
 */
@Entity
public class Book {

    @Id
    @Column
    private String isbn;
    @Column
    private String title;
    @Column
    private String author;
    @Column(name = "anio")
    @Max(2013)
    @Min(1000)
    private int year;

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
} // end class