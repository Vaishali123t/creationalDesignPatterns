package AbstractFactoryPattern.UIElements;

public class GUIFactory {

    public static IFactory createFactory(String param){

        switch (param){
            case "windows":
                return new WinFactory();
            case "mac":
                return new MacFactory();
        }
        return null;
    }

}
