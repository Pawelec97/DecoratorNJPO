public class DecoratorMark extends Decorator{
    public DecoratorMark(AbstractElement element){
        super(element);
    }

    @Override
    public void show(){
        System.out.print("<mark>");
        super.show();
        System.out.print("<mark>");
    }
}
