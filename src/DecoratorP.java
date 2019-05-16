public class DecoratorP extends Decorator{
    public DecoratorP(AbstractElement element){
        super(element);
    }

    @Override
    public void show(){
        System.out.print("<p>");
        super.show();
        System.out.print("<p>");
    }
}
