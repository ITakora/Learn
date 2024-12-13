


public class Class {
    public static void main(String[] args) {
        int num1 = 4;
        int num2 = 5;

        // this is how to call object in Java
        Calculator result = new Calculator();
          int value =  result.add(num1, num2);
            System.out.println(value);
    }
}

 class Calculator {
    public int add(int a, int b) {
        return a + b;
    }
}