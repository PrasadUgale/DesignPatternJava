package mian;

public class Client {
	
	public static void main(String[] args) {
		ServiceLocator.loadService();
		
		MessagingService ms = ServiceLocator.getService("sms");
		ms.sendMessage("Send this SMS");
		
		ms = ServiceLocator.getService("email");
		ms.sendMessage("End Email");
	}
	
}
