public class ArrayCopy {
    public static void main (String[] args){

        Exception ex = new Exception("Caused by you!");
        Error n =  new Error("Error here", ex);

        try {
            char[] copyFrom = {'a','b','c','d','e','f','g'};
            char[] copyTo = new char[4];
            System.arraycopy(copyFrom, 3, copyTo, 0, 4);
            System.out.println(copyTo);
            System.out.println(String.valueOf(copyTo));
            throw n;

        } catch (Error e) {
            System.out.println(e.getMessage());
            System.out.println(e.getCause() + "*********");
//            throw new RuntimeException(n);
        } finally {
            System.out.println("welcome back");
            System.out.println(n.getCause() + "*********");

        }


    }
}
