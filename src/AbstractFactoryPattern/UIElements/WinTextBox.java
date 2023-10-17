package AbstractFactoryPattern.UIElements;

public class WinTextBox implements ITextBox{

    @Override
    public void writeText(String text) {
        System.out.println("Text in Windows text box "+text);
    }
}
