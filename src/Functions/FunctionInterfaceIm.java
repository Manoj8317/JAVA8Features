package Functions;

import java.util.function.Function;

class FunctionImp implements Function<String,Integer>{

    @Override
    public Integer apply(String s) {
        return s.length();
    }
}
public class FunctionInterfaceIm {
    public static void main(String[] args) {
//        Function<String,Integer> fn=new FunctionImp();
//        System.out.println(fn.apply("Manoj"));
        Function<String,Integer> fn =(name)-> name.length();
        System.out.println(fn.apply("manoj"));

    }
}
