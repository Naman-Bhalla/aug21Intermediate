package designpatterns.factory.after.material;

import designpatterns.factory.after.base.Theme;
import designpatterns.factory.after.base.ThemeComponentFactory;

public class MaterialUITheme extends Theme {

    @Override
    public ThemeComponentFactory createThemeComponentFactory() {
        return new MatUIThemeComponentFactory();
    }

    @Override
    public boolean changePrimaryColor() {
        return false;
    }
}
