package Laborator04.TaskBooksAndAuthors;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Author ionCreanga = new Author("Ion Creanga", "ion.creanga@gmail.com", 'M');
        Author petreIspirescu = new Author("Petre Ispirescu", "petre@gmail.com", 'M');
        Author ileanaCozanziana = new Author("Ileana Cosanziana", "ileana@gmail.com", 'F');


        Page page10 = new Page(10, 250, "This is page number 10");
        Page page55 = new Page(55, 230, "This is page number 55");

        List<Author> authorList = new ArrayList<>();
        authorList.add(ionCreanga);
        Book book1 = new Book("Harap Alb", authorList, 90, 0);

        List<Author> authorList2 = new ArrayList<>();
        authorList2.add(ionCreanga);
        authorList2.add(petreIspirescu);
        authorList2.add(ileanaCozanziana);
        Book book2 = new Book("Basme", authorList2, 160, 8);

        System.out.println(book1);
        System.out.println(book2);

        book1.addPages(page10);
        book1.addPages(page55);


        book1.addAuthor(ileanaCozanziana);
        System.out.println(book1);

        //failure to add the same author
        System.out.println();
        book1.addAuthor(ionCreanga);

        //failure to add a page with a number that exists
        System.out.println();
        book1.addPages(page10);

    }

}
