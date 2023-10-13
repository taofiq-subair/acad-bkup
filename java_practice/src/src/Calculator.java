public class Calculator{
    public static void main (String args[]){
	Addition a1 = new Addition();
	Multiplication m1 = new Multiplication();
	System.out.println(Addition.class.getClassLoader());
	System.out.println(Multiplication.class.getClassLoader());
	System.out.println(Calculator.class.getClassLoader());
	System.out.println(a1.addition(5,9));
	System.out.println(m1.mult(3,2));
    }
}
