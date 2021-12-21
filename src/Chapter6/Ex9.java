package Chapter6;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Student {
    private String name;
    private int age;
    private double math, phys, chem, average;

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

    public double getMath() {
        return math;
    }

    public void setMath(double math) {
        this.math = math;
    }

    public double getPhys() {
        return phys;
    }

    public void setPhys(double phys) {
        this.phys = phys;
    }

    public double getChem() {
        return chem;
    }

    public void setChem(double chem) {
        this.chem = chem;
    }

    public double getAverage() {
        return average;
    }

    public void setAverage(double average) {
        this.average = average;
    }

    public Student() {
    }

    public void Input() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name: ");
        this.name = scanner.nextLine();
        System.out.println("Enter age: ");
        this.age = scanner.nextInt();
        System.out.println("Enter math grade: ");
        this.math = scanner.nextDouble();
        System.out.println("Enter physics grade: ");
        this.phys = scanner.nextDouble();
        System.out.println("Enter chemistry grade: ");
        this.chem = scanner.nextDouble();
        this.average = (this.math + this.phys + this.chem) / 3;
    }

    public String toString() {
        return ("Name: " + this.name + "; Age: " + this.age + "; Average: " + this.average);
    }
}

public class Ex9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of students: ");
        int n = scanner.nextInt();
        Student[] students = new Student[n];
        for (int i = 0; i < n; i++) {
            Student student = new Student();
            student.Input();
            students[i] = student;
        }

        Arrays.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return (int) (o1.getAverage() - o2.getAverage());
            }
        });
        double max_math = 0.0;
        Student student2 = null;
        for (int i = 0; i < n; i++) {
            if (students[i].getMath() > max_math) {
                max_math = students[i].getMath();
                student2 = students[i];
            }
        }
        System.out.println(student2);

//        Arrays.sort(students, new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
////                return (int) (o1.getMath() - o2.getMath());
//                return (int) (o2.getMath() - o1.getMath());
//            }
//        });
//        System.out.println(students[0]);


//        Arrays.stream(students).filter(new Predicate<Student>() {
//            @Override
//            public boolean test(Student student) {
//                return student.getAge() > 23;
//            }
//        });

        // lambda expression: {para} -> {do sth}
        Stream<Student> s = Arrays.stream(students).filter(student -> student.getAge() > 23);
        List<Student> temp = s.collect(Collectors.toList());
        temp.forEach(System.out::println);

//        Arrays.stream(students).filter(new Predicate<Student>() {
//            @Override
//            public boolean test(Student student) {
//                return student.getName().split(" ")[0].equals("Huynh");
//            }
//        });

        Stream<Student> s1 = Arrays.stream(students).filter(student -> student.getName().split(" ")[0].equals("Huynh"));
        List<Student> temp1 = s.collect(Collectors.toList());
        temp.forEach(System.out::println);

//        Vector<Student> studentVector = new Vector<>();
//        for (int i = 0; i < n; i++) {
//            Student student = new Student();
//            student.Input();
//            studentVector.add(student);
//        }
//
//        Collections.sort(studentVector, new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                return 0;
//            }
//        });
//
//        studentVector.stream().filter()
    }
}
