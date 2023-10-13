public abstract class MyAbstract1 {
     int  age;
    String name;

    public abstract void sayName();

}

class AbsChild extends MyAbstract1 {

    String address  = "33 Ajero Street";
    int yearBorn = 1933;

    public void printS(){
        System.out.println("THis is from the abstract child");
    }


    @Override
    public void sayName() {
        System.out.println("My name is Jeff and I am a guy from just around the block");
    }

}