package main.java.demo.component.os.win;

import main.java.demo.component.CheckBox;

public class WinCheckBox implements CheckBox {
    @Override
    public void paint() {
        System.out.println("Win Checkbox");
    }
}
