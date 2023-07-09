package Argument_In_The_This_Method;

public class Button {
    private String label;

    public Button(String label) {
        this.label = label;
    }

    public void onClick() {
        System.out.println("Button Clicked: " + label);
    }

    public void registerEventHandler() {
        SomeEventLibrary.registerEvent(this);
    }
}

