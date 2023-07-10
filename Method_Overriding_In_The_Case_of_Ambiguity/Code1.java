package Method_Overriding_In_The_Case_of_Ambiguity;

class TypePromotion {
    void sum(int a, long b) {
        System.out.println(a + b);
    }

    void sum(long a, int b) {
        System.out.println(a + b);
    }
    public static void main(String[] args) {
        TypePromotion typePromotion = new TypePromotion();
        typePromotion.sum(20, 20);
    }
}
 