package designpatterns.factory.after.base;

// Abstract Factory
// XFactory
// return types will be the things that
// are related to X
// all the methods in abstract factory -> factory methods
public interface ThemeComponentFactory {
    Button createButton();

    Menu createMenu();

    DropDown createDropDown();
}
