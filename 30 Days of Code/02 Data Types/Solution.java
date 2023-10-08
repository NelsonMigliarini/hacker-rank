import static java.lang.System.in;
import static java.lang.System.out;
import static java.util.Locale.US;

import java.util.Scanner;

/**
 * @author Nelson Migliarini
 */
public class Solution {
  private static DataService service = DataService.getInstance();

  public static void main(String[] args) {
    DataDTO dto = service.generateDTO(new Scanner(in));
    out.println(service.operateInteger(dto));
    out.println(service.operateDecimal(dto));
    out.println(service.operateText(dto));
  }
}

class DataService {
  private static DataService instance;

  private DataService() {}

  public static DataService getInstance() {
    if (instance == null) {
      instance = new DataService();
    }
    return instance;
  }

  public DataDTO generateDTO(Scanner scanner) {
    try (scanner) {
      scanner.useLocale(US);
      int integerValue = scanner.nextInt();
      scanner.nextLine();
      double decimalValue = scanner.nextDouble();
      scanner.nextLine();
      String textValue = scanner.nextLine();
      return new DataDTO(integerValue, decimalValue, textValue);
    }
  }

  public String operateInteger(DataDTO dto) {
    return Integer.toString(4 + dto.getInteger());
  }

  public String operateDecimal(DataDTO dto) {
    return String.format(US, "%.1f", 4.0 + dto.getDecimal());
  }

  public String operateText(DataDTO dto) {
    return String.format("HackerRank %s", dto.getText());
  }
}

class DataDTO {
  private int integer;
  private double decimal;
  private String text;

  public int getInteger() {
    return integer;
  }

  public double getDecimal() {
    return decimal;
  }

  public String getText() {
    return text;
  }

  public DataDTO(int integer, double decimal, String text) {
    this.integer = integer;
    this.decimal = decimal;
    this.text = text;
  }

  @Override
  public boolean equals(Object compared) {
    boolean isEquals;
    if (compared == this) {
      isEquals = true;
    } else if (!(compared instanceof DataDTO)) {
      isEquals = false;
    } else {
      DataDTO comparedDto = (DataDTO) compared;
      isEquals = integer == comparedDto.getInteger()
          && decimal == comparedDto.getDecimal()
          && text.equals(comparedDto.getText());
    }
    return isEquals;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + integer;
    result = prime * result + (int) decimal;
    result = prime * result + text.hashCode();
    return result;
  }

  @Override
  public String toString() {
    return String.format("DataDTO { integer: %s, decimal: %s, text: %s }", integer, decimal, text);
  }
}
