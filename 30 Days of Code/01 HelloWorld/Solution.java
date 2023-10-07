import static java.lang.System.in;
import static java.lang.System.out;
import static java.util.Locale.US;

import java.util.Scanner;

/**
 * @author Nelson Migliarini
 */
public class Solution {
  private static MessageService service = MessageService.getInstance();
  
  public static void main(String[] args) {
    MessageDTO dto = service.generateDTO(new Scanner(in));
    String message = service.generateMessage(dto);
    out.print(message);
  }
}

class MessageService {
  private static MessageService instance;
  private static final String baseMessage = "Hello, World.%n%s";

  private MessageService() {
  }

  public static MessageService getInstance() {
    if (instance == null) {
      instance = new MessageService();
    }
    return instance;
  }

  public MessageDTO generateDTO(Scanner scanner) {
    try (scanner) {
      scanner.useLocale(US);
      return new MessageDTO(scanner.nextLine());
    }
  }

  public String generateMessage(MessageDTO dto) {
    return String.format(baseMessage, dto.getMessage());
  }
}

class MessageDTO {
  private String message;

  public MessageDTO(String message) {
    this.message = message;
  }

  public String getMessage() {
    return message;
  }

  @Override
  public boolean equals(Object compared) {
    boolean isEquals;
    if (compared == null) {
      isEquals = false;
    } else if (!(compared instanceof MessageDTO)) {
      isEquals = false;
    } else {
      MessageDTO comparedDto = (MessageDTO) compared;
      isEquals = message.equals(comparedDto.getMessage());
    }
    return isEquals;
  }

  @Override
  public int hashCode() {
    return 31 * message.hashCode();
  }

  @Override
  public String toString() {
    return String.format("MessageDTO { message: %s }", message);
  }
}
