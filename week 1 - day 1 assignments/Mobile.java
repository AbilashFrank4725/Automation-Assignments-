package week1.assignments;

public class Mobile {
	public static void main(String[] args) {
		Mobile myMobile = new Mobile();
		myMobile.sendMessage();
		myMobile.shareDocument();
		myMobile.makeCall();
	}
	public void makeCall() {
		System.out.println("Call generated");
		
	}
	public void shareDocument() {
		System.out.println("Document Shared");
		
	}
	public void sendMessage() {
		System.out.println("Message sent");
	}
	

}





