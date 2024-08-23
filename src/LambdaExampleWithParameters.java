interface  addable{
    int sum(int a,int b);
}

//class addableIml implements  addable{
//    @Override
//    public int sum(int a, int b) {
//        return a+b;
//    }
//}

public class LambdaExampleWithParameters {
    public static void main(String[] args) {
//        addableIml ad=new addableIml();
//        System.out.println(ad.sum(10,20));
        addable ad=(a,b) ->{ int c=a+b;
                return c;
        };
        System.out.println(ad.sum(10,800));
    }
}
