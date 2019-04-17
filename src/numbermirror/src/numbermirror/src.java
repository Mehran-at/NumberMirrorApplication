package src.numbermirror;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class src {
  public static class SpecialMirror {

    NumberMirror numberMirror = new NumberMirror();

    public Integer specialMirror(Integer number) {
      List<String> separate = numberMirror.separate(number);
      List<String> strings = addPlusOneToAllNumber(separate);
      Collections.reverse(strings);
      String reversed = String.join("", strings);
      return Integer.valueOf(reversed);
    }

    private List<String> addPlusOneToAllNumber(List<String> separate) {
      List modified = new ArrayList();
      for (String s : separate) {
        addPlusOne(s, modified);
      }
      return modified;
    }

    private void addPlusOne(String s, List modified) {
      Integer digit = Integer.valueOf(s);
      Integer result = (digit + 1) % 10;
      modified.add(result.toString());
    }
  }

  static class SpecialMirrorTest {

    SpecialMirror specialMirror = new SpecialMirror();

    @ParameterizedTest
    @CsvSource({
        "1234,5432",
        "6666,7777",
        "01,2"
    })
    void specialMirror(Integer number, Integer expected) {
      Integer actual = specialMirror.specialMirror(number);
      Assertions.assertEquals(expected, actual);
    }
  }

  static class NumberMirrorTest {

    NumberMirror numberMirror = new NumberMirror();
    @ParameterizedTest
    @CsvSource({
        "1234, 4321",
        "1,1",
        "1223,3221",
        "12222223,32222221"
    })

    void mirror(Integer number, Integer expected) {
      Integer actual = numberMirror.mirror(number);
      Assertions.assertEquals(expected, actual);
    }
  }

  public static class NumberMirrorApplication {
    public static void main(String[] args) {
      NumberMirror numberMirror = new NumberMirror();
      SpecialMirror specialMirror = new SpecialMirror();
      Integer mirror = numberMirror.mirror(1234);
      System.out.println(mirror);
      System.out.println(specialMirror.specialMirror(mirror));
    }
  }

  public static class NumberMirror {

    public Integer mirror(Integer number) {
      List<String> mutableNumbers = separate(number);
      Collections.reverse(mutableNumbers);
      String reversed = String.join("", mutableNumbers);
      return Integer.valueOf(reversed);
    }

    protected List<String> separate(Integer number) {
      String stringOfNumber = number.toString();
      String[] split = stringOfNumber.split("");
      List<String> immutableNumbers = Arrays.asList(split);
      List<String> mutableNumbers = new ArrayList<>(immutableNumbers);
      return mutableNumbers;
    }

  }
}
