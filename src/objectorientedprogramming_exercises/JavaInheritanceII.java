package objectorientedprogramming_exercises;

class Arithmetic{
    int add(int a, int b){
        return a + b;
    }
}

class Adder extends Arithmetic{}

public class JavaInheritanceII {
    public static void main(String[] args) {
        Adder adder = new Adder();
        System.out.println(adder.add(1,2));
    }
}
