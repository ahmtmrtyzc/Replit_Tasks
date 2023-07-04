package ReplitTries;

import java.util.Scanner;

public class GiftCards {

	public static void main(String[] args) {

		int blanket, charger, hat, headphones, laptop, pants, pillow, smartphone, socks, usbCable;
		blanket = 60;
		charger = 25;
		hat = 25;
		headphones = 30;
		laptop = 200;
		pants = 50;
		pillow = 40;
		smartphone = 1000;
		socks = 5;
		usbCable = 10;
		int moneyWeHave = 100;

		Scanner input = new Scanner(System.in);
		System.out.println("What is your item: ");
		String item = input.next().toLowerCase();

		switch (String.valueOf(item)) {
		case "blanket":
			System.out.println("Thank you for your purchase!");
			int remaining1 = moneyWeHave - 60;
			System.out.println("Your current balance is:" + remaining1 + "$");
			break;
		case "charger":
			System.out.println("Thank you for your purchase!");
			int remaining2 = moneyWeHave - 25;
			System.out.println("Your current balance is:" + remaining2 + "$");
			break;
		case "hat":
			System.out.println("Thank you for your purchase!");
			int remaining3 = moneyWeHave - 25;
			System.out.println("Your current balance is:" + remaining3 + "$");
			break;
		case "headphones":
			System.out.println("Thank you for your purchase!");
			int remaining4 = moneyWeHave - 30;
			System.out.println("Your current balance is:" + remaining4 + "$");
			break;
		case "laptop":
			System.out.println("Sorry, not enough funds on your gift card!");
			break;
		case "smartphone":
			System.out.println("Sorry, not enough funds on your gift card!");
			break;
		case "pants":
			System.out.println("Thank you for your purchase!");
			int remaining5 = moneyWeHave - 50;
			System.out.println("Your current balance is:" + remaining5 + "$");
			break;
		case "pillow":
			System.out.println("Thank you for your purchase!");
			int remaining6 = moneyWeHave - 40;
			System.out.println("Your current balance is:" + remaining6 + "$");
			break;
		case "usb":
			System.out.println("Thank you for your purchase!");
			int remaining8 = moneyWeHave - 10;
			System.out.println("Your current balance is:" + remaining8 + "$");
			break;
		case "socks":
			System.out.println("Thank you for your purchase!");
			int remaining7 = moneyWeHave - 5;
			System.out.println("Your current balance is:" + remaining7 + "$");
			break;
		
		default:
			System.out.println("Invalid item!");
			break;

		}

	}

}
