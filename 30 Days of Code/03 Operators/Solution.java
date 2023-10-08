import static java.lang.System.in;
import static java.lang.System.out;
import static java.util.Locale.US;

import java.util.Scanner;

/**
 * @author Nelson Migliarini
 */
public class Solution {
  private static CostService service = CostService.getInstance();

  public static void main(String[] args) {
    CostDTO costDto = service.generateDTO(new Scanner(in));
    int mealCost = service.getTotalCost(costDto);
    out.print(mealCost);
  }
}

class CostService {
  private static CostService instance;

  private CostService() {}

  public static CostService getInstance() {
    if (instance == null) {
      instance = new CostService();
    }
    return instance;
  }

  public CostDTO generateDTO(Scanner scanner) {
    try (scanner) {
      scanner.useLocale(US);
      double mealCost = scanner.nextDouble();
      long tipPercent = scanner.nextInt();
      long taxPercent = scanner.nextInt();
      return new CostDTO(mealCost, tipPercent, taxPercent);
    }
  }

  public int getTotalCost(CostDTO dto) {
    double tip = dto.getMealCost() / 100 * dto.getTipPercent();
    double tax = dto.getTaxPercent() / 100 * dto.getMealCost();
    double mealCost = dto.getMealCost() + tip + tax;
    return mealCost;
  }
}

class CostDTO {
  private double mealCost;
  private long tipPercent;
  private long taxPercent;

  public CostDTO(double mealCost, long tipPercent, long taxPercent) {
    this.mealCost = mealCost;
    this.tipPercent = tipPercent;
    this.taxPercent = taxPercent;
  }

  public double getMealCost() {
    return mealCost;
  }

  public long getTipPercent() {
    return tipPercent;
  }

  public long getTaxPercent() {
    return taxPercent;
  }

  @Override
  public boolean equals(Object compared) {
    boolean isEquals;
    if (compared == this) {
      isEquals = true;
    } else if (!(compared instanceof CostDTO)) {
      isEquals = false;
    } else {
      CostDTO comparedDto = (CostDTO) compared;
      isEquals = mealCost == comparedDto.getMealCost()
          && tipPercent == comparedDto.getTipPercent()
          && taxPercent == comparedDto.getTaxPercent();
    }
    return isEquals;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + mealCost;
    result = prime * result + tipPercent;
    result = prime * result + taxPercent;
    return result;
  }

  @Override
  public String toString() {
    return String.format("CostDTO { mealCost: %s, tipPercent: %s, taxPercent: %s }", mealCost, tipPercent, taxPercent);
  }
}
