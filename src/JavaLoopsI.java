public class JavaLoopsI {
    public static void main(String[] args) {
        int N = 2;
        printNfirst10Multiple(N);
    }

    private static void printNfirst10Multiple(int n) {
        for (int i = 1; i < 11; i++) {
            System.out.println(n+" x "+i+" = "+n*i);
        }
    }
}
