package main.java.demo.component.uifactory;

import main.java.demo.component.Button;
import main.java.demo.component.CheckBox;
import main.java.demo.component.os.win.WinButton;
import main.java.demo.component.os.win.WinCheckBox;

public class WinUIFactory implements UIFactory {
    @Override
    public Button createButton() {
        return new WinButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new WinCheckBox();
    }
}
