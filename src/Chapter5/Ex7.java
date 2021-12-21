package Chapter5;

class Person{
    private String name;
    private int age;
    private String address;
    private int no_book;

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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getNo_book() {
        return no_book;
    }

    public void setNo_book(int no_book) {
        this.no_book = no_book;
    }

    public Person(String name, int age, String address, int no_book) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.no_book = no_book;
    }

}

class Book{
    private String title;
    private Person author;
    private double price;

    public Book(String title, Person author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public String toString(){
        return ("Title: " + this.title +
                "\nAuthor: " + this.author.getName());
    }

}

public class Ex7 {
    public static void main(String[] args) {
        Person person = new Person("Author1", 20, "DN", 2);
        String string = "Book1";
        Book book = new Book(string, person, 10.5);
        System.out.println(book);
    }
}
