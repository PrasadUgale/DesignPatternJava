package main.java.demo.component.uifactory;

import main.java.demo.component.Button;
import main.java.demo.component.CheckBox;
import main.java.demo.component.os.mac.MacButton;
import main.java.demo.component.os.mac.MacCheckBox;

public class MacUIFactory implements UIFactory {
    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new MacCheckBox();
    }
}
