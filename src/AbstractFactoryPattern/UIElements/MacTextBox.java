package AbstractFactoryPattern.UIElements;

public class MacTextBox implements ITextBox{
    @Override
    public void writeText(String text) {
        System.out.println("Text in Mac text box "+text);
    }
}
