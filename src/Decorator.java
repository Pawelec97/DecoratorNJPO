public class Decorator extends AbstractElement {
    public Decorator(AbstractElement element){
        this.element = element;
    }
    protected AbstractElement element;

    @Override
    public void show(){
        element.show();
    }
}
