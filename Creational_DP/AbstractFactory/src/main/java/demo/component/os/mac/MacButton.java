package main.java.demo.component.os.mac;

import main.java.demo.component.Button;

public class MacButton implements Button {
    @Override
    public void paint() {
        System.out.println("Mac Button");
    }
}
