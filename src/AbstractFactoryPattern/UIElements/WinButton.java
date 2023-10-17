package AbstractFactoryPattern.UIElements;

public class WinButton implements IButton{

    @Override
    public void clickButton(String text) {
        System.out.println("Windows button clicked "+text);
    }
}
