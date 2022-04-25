package designpatterns.factory.after;


import designpatterns.factory.after.base.Theme;
import designpatterns.factory.after.base.ThemeComponentFactory;
import designpatterns.factory.after.base.ThemeFactory;
import designpatterns.factory.after.ios.IOSUITheme;
import designpatterns.factory.after.material.MaterialUITheme;

public class Client {
    private static final String THEME = "ios";

    public static void main(String[] args) {
        Theme theme = ThemeFactory.createThemeForIdentifier(THEME);
        ThemeComponentFactory themeComponentFactory = theme
                .createThemeComponentFactory();

        themeComponentFactory.createButton();
        themeComponentFactory.createMenu();
        themeComponentFactory.createDropDown();


    }
}

// ShoeFacotry
// all methods will return shoe
// => Practical Factory


// Footwear Factory
// all methods will return shoe/ sandals/ chappal/
// => abstract factory