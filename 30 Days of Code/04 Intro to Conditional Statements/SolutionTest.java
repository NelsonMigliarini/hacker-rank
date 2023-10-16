import static org.junit.jupiter.api.Assertions.assertEquals;
import static java.lang.System.setIn;
import static java.lang.System.setOut;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Test;

/**
 * @author Nelson Migliarini
 */
public class SolutionTest {
  @Test
  public void test1() {
    String input = "3";
    String expectedOutput = "Weird";
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    setOut(new PrintStream(output));
    setIn(new ByteArrayInputStream(input.getBytes()));
    Solution.main(new String[0]);
    assertEquals(expectedOutput, output.toString());
  }

  @Test
  public void test2() {
    String input = "24";
    String expectedOutput = "Not Weird";
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    setOut(new PrintStream(output));
    setIn(new ByteArrayInputStream(input.getBytes()));
    Solution.main(new String[0]);
    assertEquals(expectedOutput, output.toString());
  }
}
