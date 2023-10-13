import java.util.ArrayList;

public class GenericExample {

    public static void rand(String[] args) {

        // An array list that only allows a particular object type
        ArrayList<Integer>  myArrList = new ArrayList<>();
        myArrList.add(34);
        myArrList.add(10002);
        System.out.println(myArrList);

        // If I wanted an array list that takes an object of class MyThread
        ArrayList<MyThread> myThreadArrayList = new ArrayList <> ();
        myThreadArrayList.add(new MyThread());
        myThreadArrayList.add(new MyThread());

        // The compiler will not allow me to add and object that is not of type 'MyThread'
        myThreadArrayList.add((MyThread) new Thread());

        myThreadArrayList.add(new MyThread());
        System.out.println(myThreadArrayList);

    }
}
