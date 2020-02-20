package ie.gmit;

public class Calculator {

    private int firstNum;
    private int secondNum;

    public Calculator(){
        this.firstNum = 0;
        this.secondNum =0;
    }

    public Calculator(int firstNum, int secondNum){
        this.firstNum = firstNum;
        this.secondNum = secondNum;
    }

    //This method will add two numbers and return result
    public int add(int firstNum, int secondNum){
        int result = firstNum + secondNum;
        return result;
    }

    //This method will subtract two numbers and return result
    public int subtract(int firstNum, int secondNum){
        int result = firstNum - secondNum;
        return  result;
    }

    //This method will multiply two numbers and return result
    public int multiply(int firstNum, int secondNum){


        int result = firstNum * secondNum;
        return  result;
    }

    //This method will divide two numbers and return result
    public double divide(int firstNum, int secondNum) {

        if(secondNum == 0){
            throw new IllegalArgumentException("Not real number, division by zero");
        }

        double result = firstNum / secondNum;
        return result;
    }

    public int getFirstNum() {
        return firstNum;
    }

    public int getSecondNum() {
        return secondNum;
    }


}
