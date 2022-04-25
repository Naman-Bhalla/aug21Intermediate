package designpatterns.factory.after.ios;

import designpatterns.factory.after.base.Theme;
import designpatterns.factory.after.base.ThemeComponentFactory;

public class IOSUITheme extends IOSUIThemeComponentFactory {

    @Override
    public ThemeComponentFactory createThemeComponentFactory() {
        return new IOSUIThemeComponentFactory();
    }

    @Override
    public boolean changePrimaryColor() {
        return false;
    }
}
