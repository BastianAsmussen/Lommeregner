package dev.asmussen;

public class Logic {

    public static double Calculate(double input1, double input2, char operator) {

        double result = 0;

        switch(operator) {

            case '+':
                result = input1 + input2;
                System.out.println(input1 + " + " + input2 + " = " + result);
                break;

            case '-':
                result = input1 - input2;
                System.out.println(input1 + " - " + input2 + " = " + result);
                break;

            case '*':
                result = input1 * input2;
                System.out.println(input1 + " * " + input2 + " = " + result);
                break;


            case '/':
                result = input1 / input2;
                System.out.println(input1 + " / " + input2 + " = " + result);
                break;

            default:
                break;
        }

        return result;
    }
}
