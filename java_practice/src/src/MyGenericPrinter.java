    public class MyGenericPrinter <T> {
    T stuffToPrint;

    public MyGenericPrinter (T stuffToPrint){
        this.stuffToPrint = stuffToPrint;
    }

    public void print(){
        System.out.println(stuffToPrint);
    }

}

