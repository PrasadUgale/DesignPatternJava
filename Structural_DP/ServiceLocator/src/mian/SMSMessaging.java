package mian;

public class SMSMessaging implements MessagingService {

	@Override
	public void sendMessage(String message) {
		System.out.println("Sms has been sent :" + message);
	}

}
