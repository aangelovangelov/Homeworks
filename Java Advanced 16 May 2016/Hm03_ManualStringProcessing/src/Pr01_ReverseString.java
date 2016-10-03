import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pr01_ReverseString {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder input = new StringBuilder();
        StringBuilder reversed = new StringBuilder();

        input.append(br.readLine());
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed.append(input.charAt(i));
        }

        System.out.println(reversed);

    }
}
