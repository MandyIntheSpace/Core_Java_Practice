package Final_Keyword;

public class FinalParameter {
    int displayInformation(final String employeeName) {
        employeeName = "Himal Pant";
        // Here is the error as we cannot assign value to the final varibale
    }

    public static void main(String[] args) {
        FinalParameter finalparameter = new FinalParameter();
        finalparameter.displayInformation("F1Soft Internationals");
    }
}
