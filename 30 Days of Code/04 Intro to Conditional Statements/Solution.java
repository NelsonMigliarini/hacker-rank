import static java.lang.System.in;
import static java.lang.System.out;
import static java.util.Locale.US;

import java.util.Scanner;

public class Solution {
  private static WeirdValueService service = WeirdValueService.getInstance();
  public static void main(String[] args) {
    int value = service.getValue(new Scanner(in));
    out.print(service.getWeirdness(value));
  }
}

class WeirdValueService {
  private static WeirdValueService instance;

  private WeirdValueService() {}

  public static WeirdValueService getInstance() {
    if (instance == null) {
      instance = new WeirdValueService();
    }
    return instance;
  }

  public int getValue(Scanner scanner) {
    try (scanner) {
      scanner.useLocale(US);
      return scanner.nextInt();
    }
  }

  public String getWeirdness(int value) {
    Type weirdness = Type.NOT_WEIRD;
    if ((value % 2 > 0) || (value > 5 && value < 21)) {
      weirdness = Type.WEIRD;
    }
    return weirdness.toString();
  }
}

enum Type {
  WEIRD("Weird"), NOT_WEIRD("Not Weird");

  private final String value;

  private Type(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return value;
  }
}
