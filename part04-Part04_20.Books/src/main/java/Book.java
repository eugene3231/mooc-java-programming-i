/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Book {
    private String title;
    private int pages;
    private String pubYear;
    
    public Book(String title, int pages, String pubYear) {
        this.title = title;
        this.pages = pages;
        this.pubYear = pubYear;
    }
    
    public String toString() {
        return this.title + ", " + this.pages + " pages, " + this.pubYear;
    }
    
    public String getName() {
        return this.title;
    }
}
