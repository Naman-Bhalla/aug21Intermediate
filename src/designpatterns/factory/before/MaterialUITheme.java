package designpatterns.factory.before;

public class MaterialUITheme extends Theme {
    @Override
    public Button createButton() {
        return null;
    }

    @Override
    public Menu createMenu() {
        return null;
    }

    @Override
    public DropDown createDropDown() {
        return null;
    }

    @Override
    public boolean changePrimaryColor() {
        return false;
    }
}
