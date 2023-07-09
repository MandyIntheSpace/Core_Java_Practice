package Constructor;

public class ParameterizedConstructor {
    private String name;
    public ParameterizedConstructor (String n) {
        this.name = n;
    }
    public String getName() {
        return name;
    }
    public static void main(String[] args) {
        ParameterizedConstructor para = new ParameterizedConstructor("Java");
        System.out.println(para.getName());
    }
}
