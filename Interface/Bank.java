package Interface;

interface Bank {
    float RateOfInterest();
}

class Lakshmi implements Bank {

    @Override
    public float RateOfInterest() {
        return 5.5f;
    }

}

class Nabil implements Bank {
    public float RateOfInterest() {
        return 7.7f;
    }
}

class BankTest {
    public static void main(String[] args) {
        Bank b = new Lakshmi();
        System.out.println("Rate of interest is: " + b.RateOfInterest());

        Bank b1 = new Nabil();
        System.out.println("Rate of interest in Nabil is: " + b1.RateOfInterest());
    }
}

/*
 * Note : Class implements interface, but an interface extends another interface
 */