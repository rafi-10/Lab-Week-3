package com.company;

public class Task_2 {

    public static void main(String[] args) {
        Book book1 = new Book();
        Book book2 = new Book();
        Book book3 = new Book();

        book1.book_name = "book1";
        book1.title_1 = "JAVA for Beginners ";
        book1.edition = 3;
        book1.title_2 = "rd edition";
        book1.author = "By Prof. David";
        book1.total_pages = "537 pages";
        book1.price = "299tk";
        book1.publication = "Easy Coding Publications";
        book1.showinfo();

        book2.book_name = "book2";
        book2.title_1 = "Omega Point ";
        book2.edition = 12;
        book2.title_2 = "th edition ";
        book2.author = "By Humayun Ahmed";
        book2.total_pages = "122 pages";
        book2.price = "128tk";
        book2.publication = "Shomoy Prokashoni";
        book2.showinfo();

        book3.book_name = "book3";
        book3.title_1 = "Digital Fortress ";
        book3.edition = 5;
        book3.title_2 = "th edition ";
        book3.author = "By Dan Brown";
        book3.total_pages = "356 pages";
        book3.price = "520 tk";
        book3.publication = "St. Martin Press";
        book3.showinfo();


        System.out.println("Memory of book1 = " + book1);
        System.out.println("Memory of book2 = " + book2);
        System.out.println("Memory of book3 = " + book3);
        System.out.println();

        book1 = book3;

        book1.edition = 1;

        book3.showinfo();

        System.out.println("Memory of book1 = " + book1);
        System.out.println("Memory of book2 = " + book2);
        System.out.println("Memory of book3 = " + book3);
        System.out.println();

    }
}
 class Book {
    String book_name, title_1,title_2,author,total_pages,price,publication;
    int edition;

    void showinfo()
    {
        System.out.println(book_name);
        System.out.println(title_1 + edition + title_2);
        System.out.println(author);
        System.out.println(total_pages);
        System.out.println("Prices: "+ price);
        System.out.println(publication);
        System.out.println();
    }
}