public class DecoratorStrong extends Decorator{
    public DecoratorStrong(AbstractElement element){
        super(element);
    }

    @Override
    public void show(){
        System.out.print("<strong>");
        super.show();
        System.out.print("<strong>");
    }
}
