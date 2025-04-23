package mian;

public class EmailMessaging implements MessagingService {

	@Override
	public void sendMessage(String message) {
		System.out.println("Email has been sent :" + message);

	}

}
