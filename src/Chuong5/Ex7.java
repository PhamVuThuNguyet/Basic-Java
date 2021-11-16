package Chuong5;

import java.util.Scanner;

class Person{
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public Person(){

    }

    public Person inputPerson(){
        Scanner scanner = new Scanner(System.in);
        String name = "";
        int age = 0;
        System.out.println("Enter name: ");
        name = scanner.nextLine();
        System.out.println("Enter age: ");
        age = scanner.nextInt();
        Person newPerson = new Person(name, age);
        return newPerson;
    }
}

class Book{
    private String title;
    private Person author;
    private int pages;
    private double price;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Person getAuthor() {
        return author;
    }

    public void setAuthor(Person author) {
        this.author = author;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Book(String title, Person author, int pages, double price){
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.price = price;
    }

    public Book(){

    }

    public Book Input(){
        Scanner scanner = new Scanner(System.in);
        String title;
        Person author;
        int pages;
        double price;
        System.out.println("Enter title: ");
        title = scanner.nextLine();
        System.out.println("Enter author: ");
        author = new Person().inputPerson();
        System.out.println("Enter pages:" );
        pages = scanner.nextInt();
        System.out.println("Enter price: ");
        price = scanner.nextDouble();

        Book book = new Book(title, author, pages, price);
        return book;
    }

    public void printDetails(){
        System.out.println("Title: " + this.title);
        System.out.println("Author: " + this.author.getName());
        System.out.println("Pages: " + this.pages);
        System.out.println("Price: " + this.price);
    }
}

public class Ex7 {
    public static void main(String[] args) {
        Book book = new Book().Input();
        book.printDetails();
    }
}
