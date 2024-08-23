import java.lang.*;

class RunnableD implements Runnable{
    @Override
    public void run() {
        System.out.println("hello t1");
    }
}

public class LambdaRunnableExam {
    public static void main(String[] args) {
        Thread t1=new Thread(new RunnableD());
        t1.start();
        Thread t2=new Thread(()->System.out.println("with lambda"));
        t2.start();
    }
}
