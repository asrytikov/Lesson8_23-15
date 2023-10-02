package p3;

public class Main {

    public static void main(String[] args) {
        MathF.Factorial factorial = MathF.getFactorial(6);
        System.out.printf("Factorial %d = %d \n", factorial.getKey(), factorial.getResult());
    }


}
