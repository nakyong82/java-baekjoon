import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

// Scanner 방법
/*
class Main10926 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String lastString = "??!";

        String s = in.next();
        // 문자열 간 덧셈을 하면 문자열을 하나로 연결하여 붙여주는 append 연산
        System.out.println(s + lastString);

        in.close();
    }
}
*/

// BufferedReader -> 훨씬 성능 좋음
class Main10926 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String lastString = "??!";

        String s = br.readLine(); // 한 줄을 읽어옴
        // 더하기 연산으로 문자열 연결
        System.out.println(s + lastString);
    }
}