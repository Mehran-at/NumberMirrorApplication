import java.util.ArrayList;
import java.util.List;

public class SpecialMirror {
    Integer numberMirror;

    public SpecialMirror(Integer numberMirror) {
        this.numberMirror = numberMirror;
    }

    public List<Integer> getSpecialMirror(NumberMirror numberMirror) {
        List<Integer> numbers = new ArrayList<>();
        double numberMirrors = 0;
        while (numberMirrors > 9) {
            Integer digit = 0;
            double temp = 0;
            temp = numberMirrors % 10;
            temp=temp + 1;
            numbers.add((int) temp);
            numberMirrors = Math.floor(numberMirrors / 10);
        }
    return numbers;
    }
}










//            Integer digitPlusOne = 0;
//            Integer temp = 0;
//            Integer numberMirrord;
//            temp = numberMirrord % 10;
//            temp=temp + 1;
//            numbers.add(temp);
//            numberMirror = Math.floor(numberMirror / 10);
//            System.out.println("Spacial number of reversed number is: " + digitPlusOne);
//        }
//
//    return numberMirror;
//    }
//
//}
