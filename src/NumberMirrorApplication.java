import java.util.Scanner;

public class NumberMirrorApplication {
    public static void main(String[] args) {
        Integer reversedNumber;
        Scanner scanner = new Scanner(System.in);
        System.out.println("PLease give me a number: ");
        Integer number = scanner.nextInt();
        NumberMirror numberMirror = new NumberMirror(number);
        Integer reverse = numberMirror.getMirrorNumber();
    }
}
