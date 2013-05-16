package behavioural.command;

import java.util.Scanner;

public class InvokerMenu {
	
	private Command option1;
	private Command option2;
	private Command option3;

	public Command getOption1() {
		return option1;
	}

	public void setOption1(Command option1) {
		this.option1 = option1;
	}

	public Command getOption2() {
		return option2;
	}

	public void setOption2(Command option2) {
		this.option2 = option2;
	}

	public Command getOption3() {
		return option3;
	}

	public void setOption3(Command option3) {
		this.option3 = option3;
	}

	private Scanner input=new Scanner(System.in);

	private void showMenu() {
		
		System.out.println("\n\n\nFor God's sake man, DO SOMETHING!\n\n");

		System.out.println("1. Created.");
		System.out.println("2. Update.");
		System.out.println("3. Delete.");

		System.out.println("0. Exit.");

	}

	public void acceptOption() {

		String choice = "";
		
		while (!choice.equals("0")) {
			
			showMenu();
			choice = input.next();
			
			switch (choice) {
			case "1":
				option1.execute();
				break;
			case "2":
				option2.execute();
				break;
			case "3":
				option3.execute();
				break;
			case "0":
				System.out.println("\n\n\nSo long, and thanks for all the fish.\n\n");
			default:
				System.out.println("\n\n\nWHAT ON EARTH ARE YOU DOING?\n\n");
					
			}
		}
		
	}

	public static void main(String[] args) {
		
		ReceiverEntity entity = new ReceiverEntity();

		InvokerMenu myMenu = new InvokerMenu();
		
		myMenu.setOption1(new CommandCreate(entity));
		myMenu.setOption2(new CommandUpdate(entity));
		myMenu.setOption3(new CommandDelete(entity));
		
		myMenu.acceptOption();
		
		
	}

}
