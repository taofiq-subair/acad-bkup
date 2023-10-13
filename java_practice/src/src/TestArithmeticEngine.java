import java.util.Scanner;

public class TestArithmeticEngine {
    public static void main(String[] args) {
        try(Scanner scn = new Scanner(System.in)){
            System.out.println("Enter first and second number");
        double firstNumber = scn.nextDouble();
        double secondNumber = scn.nextDouble();

        ArithmeticEngine arithEng = new ArithmeticEngine(firstNumber, secondNumber);


            System.out.printf("%s ^ %s = %3s", firstNumber, secondNumber,arithEng.power(firstNumber, secondNumber));
//            System.out.printf("%s + %s = %2s", firstNumber, secondNumber, arithEng.addTwoNumbers());
//            System.out.println();
//            System.out.printf("%s - %s = %s", firstNumber, secondNumber, arithEng.subTwoNumbers());
//            System.out.println();

        }
        catch(Exception ex){
            ex.printStackTrace();
        }
    }

}
