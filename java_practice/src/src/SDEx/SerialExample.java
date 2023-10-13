package SDEx;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerialExample implements Serializable {

    private String name;
    private int age;

    public SerialExample(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        //        catch(InterruptedException ie){
//            System.out.println(ie.getMessage());
//        }

        SerialExample per1 = new SerialExample("kahooot", 55);

        try{

            FileOutputStream fileOut = new FileOutputStream("person.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(per1);
            out.close();
            fileOut.close();
            System.out.println("Success!");
        }

        catch(Exception e){
            e.printStackTrace();
        }
    }
}
