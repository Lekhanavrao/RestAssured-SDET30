package commonLibrary;

import java.util.Random;

/**
 * This class contain generic method related to java
 * @author User1
 *
 */
public class JavaLibrary {
	
	
	/**
	 * This method will generate random number for every execution
	 * @return
	 */
	public int getRandomNumber() 
	{
		Random ran = new Random();
		return ran.nextInt(1000);
	}
	
	

}
