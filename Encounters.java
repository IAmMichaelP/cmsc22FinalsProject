package project;

import java.util.Scanner;
import java.util.Random;






abstract class Encounters {
	
    private static Scanner scan = new Scanner(System.in);
	protected int itemNum;
	
	public int answerParser (String answer) {
		try {
			  int num = Integer.parseInt(answer);
			  return num;
			} catch (NumberFormatException e) {
			  System.out.println("Invalid number format");
			  return 4;
			}
	}
	
	public int randomizer() {
		Random task = new Random(); 
		int taskNum = task.nextInt(6)+1;
		return taskNum;
	}

	
	public int task(int dabloonWallet){

		Random task = new Random(); 
		int taskNum = task.nextInt(1,6)+1;

		if(taskNum == 1) {//task1
			System.out.println("\n########################################################################################");
			System.out.println("An elderly cat is asking for your assistance to carry his luggage...");
			System.out.println("Help the elderly cat?");
			System.out.println("\n(Enter 1 to help, any other key to decline)");
			String answer = scan.nextLine();
			int parsedAnswer = answerParser(answer);

			if(parsedAnswer == 1) {
				System.out.println("\nYou have accepted the offer!");
				System.out.println("Elder Cat: Thank you for helping, here take this 70 dabloons.");
				dabloonWallet += 70;
				System.out.println("Dabloons after accepting offer: " + dabloonWallet);
			}
			else {
				System.out.println("\nOffer declined.");
			}
		}
		else if (taskNum == 2) {//task2
			System.out.println("\n########################################################################################");
			System.out.println("Encountered a NPC cat!");
			System.out.println("NPC cat is asking for your assistance to deliver letters to the village...");
			System.out.println("Accept task?");
			System.out.println("\n(Enter 1 to accept, any other key to decline)");
			String answer = scan.nextLine();
			int parsedAnswer = answerParser(answer);

			if(parsedAnswer == 1) {
				System.out.println("\nNPC Cat: Thanks for helping! ");
				System.out.println("NPC Cat: I'll pay you 100 dabloons. ");
				dabloonWallet += 100;
				System.out.println("Dabloons after accepting offer: " + dabloonWallet);
			}
			else {
				System.out.println("\nOffer declined.");

			}
		}
		else if(taskNum == 3) {
			System.out.println("\n########################################################################################");
			System.out.println("Lost NPC is asking for directions!");
			System.out.println("Help NPC?");
			System.out.println("\n(Enter 1 to help, any other key to decline)");
			String answer = scan.nextLine();
			int parsedAnswer = answerParser(answer);

			if(parsedAnswer == 1) {
				System.out.println("\nYou gave directions for free.");
				System.out.println("NPC: Thank you! Be careful on your journey...");
			}
			else {
				System.out.println("\nOffer declined.");
			}
		}
		else if(taskNum == 4) {
			System.out.println("\n########################################################################################");
			System.out.println("NPC offering Hot Soup!");
			System.out.println("Accept offer?");
			System.out.println("\n(Enter 1 to help, any other key to decline)");
			String answer = scan.nextLine();
			int parsedAnswer = answerParser(answer);

			if(parsedAnswer == 1) {
				System.out.println("\nSoup accepted.");
				System.out.println("NPC gave you 200 dabloons");
				dabloonWallet += 200;
			}
			else {
				System.out.println("\nSoup declined.");
			}
		}
		else if(taskNum == 5) {
			System.out.println("\n########################################################################################");
			System.out.println("NPC offering Bread!");
			System.out.println("Accept offer?");
			System.out.println("\n(Enter 1 to accept, any other key to decline)");
			String answer = scan.nextLine();
			int parsedAnswer = answerParser(answer);

			if(parsedAnswer == 1) {
				System.out.println("\nBread accepted.");
			}
			else {
				System.out.println("\nBread declined.");
			}
		}
		else if(taskNum == 6) {
			System.out.println("\n########################################################################################");
			System.out.println("Inn Owner: Hey, it's getting quite cold outside.");
			System.out.println("Inn Owner: Stay in my Inn?");
			System.out.println("Staying in Inn costs 100 dabloons.");
			System.out.println("\n(Enter 1 to stay, any other key to decline)");
			String answer = scan.nextLine();
			int parsedAnswer = answerParser(answer);

			if(parsedAnswer == 1) {
				if(dabloonWallet > 100) {
				System.out.println("\nStaying in the Inn.");
				dabloonWallet -= 100;
				System.out.println("Dabloons after accepting offer: " + dabloonWallet);
				}
				else {
					System.out.println("You don't have enough dabloons to stay in inn.");
				}

			}
			else {
				System.out.println("\nOffer declined.");
			}
		}
		else if(taskNum == 7) {
			System.out.println("\n########################################################################################");
			System.out.println("You found an empty cabin!");
			System.out.println("Enter cabin?");
			System.out.println("\n(Enter 1 to enter, any other key to decline)");
			String answer = scan.nextLine();
			int parsedAnswer = answerParser(answer);

			if(parsedAnswer == 1) {
				System.out.println("\nEntered cabin.");
				System.out.println("Lucky! You found 500 dabloons in the cabin!");
				dabloonWallet += 500;
			}
			else {
				System.out.println("\nOffer declined.");
			}
		}
		return dabloonWallet;

	}


	

}