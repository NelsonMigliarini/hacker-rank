import static java.lang.System.setIn;
import static java.lang.System.setOut;
import static org.junit.jupiter.api.Assertions.assertEquals;

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
  public void setUpStreams() {
    setOut(new PrintStream(output));
  }

  @Test
  public void testMain() {
    String input = "Welcome to 30 Days of Code!";
    String expectedOutput = "Hello, World.\r\nWelcome to 30 Days of Code!";
    setIn(new ByteArrayInputStream(input.getBytes()));
    Solution.main(new String[0]);
    assertEquals(expectedOutput, output.toString());
  }
}