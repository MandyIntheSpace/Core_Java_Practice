package Inheritance;

interface Company {
    void companyName();

    default void companyStatus() {
        System.out.println("Internal Company");
    }
}

interface Country {
    void countryName();
}

class Employee implements Company, Country {

    @Override
    public void countryName() {
        // TODO Auto-generated method stub
        System.out.println("Nepal");
    }

    @Override
    public void companyName() {
        // TODO Auto-generated method stub
        System.out.println("F1Soft Internationals");
    }

    public static void main(String[] args) {
        Employee d = new Employee();
        d.countryName();
        d.companyName();
        d.companyStatus();
    }

}
