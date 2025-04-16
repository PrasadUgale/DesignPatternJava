package main.java.demo.component.uifactory;

import main.java.demo.component.Button;
import main.java.demo.component.CheckBox;

public interface UIFactory {
    Button createButton();
    CheckBox createCheckBox();
}
