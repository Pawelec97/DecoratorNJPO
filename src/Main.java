public class Main {

    public static void main(String[] args) {

        AbstractElement test = new DecoratorP(new DecElem("test"));

        test.show();
        System.out.println();
        AbstractElement test2 = new DecoratorStrong(new DecoratorMark(new DecoratorP(new DecoratorEm( new DecElem("zdanie tekstowe")))));
        test2.show();

    }
}
