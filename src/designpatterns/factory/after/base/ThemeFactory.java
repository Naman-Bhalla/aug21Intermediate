package designpatterns.factory.after.base;

import designpatterns.factory.after.ios.IOSUITheme;
import designpatterns.factory.after.material.MaterialUITheme;

// Practical Factory
// XFactory
//. return type of all methods will be X
public class ThemeFactory {
    public static Theme createThemeForIdentifier(String themeName) {
        if (themeName.equals("material")) {
            return new MaterialUITheme();
        } else {
            return new IOSUITheme();
        }
    }
}
