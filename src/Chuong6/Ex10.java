package Chuong6;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.util.stream.Collectors;

class Person{
    private String name;
    private String DOB;
    private double hesoluong;

    public Person() {
    }

    public Person(String name, String DOB, double hesoluong) {
        this.name = name;
        this.DOB = DOB;
        this.hesoluong = hesoluong;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDOB() {
        return DOB;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    public double getHesoluong() {
        return hesoluong;
    }

    public void setHesoluong(double hesoluong) {
        this.hesoluong = hesoluong;
    }

    public void Input(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name: ");
        this.name = scanner.nextLine();
        System.out.println("Enter DOB: ");
        this.DOB = scanner.nextLine();
        System.out.println("Enter hesoluong: ");
        this.hesoluong = scanner.nextDouble();
        scanner.nextLine();
    }

    public String toString(){
        return ("Name: " + this.name + "\nDOB: " + this.DOB + "\nhesoluong: " + this.hesoluong);
    }
}

class GiamDoc extends Person{
    private double hesochuc;

    public GiamDoc() {
        super();
    }

    public GiamDoc(String name, String DOB, double hesoluong, double hesochuc) {
        super(name, DOB, hesoluong);
        this.hesochuc = hesochuc;
    }

    public double getHesochuc() {
        return hesochuc;
    }

    public void setHesochuc(double hesochuc) {
        this.hesochuc = hesochuc;
    }

    public void Input(){
        super.Input();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter hesochuc: ");
        this.hesochuc = scanner.nextDouble();
        scanner.nextLine();
    }

    public String toString(){
        return (super.toString() + "\nhesochuc: " + this.hesochuc);
    }
}

class QuanDoc extends Person{
    private int no_employee;

    public QuanDoc() {
        super();
    }

    public QuanDoc(String name, String DOB, double hesoluong, int no_employee) {
        super(name, DOB, hesoluong);
        this.no_employee = no_employee;
    }

    public int getNo_employee() {
        return no_employee;
    }

    public void setNo_employee(int no_employee) {
        this.no_employee = no_employee;
    }

    public void Input(){
        super.Input();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter no_employee: ");
        this.no_employee = scanner.nextInt();
        scanner.nextLine();
    }

    public String toString(){
        return (super.toString() + "\nno_employee: " + this.no_employee);
    }
}

class NhanVien extends Person{
    private String tendonvi;

    public NhanVien() {
        super();
    }

    public NhanVien(String name, String DOB, double hesoluong, String tendonvi) {
        super(name, DOB, hesoluong);
        this.tendonvi = tendonvi;
    }

    public String getTendonvi() {
        return tendonvi;
    }

    public void setTendonvi(String tendonvi) {
        this.tendonvi = tendonvi;
    }

    public void Input(){
        super.Input();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter tendonvi: ");
        this.tendonvi = scanner.nextLine();
    }

    public String toString(){
        return (super.toString() + "\ntendonvi: " + this.tendonvi);
    }
}

public class Ex10 {
    public static void main(String[] args) {
        System.out.println("Enter number of employee: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Person[] nhansu = new Person[3 + n];
        GiamDoc giamDoc = new GiamDoc("Giamdoc1", "1/12/1", 1.5, 2);
        QuanDoc quanDoc1 = new QuanDoc("Quandoc1", "1/1/1", 1.2, 10);
        QuanDoc quanDoc2 = new QuanDoc("Quandoc2", "1/12/1", 1.1, 7);
        nhansu[0] = giamDoc;
        nhansu[1] = quanDoc1;
        nhansu[2] = quanDoc2;
        for(int i = 0; i < n; i++){
            NhanVien nhanVien = new NhanVien();
            nhanVien.Input();
            nhansu[3 + i] = nhanVien;
        }
        // sort desc
        Arrays.sort(nhansu, new Comparator<Person>() { //-1 ; 0; 1
            @Override
            public int compare(Person o1, Person o2) {
                double tongluong_1 = o1.getHesoluong();
                double tongluong_2 = o2.getHesoluong();
                if(o1.getClass() == GiamDoc.class){
                    tongluong_1 += ((GiamDoc) o1).getHesochuc();
                }
                tongluong_1 *= 1150000;

                if(o2.getClass() == GiamDoc.class){
                    tongluong_2 += ((GiamDoc) o2).getHesochuc();
                }
                tongluong_2 *= 1150000;
                return (int)(tongluong_2 - tongluong_1);
            }
        });
        System.out.println(nhansu[0]);

        // dd/mm/yyyy

        // func(Person t){ t.getDOB == "12" }
        // d/m/y d - m - y
        // d/m/y d - m - y
        Arrays.stream(nhansu).filter(t->t.getDOB().split("/")[1].equals("12"))
                .collect(Collectors.toList()).forEach(System.out::println);

    }
}
