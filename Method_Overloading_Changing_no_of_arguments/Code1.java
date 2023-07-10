package Method_Overloading_Changing_no_of_arguments;

class Department {
    static String internetBankingDepartment(String firstProject, String secondProject) {
        return "This project is handled by internet banking department is" + firstProject + "and" +
                secondProject;
    }

    static String internetBankingDepartment(String firstProject, String secondProject,
            String thirdProject) {
        return "The project handled by coding department is " + firstProject + "," +
                secondProject + "and" + thirdProject;

    }
}

class Test {
    public static void main(String[] args) {
        Department department = new Department();
        String result = department.internetBankingDepartment("F1Soft Internationals", "Mandip Timsina");
        String result2 = department.internetBankingDepartment("F1Soft Internationals", "Esewa", "Fonepay");
        System.out.println(result);
        System.out.println(result2);
    }
}