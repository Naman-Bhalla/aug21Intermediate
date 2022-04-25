package designpatterns.factory.after.ios;

import designpatterns.factory.after.base.Button;
import designpatterns.factory.after.base.DropDown;
import designpatterns.factory.after.base.Menu;
import designpatterns.factory.after.base.ThemeComponentFactory;

public class IOSUIThemeComponentFactory implements ThemeComponentFactory {

    @Override
    public Button createButton() {
        return new IOSUIButton();
    }

    @Override
    public Menu createMenu() {
        return new IOSUIMenu();
    }

    @Override
    public DropDown createDropDown() {
        return new IOSUIDropDown();
    }
}
