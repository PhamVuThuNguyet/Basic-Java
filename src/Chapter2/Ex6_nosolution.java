package Chapter2;

import java.util.Scanner;

class Company{
    String name, address;
    float cost, income, benefit;

    public void insertInfo(){
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter name: ");
        this.name = kb.nextLine();
        System.out.println("Enter address: ");
        this.address = kb.nextLine();
        System.out.println("Enter cost: ");
        this.cost = kb.nextFloat();
        System.out.println("Enter income: ");
        this.income = kb.nextFloat();
        this.benefit = this.benefitCal();
    }

    public float benefitCal(){
        return this.income - this.cost;
    }

    public void display(){
        System.out.println("Name: " + this.name);
        System.out.println("Address: " + this.address);
        System.out.println("Cost: " + this.cost);
        System.out.println("Income: " + this.income);
        System.out.println("Benefit: " + this.benefit);
    }

    public Company() {
    }

}

public class Ex6_nosolution {
    public static void main(String[] args) {
        Company company = new Company();
        company.insertInfo();
        company.display();
    }
}
