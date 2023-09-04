//Android is one of the best operating systems in the world that helps the billion of users who use smart phones and tablets. Also, Android versions always had some funny names related to sweets. In this assignment, you need to write a program that will print a name of Android version, based on number. Please refer to the link beneath, in order to develop your if statement.
//https://www.javatpoint.com/android-versions

//1. Create an object of **_Scanner_** class named **_scanner. (DONE)_**
//2. Create **_double_** variable named **_version._ (DONE)**
//3. Write an if statement that will print android version name based on value of the **_version_** variable.

package ReplitTries;

import java.util.Scanner;

public class AndroidVersions {

	public static void main(String[] args) {
		
	    
	    Scanner input = new Scanner(System.in);
	    double version = input.nextDouble();
	    switch(String.valueOf(version)){
	      case "1.5" : System.out.println("Cupcake");
	        break;
	      case "1.6" :System.out.println("Donut");
	        break;
	      case "2.1" :System.out.println("Eclair");
	        break;
	      case "2.2" : System.out.println("Froyo");
	        break;
	      case "2.3" : System.out.println("Gingerbread");
	        break;
	      case "3.1" :System.out.println("Honeycomb");
	        break;
	      case "4.0" :System.out.println("Ice Cream Sandwich");
	        break;
	      case "4.1" : System.out.println("Jelly Bean");
	        break;
	      case "4.4" : System.out.println("KitKat");
	        break;
	      case "5.0" :System.out.println("Lollipop");
	        break;
	      case "8.0" :System.out.println("Oreo");
	        break;
	      case "9.0" : System.out.println("Pie");
	        break;
	      default : System.out.println("Sorry, I don't know this version!");
	        break;
	    }
	    //WRITE YOUR CODE HERE:


	    
	  }
	}
