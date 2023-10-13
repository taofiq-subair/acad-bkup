public class ArithmeticEngine {
    private double firstNumber;
    private double secondNumber;

    public ArithmeticEngine(double fn, double sn){
        this.firstNumber = fn;
        this.secondNumber = sn;
    }

    public double addTwoNumbers(){
        return this.firstNumber + this.secondNumber;
    }
    public double subTwoNumbers(){
        return this.firstNumber - this.secondNumber;
    }

    public double power(double base, double idx){
        if(idx <= 0){
            return 1;
        }
        return base * power(base, idx - 1);
    }

    public double getFirstNumber() {
        return firstNumber;
    }

    public double getSecondNumber(){
        return this.secondNumber;

    }

    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }
}
