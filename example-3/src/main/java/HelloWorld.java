import org.apache.log4j.Logger;

/**
 * TODO: comment here
 */

public class HelloWorld {
	private static final Logger logger = Logger.getLogger(HelloWorld.class);

	public static void main(String[] args) {
		MessageService messageService = new MessageService();
		String message = messageService.getMessage();
		logger.info("Received message: " + message);
	}
}