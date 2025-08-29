public class  iPhone extends iOS{
public void makeCall() {
		System.out.println("Added call");

	}
	
	public void sendSMS() {
		System.out.println("Added SMS");

	}
	
	
	public static void main(String[] args) {
		iphone sc=new iphone();
		sc.startApp();
		sc.increaseVolume();
                sc.shutdown();
		sc.makeCall();
                sc.sendSMS();
	}
	
}
