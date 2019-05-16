public class DecElem extends AbstractElement {
    public DecElem(String text){
        this.text = text;
    }
    String text;


    @Override
    public void show(){
        System.out.print(text);

    }
}
