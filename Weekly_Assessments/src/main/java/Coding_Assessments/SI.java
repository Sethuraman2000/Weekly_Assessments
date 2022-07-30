package Coding_Assessments;

public class SI {
	static int principleAmount;
	static int rateOfInterest;
	static int tenure;
	static int simpleInterest;
	static int totalAmount;

	void simpleInterest(int principleAmount, int rateOfInterest, int tenure) {
		simpleInterest = (principleAmount * rateOfInterest * tenure) / 100;
		System.out.println("Simple Interest is " + simpleInterest);
		totalAmount = (principleAmount + simpleInterest);
		System.out.println("Total amount to be paid after loan duration ends is " + totalAmount);

	}

}
