import java.util.Scanner;
public class NathanDo {

	public static void main(String[] args) {
		//get the users input
		Scanner usersInput=new Scanner (System.in);
		System.out.println("What has to be broken before you can use it?");
		String usersChoice=usersInput.nextLine();
		//then find the answer
		if (usersChoice.equalsIgnoreCase("an egg"))
		{
			System.out.println("nice you got it correct");
			System.out.println("question 2");
			System.out.println("I知 tall when I知 young, and I知 short when I知 old. What am I?");
			String usersAnswer=usersInput.nextLine();
			if (usersAnswer.equalsIgnoreCase("a candle"))
			{
				System.out.println("nice you got it correct");
				System.out.println("question 3");
				System.out.println("What month of the year has 28 days?");
				String usersAnswer2=usersInput.nextLine();
				if (usersAnswer2.equalsIgnoreCase("all of them"))
				{
					System.out.println("nice you got it correct");
					System.out.println("pop question,What was the last thing we were working on");
					String usersAnswer3=usersInput.nextLine();
					if (usersAnswer3.equalsIgnoreCase("python turtle"))
					{
						System.out.println("nice you got all of them correct now we get to move on with the lesson :)");
		 
					}	
					else
					{
					System.out.println("incorrect, sorry but you will have to restart");
					}
					
				}
				else
				{
				System.out.println("incorrect, sorry but you will have to restart");
				}
				
			}
			else
			{
				System.out.println("incorrect, sorry but you will have to restart");
				}
				
		}
		else
		{
		System.out.println("incorrect, sorry but you will have to restart");
		}
		
	}

}
