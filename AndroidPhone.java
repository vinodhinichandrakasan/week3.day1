package week3.day1;

public class AndroidPhone extends Mobile {
	  public void takeVideo()
	  {
		  System.out.println("take a video");
	  }
	  
	  //main method
	  
	  public static void main(String[] args) {
	    AndroidPhone android=new AndroidPhone();
	    android.saveContact();
	    android.sendMsg();
	    android.makeCall();
	    android.takeVideo();
	    
	  }
}
