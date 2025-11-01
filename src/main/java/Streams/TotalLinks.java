package Streams;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotalLinks {
	
	static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 driver = new ChromeDriver();
		driver.get("https://freshworks.com");
		
//		driver.findElements(By.tagName("a"))
//				.stream()
//						.filter(e->!e.getText().isEmpty())
//							.forEach(e->System.out.println(e.getText()));
		
		
		//Difference between Stream and Parallel Stream
//In Stream - suppose you apply filter and collect- It will one by one for each elements in the stream 
//and it takes time to reach the final boundary
//It maintains the order and the it slow
		
//For parallel Stream-- It will have one stream for one element of the list and it will simultaneously operate
		//it is faster and it is not in order
		
		driver.findElements(By.tagName("a"))
			.parallelStream()
				.filter(e->!e.getText().isEmpty())
					.forEach(e->System.out.println(e.getText()));

	}

}
