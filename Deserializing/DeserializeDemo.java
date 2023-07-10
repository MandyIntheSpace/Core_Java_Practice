package Deserializing;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import BLANK_Uninitialized_Varibale.Employee;

public class DeserializeDemo {
    public static void main(String[] args) throws ClassNotFoundException {
        Employee e = null;
        try {
            FileInputStream filein = new FileInputStream("/tmp/employee.ser");
            ObjectInputStream in = new ObjectInputStream(filein);
            e = (Employee) in.readObject();
            in.close();
            filein.close();
        } catch (IOException i) {
            // TODO: handle exception
            i.printStackTrace();
            return;
        }
        catch(ClassNotFoundException c){
            System.out.println("Employee class not found");
            c.printStackTrace();
            return;
        }
        System.out.println("Deserialized Employe.....");
        System.out.println("Name: " + e.name);
        System.out.println("Address: " + e.address);
        System.out.println("SSN: " + e.SSN);
        System.out.println("Number: "+ e.number);
    }
}
