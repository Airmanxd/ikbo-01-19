
package ru.mirea.lab1;

public class Book {
    int length;
    String title;
    String author;
    public Book(int length, String title, String author)
    {
        this.length = length;
        this.title = title;
        this.author = author;
        System.out.println("Created an object of type Book, length: " + this.length +
                " title: " + this.title + "author: " + this.author);
    }
    public int get_length()
    {
        return this.length;
    }
    public String get_title()
    {
        return this.title;
    }
    public String get_author()
    {
        return this.author;
    }
}
