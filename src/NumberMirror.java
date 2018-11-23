public class NumberMirror {
    Integer number;

    public NumberMirror(Integer number) {
        this.number = number;
    }

    public NumberMirror() {

    }

    public Integer getMirrorNumber() {
        Integer reversedNumber = 0;
        Integer temp = 0;
        if (number == 9) {
            number = 0;
        } else {
            while (number > 0) {
                temp = number % 10;
                reversedNumber = reversedNumber * 10 + temp;
                number = number / 10;
            }
        }
        return reversedNumber;
    }
}