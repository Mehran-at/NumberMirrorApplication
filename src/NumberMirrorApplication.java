//Derek is playing the number mirror game with Hansel. First Derek writes a number and Hansel writes the same number but written completely backwards.
//  Develop the code that Hansel uses in order to write the number backwards.
//    Follow the instructions below:
//       . You need the following classes: NumberMirror and NumberMirrorApplication.
//       . The NumberMirror has the mirror method that receives a number and returns it written backwards.
//       . In the NumberMirrorApplication class main method, ask the user for a number, create a NumberMirror, use it to find its mirror number and display both.
//        Hints:
//        > Assume that number that the user writes numbers within the Integer size limits.
//        > Maybe some Java traits can help you solve the problem easily, if you are creative enough to combine them.
//        > Keep it simple stupid. Don’t overdo things, just stick to what the exercise asks for.
//        Part 2
//Derek and Hansel want to take the mirror number game to the next level. When finding out the mirror number, they also want to add 1 to every number before they write them backwards. If the number is 9 then they just write a 0.
//   Develop the code that Hansel uses in order to mirror the number in this special way.
//     Follow the instructions below:
//       . Reuse the NumberMirror from exercise 1.
//       . Reuse the NumberMirrorApplication from exercise 1.
//       . Add the specialMirror method to the NumberMirror class that receives a number and returns the special mirror version of it.
//       . In the NumberMirrorApplication class main method, apply the special mirror to the same number it was previously requested and display it as well.
//        Hints:
//        > Maybe some Java traits can help you solve the problem easily, if you are creative enough to combine them.
//        > Keep it simple stupid. Don’t overdo things, just stick to what the exercise asks for.

        import java.util.Scanner;
public class NumberMirrorApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("PLease give me a number: ");
        Integer number = scanner.nextInt();
        NumberMirror numberMirror = new NumberMirror();
        Integer reversed = numberMirror.mirrorTheNumber(number);
        System.out.println(reversed);
        Integer specialReveresed = numberMirror.getSpecialMirror(number);
        System.out.println(specialReveresed);
    }
}
