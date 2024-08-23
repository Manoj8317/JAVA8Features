package Functions;

import java.time.LocalDateTime;
import java.util.function.Supplier;

class SupplierImp implements Supplier<LocalDateTime>{

    @Override
    public LocalDateTime get() {
        return LocalDateTime.now();
    }
}
public class SupplierInterfaceImplementation {
    public static void main(String[] args) {
//        Supplier<LocalDateTime> s=new SupplierImp();
//        System.out.println(s.get());
        Supplier<LocalDateTime> s=()->LocalDateTime.now();
        System.out.println(s.get());
    }
}
