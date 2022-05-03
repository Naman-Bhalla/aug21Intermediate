package designpatterns.factory.after.ios;

import designpatterns.factory.after.base.Theme;
import designpatterns.factory.after.base.ThemeComponentFactory;

public class IOSUITheme extends IOSUIThemeComponentFactory {


    public ThemeComponentFactory createThemeComponentFactory() {
        return new IOSUIThemeComponentFactory();
    }


    public boolean changePrimaryColor() {
        return false;
    }
}
