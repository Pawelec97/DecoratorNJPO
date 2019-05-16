public class DecoratorEm extends Decorator{
    public DecoratorEm(AbstractElement element){
        super(element);
    }

    @Override
    public void show(){
        System.out.print("<em>");
        super.show();
        System.out.print("<em>");
    }
}
