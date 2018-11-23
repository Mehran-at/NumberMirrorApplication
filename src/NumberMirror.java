public class NumberMirror {
    private Integer number;
    private Integer reversedNumber = 0;
    private Integer temp = 0;

    public NumberMirror(Integer number) {
    }

    public void getMirrorNumber() {
        while (number > 0) {
            temp = number % 10;
            reversedNumber = reversedNumber * 10 + temp;
            number = number / 10;
        }
        System.out.println("Reversed Number is: " + reversedNumber);
    }
}
