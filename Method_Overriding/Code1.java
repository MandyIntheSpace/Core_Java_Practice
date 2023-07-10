package Method_Overriding;

class Bank {
    int getRateOfInterestPercentage() {
        return 0;
    }
}

class LaxmiBank extends Bank {
    int getRateOfInterestPercentage() {
        return 6;
    }
}

class NabilBank extends Bank {
    int getRateOfInterestPercentage() {
        return 7;
    }
}

class NICAsia extends Bank {
    int getRateOfInterestPercentage() {
        return 8;
    }
}

class InterestRateInfo {
    public static void main(String[] args) {
        Bank bank = new Bank();
        LaxmiBank laxmibank = new LaxmiBank();
        NabilBank nabilBank = new NabilBank();
        NICAsia nicAsia = new NICAsia();
        System.out.println("Rate of interest in laxmi bank is: " + laxmibank.getRateOfInterestPercentage());
        System.out.println("Rate of interest in laxmi bank is: " + nabilBank.getRateOfInterestPercentage());
        System.out.println("Rate of interest in laxmi bank is: " + nicAsia.getRateOfInterestPercentage());

    }
}
