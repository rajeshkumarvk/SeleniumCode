package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomCSSSelectors {
	
	static WebDriver driver;
	
	//Advantage of CSSSelector
	//It is simple and fast
	
	//Disadvantage of CSS Selectors: 
	//1. It doesn't support text
	//2. It doesn't support child to parent traverse
	//3. It doesn't support preceding siblings.

	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://app.hubspot.com/login/legacy");
	
		//1. id #id or tag#id
		//2 classname .classname or tag.classname
		
//		#input-email
//		input#input-email
		
//		.img-responsive
//			img.img-responsive
		
//		By image = By.cssSelector("img.img-responsive");
		
		//3. tag#id.classname
		
//		input#input-password.form-control
		

		//4. tag.classname#id

//			input.form-control#input-password
		
		//5. .class1.class2.class3.classn(for multiple class ) 
		
//			tag.c1.c2.c3.cn
//			.PrivateButton__StyledButton-dhfyll-0.iCEKZr
		
//			button.PrivateButton__StyledButton-dhfyll-0.iCEKZr
		
		//6. .class1.class2.class3.classn#id
		
//		button.PrivateButton__StyledButton-dhfyll-0.iCEKZr#loginBtn
		
		//7 #id.c1.c2.c3.cn
		
//			button#loginBtn.PrivateButton__StyledButton-dhfyll-0.iCEKZr
		
		//Other Attributes apart from id and class
		
//		htmltag[attr='value']- CSS
		//htmltag[@attr='value']- xpath
		
		
//		input[name='email']
//		input[placeholder='E-Mail Address']
		
//		htmltag[attr='value'][attr='value']
		
//		input[placeholder='E-Mail Address'][class='form-control']
		
//		htmltag[attr='value'][attr='value']#id
//		input[placeholder='E-Mail Address'][class='form-control']#input-email
		
//		htmltag[attr='value'][attr='value'].class
//		input[placeholder='E-Mail Address'][name='email'].form-control
		
//		htmltag[attr='value'][attr='value'].class#id
//		input[placeholder='E-Mail Address'][type='text'].form-control#input-email
		
//		htmltag[attr='value'][attr='value']#id.class
//		input[placeholder='E-Mail Address'][type='text']#input-email.form-control
		
		//9. Contains in CSS:  *=
		
//		tag[attr*='value']
//		input[placeholder*='E-Mail Address']
//		input[placeholder*='E-Mail Address']#input-email
		
		//10. starts-with in CSS: ^
		
//		tag[attr^='value']
//		input[placeholder^='E-Mail']
//		input[placeholder^='E-Mail']#input-email
		
		//11. ends-with in CSS: $
		
//		tag[attr$='value']
//		input[placeholder$='Address']
//		input[placeholder$='Address']#input-email
		
		//12. text() in CSS: NA
		
		//13. Parent to child: 
		//direct child > 
		
//		parentag > childtag
//		form>div
//		div.list-group>a
		
		//direct+indirect is space
//		parentag  childtag
		
//		div#content  input ---11(indirect child)
//		div#content>input  --0 (direct child)
		
		//14. child to parent: NA
		
		//15. preceding sibling : NA
		
		//16. forwarding sibling supported 
		
		//immediate sibling use +
		
//		label[for='input-email']+input
//		option[value= 'Algeria']+option -1
		
		//for siblings use ~(tilde)
		
//		option[value= 'Algeria']~option - 229
		
		
		//17. for indexing :
		
	//	select#id>option:first-child - 1st child element
//		select#id>option:last-child - last child element
		
		
// 		select#Form_getForm_Country>option:nth-of-type(2)  = 2nd index child
//		select#Form_getForm_Country>option:nth-of-type(n)  = all the elements
		
		
//		select#Form_getForm_Country>option:first-child    = first child
//		select#Form_getForm_Country>option:last-child    = last child
		

//		select#Form_getForm_Country>option:nth-child(5)   		 = 5th from first child	
//		select#Form_getForm_Country>option:nth-last-child(3)    = 3rd from last child	
//		select#Form_getForm_Country>option:nth-last-child(n)    =  all elements
		
		
		//select#id>option:nth-child(odd)
		//select#id>option:nth-child(even)
		
//		select#Form_getForm_Country>option:nth-child(n+5)    = from 5th to last child	
//		select#Form_getForm_Country>option:nth-child(5n)    = multiple of 5 from 5th
		
//		select#Form_getForm_Country>option:nth-child(odd)    = odd number child
//		select#Form_getForm_Country>option:nth-child(even)    = even number child
				
		//18. odd and even in Xpath
		//=======================
		
		
//		//select[@id='Form_getForm_Country']/option[position() mod 2=0]  - for even child
		
//		//select[@id='Form_getForm_Country']/option[position() mod 2=1] - for odd child
		
		
		//19. commas
	
		
//		input#username,input#password,input#remember,button#loginBtn
		
		
		By loginFields =By.cssSelector("input#username,input#password,input#remember,button#loginBtn");
		
		int loginFieldsCount =driver.findElements(loginFields).size();
		
		
		System.out.println(loginFieldsCount);
		
		if(loginFieldsCount ==4) {
			
			System.out.println("login fields are available in the page : PASS");
			
		}
		else {
			System.out.println("FAIL");
		}
	}
	
	
	//20. not in CSS
	
//  	input.form-control  - gives 7
//		input.form-control:not(input[name='search'])	- excludes search and gives 6
//		input.form-control:not(input[name='search'], input[name='firstname'])   - excludes search and firstname and gives 5

	//input.form-control:not(input[name='search']
	
	//21. Space in x-path
	
	
//     //option[normalize-space()='Angola']
	
	//21. Difference between Xpath and CSS
	
	//                              xpath 						CSS
	//1. syntax						complex						simple
	//2. Performance				good						good
	//3. text						yes							NA
	//4. parent to child			yes							yes
	//5. child to parent			yes							NA
	//6. preceding-sibling 			yes							NA
	//7. following-sibling 			yes							yes
	//8. dynamic elements			yes							yes
	//9.starts-with					yes							yes
	//10. ends-with 				NA							yes
	//11. comma						NA							yes
	//12. space 					yes							NA
	//13. not 						yes							yes
	//14. index						yes							yes
	//15. dot(.)					yes							NA
	//16. SVG						yes							NA
	//17. SHADOW DOM				NA							yes
	
	
	
}
