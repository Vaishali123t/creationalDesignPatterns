package AbstractFactoryPattern.UIElements;

public class WinFactory implements IFactory{

    @Override
    public IButton createButton() {
        return new WinButton();
    }

    @Override
    public ITextBox createTextBox() {
        return new WinTextBox();
    }
}
