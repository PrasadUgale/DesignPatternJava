package main.java.demo.component.os.mac;

import main.java.demo.component.CheckBox;

public class MacCheckBox implements CheckBox {
    @Override
    public void paint() {
        System.out.println("Mac Checkbox");
    }
}
