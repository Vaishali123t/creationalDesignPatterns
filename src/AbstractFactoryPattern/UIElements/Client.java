package AbstractFactoryPattern.UIElements;

public class Client {

    public static void main(String[] args) {

        // creating a windows factory based on a param i.e. windows
        IFactory factory= GUIFactory.createFactory("windows");

        if (factory!=null){

            // on the basis of that factory and a parameter/function ie createTextBox() I have created a windows text box
            ITextBox textBox= factory.createTextBox();
            textBox.writeText("Try abstract factory method");

            // on the basis of that factory I have created a windows button
            IButton button= factory.createButton();
            button.clickButton("Done");

        }

    }

}
