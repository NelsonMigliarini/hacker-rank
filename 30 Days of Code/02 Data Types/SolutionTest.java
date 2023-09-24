import static org.junit.jupiter.api.Assertions.assertEquals;
import static java.lang.System.setIn;
import static java.lang.System.setOut;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Before;
import org.junit.Test;

public class SolutionTest {
  private static final ByteArrayOutputStream output = new ByteArrayOutputStream();
  
  @Before
  public void setUpStreams() {
    setOut(new PrintStream(output));
  }

  @Test
  public void testMain() {
    String input = "12\n4.0\nis the best place to learn and practice coding!";
    String expectedOutput = "16\r\n8.0\r\nHackerRank is the best place to learn and practice coding!\r\n";
    setIn(new ByteArrayInputStream(input.getBytes()));
    Solution.main(new String[0]);
    assertEquals(expectedOutput, output.toString());
  }
}
