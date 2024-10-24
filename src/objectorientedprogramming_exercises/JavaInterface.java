package objectorientedprogramming_exercises;

//Write your code here

interface AdvancedArithmetic{
    int divisor_sum(int n);
}
class MyCalculator implements AdvancedArithmetic{
    public int divisor_sum(int n){
        int sum = 0;
        for (int i = 1; i <= n; i++) {
           if (n % i == 0) sum += i;
        }
        return sum;
    }
}

public class JavaInterface {
    public static void main(String[] args) {
        MyCalculator myCalculator = new MyCalculator();
        System.out.println(myCalculator.divisor_sum(6));
    }
}
