package Encapsulation;

class f1soft {
    private int empid;
    private String name;
    private int age;

    public int getEmpid() { // Getter Method
        return empid;
    }

    public String getName() { // Getter Method
        return name;
    }

    public int getAge() { // Getter Method
        return age;
    }

    public void setEmpid(int empid) { // Setter Method
        this.empid = empid;
    }

    public void setName(String name) { // Setter Method
        this.name = name;
    }

    public void setAge(int age) { // Setter Method
        this.age = age;
    }
}

public class Employee {
    public static void main(String[] args) {
        f1soft f1soft = new f1soft();
        f1soft.setEmpid(1);
        f1soft.setName("F1Soft Internationals");
        f1soft.setAge(40);

        System.out.println("Employee name: " + f1soft.getEmpid());
        System.out.println("Employee age: " + f1soft.getAge());
        System.out.println("Employee Name " + f1soft.getName());
    }
}
