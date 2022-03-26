package ad.conditionalstatements;

import static ad.conditionalstatements.Types.WEIRD;
import static ad.conditionalstatements.Types.NOT_WEIRD;
import static java.lang.System.in;
import static java.lang.System.out;

import java.util.Scanner;

/**
 * @author Nelson Migliarini
 */
public class Solution {

	public static void main(String[] args) {
		try (var sc = new Scanner(in)) {
			var numberType = getType(sc.nextInt());
			out.println(numberType);
		}
	}

	public static Types getType(int value) {
		var type = NOT_WEIRD;
		if (value % 2 != 0 || (value >= 6 && value <= 20))
			type = WEIRD;
		return type;
	}
}

enum Types {
	WEIRD("Weird"), NOT_WEIRD("Not Weird");

	private final String value;

	private Types(String value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return value;
	}
}
