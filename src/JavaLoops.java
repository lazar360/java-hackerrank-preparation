import java.io.*;

public class JavaLoops {

    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\NICOLAS.GAUTIER\\intellij-workspace\\java-hackerrank-preparation\\src\\strforjavaloops.txt");
        // BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        int q = Integer.parseInt(bufferedReader.readLine());
        while (q!=0){
            String line = bufferedReader.readLine();
            String[] parts = line.split(" ");
            int a = Integer.parseInt(parts[0]);
            int b = Integer.parseInt(parts[1]);
            int n = Integer.parseInt(parts[2]);

            int sum = a;
            for (int i = 0; i < n; i++) {
                sum += Math.pow(2, i) * b;
                System.out.print(sum + " ");
            }
            System.out.println();
            q--;
        }
    }
}
