import java.util.Scanner;

public class ChallengeOne {

	public static void main(String[] args) {
		
		String question = "Capital of india is:";
		String choiceOne = "delhi";
		String choiceTwo = "mumbai";
		String choiceThree = "kolkata";
		
		String correctAnswer = choiceOne;
		
		System.out.println(question);
		System.out.println("choose on of the following :" + choiceOne + " ," + choiceTwo + " , " + choiceThree + " . " );
		//System.out.println(correctAnswer);
		
		Scanner sc = new Scanner(System.in);
		String input  = sc.next();
		
		if(correctAnswer.equals(input.toLowerCase())) {
			System.out.println("correct Answer Congrats!");
		}
		else {
			System.out.println("Wrong Answer Try Again!");
		}

	}

}
