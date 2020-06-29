import java.util.Scanner;

import static org.apache.commons.lang3.StringUtils.*;

public class prompt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Type something: ");

        String userInput = sc.nextLine();

        System.out.println(isNumeric(userInput));

        System.out.println(swapCase(userInput));

        System.out.println(reverse(userInput));

    }
}
