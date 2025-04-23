package mian;

import java.util.HashMap;
import java.util.Map;

public class ServiceLocator {
	
	private static Map<String, MessagingService> map = new HashMap<String, MessagingService>();
	
	public static void loadService() {
		map.put("sms", new SMSMessaging());
		map.put("email", new EmailMessaging());
		System.out.println("Service Loaded");
	}
	
	public static MessagingService getService(String service) {
		String req = service.toLowerCase();
		if(map.containsKey(req)) {
			return map.get(req);
		} else {
			System.out.println("Invalid Service Requested");
			return null;
		}
	}
	
}
