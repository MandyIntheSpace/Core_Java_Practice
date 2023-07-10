package Abstraction;

import java.util.Scanner;

abstract class Employee {
    abstract void accept();

    abstract void display();

    Scanner sc = new Scanner(System.in);
}

class Manager extends Employee {
    int id;
    String name;
    double phoneNumber;

    @Override
    void accept() {
        System.out.println("Enter id, name and phone number of the manager");
        id = sc.nextInt();
        sc.nextLine();
        name = sc.nextLine();
        phoneNumber = sc.nextDouble();
    }

    @Override
    void display() {
        System.out.println("Manager id: " + id + "Manager name: " + name +
                "Manager phone number: " + phoneNumber);
    }

}

class Worker extends Employee {
    int workerid;
    String workerName;

    @Override
    void accept() {
        System.out.println("Enter worker id and name");
        workerid = sc.nextInt();
        sc.nextLine();
        workerName = sc.nextLine();
    }

    @Override
    void display() {
        System.out.println("Worker id: " + workerid + "Worker name: " + workerName);
    }
}

class Test {
    public static void main(String[] args) {
        Manager manager = new Manager();
        manager.accept();
        manager.display();

        Worker worker = new Worker();
        worker.accept();
        worker.display();
    }
}
