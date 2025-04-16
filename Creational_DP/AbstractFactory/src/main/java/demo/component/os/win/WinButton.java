package main.java.demo.component.os.win;

import main.java.demo.component.Button;

public class WinButton implements Button {
    @Override
    public void paint() {
        System.out.println("Win Button");
    }
}
