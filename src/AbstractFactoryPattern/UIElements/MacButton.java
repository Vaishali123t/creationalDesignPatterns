package AbstractFactoryPattern.UIElements;

public class MacButton implements IButton{

    @Override
    public void clickButton(String text) {
        System.out.println("Mac button clicked "+text);
    }
}
