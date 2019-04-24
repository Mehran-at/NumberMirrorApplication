package streamhero;

import org.junit.jupiter.api.Test;

import java.util.List;

class SummarizerTest {
  Summarizer summarizer = new Summarizer();
  @Test
  void findUniqueTricks() {
    String filePath = "streamhero/robocode.txt";
    List<String> tricks =  summarizer.findUniqueTricks(filePath);
    System.out.println(tricks);
  }
}