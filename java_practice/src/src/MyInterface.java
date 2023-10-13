public interface MyInterface {
    int add(int a, int b);
    int subtract(int a, int b);
}

class Testing11 implements MyInterface{
    public int add(int a, int b){
        return a + b;
    }

    public int subtract(int a, int b){
        return a - b;
     }
}