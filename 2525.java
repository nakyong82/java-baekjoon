import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Main2525 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        String str2 = br.readLine();

        int h = Integer.parseInt(str[0]);
        int m = Integer.parseInt(str[1]);
        int cook = Integer.parseInt(str2);

        h = h + (cook / 60);
        m = m + (cook % 60);

        if (m >= 60) {
            h++;
            m = m - 60;
        }
        if (h >= 24) {
            h = h - 24;
        }

        System.out.println(h + " " + m);
    }
}