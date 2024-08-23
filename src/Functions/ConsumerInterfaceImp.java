package Functions;

import java.util.function.Consumer;

class ConsumerImp implements Consumer<String>{

    @Override
    public void accept(String s) {
        System.out.println(s);
    }
}
public class ConsumerInterfaceImp {
    public static void main(String[] args) {
//        Consumer<String> c=new ConsumerImp();
//        c.accept("manoj");
        Consumer<String> c =(name)->System.out.println(name);
        c.accept("manoj");
    }
}
