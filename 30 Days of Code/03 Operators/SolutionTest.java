import static org.junit.jupiter.api.Assertions.assertEquals;
import static java.lang.System.setIn;
import static java.lang.System.setOut;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Before;
import org.junit.Test;

/**
 * @author Nelson Migliarini
 */
public class SolutionTest {
  private static final ByteArrayOutputStream output = new ByteArrayOutputStream();

  @Before
  public void setOutputStream() {
    setOut(new PrintStream(output));
  }

  @Test
  public void testMain() {
    String input = "12.00\n20\n8";
    String expectedOutput = "15";
    setIn(new ByteArrayInputStream(input.getBytes()));
    Solution.main(new String[0]);
    assertEquals(expectedOutput, output.toString());
  }
}
