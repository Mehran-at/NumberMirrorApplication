import java.util.Scanner;
public class NumberMirrorApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("PLease give me a number: ");
        Integer number = scanner.nextInt();
        NumberMirror numberMirror = new NumberMirror(number);
        Integer reversed = numberMirror.getMirrorNumber();
        System.out.println(reversed);



        SpecialMirror specialMirror = new SpecialMirror(reversed);
//        Integer size1 = reversed.size();
//        Double size = new Double(size1);
        Integer digit = specialMirror.getSpecialMirror(s);
    }
}
