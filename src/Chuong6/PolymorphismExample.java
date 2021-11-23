package Chuong6;

import java.util.*;

class Pet {
    private String name;
    private int age;
    private double price;

    public void makeSounds() {
    }

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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Pet() {
    }

    public Pet(String name, int age, double price) {
        this.name = name;
        this.age = age;
        this.price = price;
    }

    public String toString(){
        return ("Name: " + this.name + "; Age: " + this.age + "; Price: " + this.price);
    }
}

class Cats extends Pet {
    private int numberOfLegs;

    public void makeSounds() {
        System.out.println("Meo Meo");
    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    public void setNumberOfLegs(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }

    public Cats() {
    }

    public Cats(String name, int age, double price) {
        super(name, age, price);
    }

    public Cats(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }

    public Cats(String name, int age, double price, int numberOfLegs) {
        super(name, age, price);
        this.numberOfLegs = numberOfLegs;
    }

    public Cats Input() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name: ");
        String name = scanner.next();
        System.out.println("Age: ");
        int age = scanner.nextInt();
        System.out.println("Price: ");
        double price = scanner.nextDouble();
        System.out.println("Number Of Legs: ");
        int legs = scanner.nextInt();
        return new Cats(name, age, price, legs);
    }
}

class Dogs extends Pet {
    private double weight;

    public void makeSounds() {
        System.out.println("Gout Gout");
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Dogs() {
    }

    public Dogs(String name, int age, double price) {
        super(name, age, price);
    }

    public Dogs(String name, int age, double price, double weight) {
        super(name, age, price);
        this.weight = weight;
    }
}

public class PolymorphismExample {

    static double[] reverse(double[] initialArray, int size) {
        for (int i = 0; i < size / 2; i++) {
            double temp = initialArray[i];
            initialArray[i] = initialArray[size - i - 1];
            initialArray[size - i - 1] = temp;
        }
        return initialArray;
    }

    public static void main(String[] args) {

        int NoCats = 2;
        Pet[] A = new Pet[NoCats];
        for (int i = 0; i < NoCats; i++) {
            A[i] = new Cats().Input();
        }

        Arrays.sort(A, new Comparator<Pet>() {
            @Override
            public int compare(Pet first, Pet second) {
                if (first.getPrice() != second.getPrice()) {
                    return (int) (second.getPrice() - first.getPrice());
                }
                return first.getName().compareTo(second.getName());
            }
        });

        Arrays.stream(A).forEach(s -> System.out.println(s.toString()));
    }

}

