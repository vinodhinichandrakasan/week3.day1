package week3.day1;

public class SmartPhone extends AndroidPhone{
	
	
	public void connectWhatsapp()
	{
		System.out.println("connect to whatsapp");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SmartPhone smart=new SmartPhone();
		smart.connectWhatsapp();
		smart.makeCall();
		smart.saveContact();
		smart.sendMsg();
		smart.takeVideo();

	}
	 

}
