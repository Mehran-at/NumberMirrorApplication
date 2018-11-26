public class NumberMirror {

    public Integer mirrorTheNumber(Integer number) {
        Integer reversedNumber = 0;
            while (number > 0) {
               Integer temp = number % 10;
                reversedNumber = reversedNumber * 10 + temp;
                number = number / 10;
            }
        return reversedNumber;
    }
    public Integer getSpecialMirror(Integer number) {
        Integer reveresedSpecialNumber = 0;
        while (number > 0) {
           Integer temp = number % 10;
           if (temp == 9) {
               temp += 0;}
            else {temp += 1;
            }
            reveresedSpecialNumber = reveresedSpecialNumber * 10 + temp;
            number = number / 10;
        }
        return reveresedSpecialNumber;
    }
}