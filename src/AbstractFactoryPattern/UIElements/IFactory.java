package AbstractFactoryPattern.UIElements;

public interface IFactory {

    IButton createButton();
    ITextBox createTextBox();

}
