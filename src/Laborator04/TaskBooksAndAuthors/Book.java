package Laborator04.TaskBooksAndAuthors;

import java.util.ArrayList;
import java.util.List;

public class Book
{
    private String name;
    private List<Author> authors = new ArrayList<>();
    private List<Page> pages = new ArrayList<>();
    private double price;
    private int quantity;

    public Book(String name, double price) {
        this.name = name;
      //  this.authors = authors;
        this.price = price;
       // this.pages =pages;

    }

    public Book(String name, List<Author> authors, double price, int quantity) {
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public List<Author> getAuthors() {
        return authors;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public List<Page> getPages() {
        return pages;
    }

    public void setPages(List<Page> pages) {
        this.pages = pages;
    }

    public void addAuthor(Author author)
    {
        for (Author a:authors)
        {
            if (a.getName().equals(author.getName()))
            {
                System.out.println("This author is already set for this book");
                return;
            }
        }
        this.authors.add(author);
    }

    public void addPages(Page p)
    {
        for (Page page:pages)
        {
            if (page.getPageNumber()==p.getPageNumber())
            {
                System.out.println("This book has already a page " + p.getPageNumber());
                return;
            }
        }
        pages.add(p);
    }

    @Override
    public String toString() {
        return "\n***************************************************" +
                "\nBook\n{" +
                "name='" + name + '\'' +
                ",\n authors = " + getAuthorNames() +
                ",\n price = " + price +
                ",\n quantity = " + quantity +
                ",\n Pages= "+ getPages()+
                '}';
    }

    public String getAuthorNames()
    {
        return authors.toString();
    }
}
