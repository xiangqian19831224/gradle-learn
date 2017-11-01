import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * TODO: comment here
 */
public class MessageServiceTest {

	private MessageService messageService;

	@Before
	public void setUp(){
		messageService = new MessageService();
	}

	@Test
	public void getMessage(){
		assertEquals("Hello World!", messageService.getMessage());
	}
}
