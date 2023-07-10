package Serializable;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializeDemo {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.name = "Ram Karki";
        e.address = "Pokhara";
        e.SSN = 11122333;
        e.number = 101;

        try {
            FileOutputStream fileout = new FileOutputStream("/tmp/employee.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileout);
            out.writeObject(e);
            out.close();
            fileout.close();
            System.out.println("Serialized data is saved in /tmp/employee.ser");
        } catch (IOException i) {
            // TODO: handle exception
            i.printStackTrace();
        }
    }
}
