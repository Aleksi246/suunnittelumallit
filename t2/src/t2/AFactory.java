package t2;

public class AFactory implements UIFactory{

    @Override
    public Button createButton(String text) {
        return new ButtonA(text);
    }
    @Override
    public CheckBox createCheckBox(String text){
        return new CheckBoxA(text);
    }
    @Override
    public TextField createTextField(String text){
        return new TextFieldA(text);
    }
    
}
