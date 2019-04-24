package streamhero;

import java.util.List;
import java.util.stream.Collectors;

public class Summarizer {
  FileReader fileReader = new FileReader();

  public List<String> findUniqueTricks(String filePath) {
    return fileReader.asStream(filePath)
        .map(line-> line.replaceAll("!", ""))
        .distinct()
        .sorted()
        .collect(Collectors.toList());
  }
}
