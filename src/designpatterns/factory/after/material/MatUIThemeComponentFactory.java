package designpatterns.factory.after.material;

import designpatterns.factory.after.base.Button;
import designpatterns.factory.after.base.DropDown;
import designpatterns.factory.after.base.Menu;
import designpatterns.factory.after.base.ThemeComponentFactory;

public class MatUIThemeComponentFactory implements ThemeComponentFactory {
    @Override
    public Button createButton() {
        return new MatUIButton();
    }

    @Override
    public Menu createMenu() {
        return new MatUIMenu();
    }

    @Override
    public DropDown createDropDown() {
        return new MatUIDropDown();
    }
}
