package STATIC_Polymorphism;

//static polymorphism known as method overloading
class Department {
    String mainDepartment(String name, String place) {
        return name + place;
    }

    String mainDepartment(String name, String place, String work) {
        return name + place + work;
    }

}

class Test {
    public static void main(String[] args) {
        Department department = new Department();
        String result = department.mainDepartment("F1Soft Internationals", "Pulchowk");
        String result2 = department.mainDepartment("F1Soft Internationals", "Pulchowk",
                "The main job is to make the softwares");
        System.out.println("The first result is: " + result);
        System.out.println("The second result is: " + result2);
    }
}
