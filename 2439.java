import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Main2439 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        int num = Integer.parseInt(str);

        for (int i = 1; i <= num; i++) {
            for (int j = (num - i); j > 0; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.print('\n');
        }
    }
}
