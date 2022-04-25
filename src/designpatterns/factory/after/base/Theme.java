package designpatterns.factory.after.base;

public abstract class Theme {
    String authorName;
    String primaryColor;
    int lastUpdateDate;
    String name;

    // Factory Method
    // Fac tory of ThemeComponenetactory
    public abstract ThemeComponentFactory createThemeComponentFactory();

    public abstract boolean changePrimaryColor();
}
