public interface MyInterface2 {
    public void poop();
}


class Cat implements MyInterface, MyInterface2{
    @Override
    public int add(int a, int b) {
        return 0;
    }

    @Override
    public int subtract(int a, int b) {
        return 0;
    }

    @Override
    public void poop(){
        System.out.println("Pooping here");
    }
}

class Jaja extends  Cat implements MyInterface2, MyInterface{

}