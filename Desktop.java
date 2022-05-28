package week3.day1;

public class Desktop extends Computer{
	
	//desktopSize method
	public void desktopSize()
	{
		System.out.println("desktop size");
	}
	//main method
	public static void main(String[] args) {
		// obj creation
		Desktop device=new Desktop();
		//extending method from Computer class
		device.computerModel();
		//calling method from the class
		device.desktopSize();
		

	}

}
