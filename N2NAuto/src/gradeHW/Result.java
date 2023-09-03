package gradeHW;

public class Result extends Grading {

	public static void main(String[] args) throws Throwable {

		System.err.println("Thank you for your input!");
		System.out.println();
		Thread.sleep(800);
		Result res = new Result();
		System.out.println("Student's Score in Bangla is " + res.BGpa);
		res.Bcal();
		Thread.sleep(800);
		System.out.println("Student's Score in English is " + res.EGpa);
		res.Ecal();
		Thread.sleep(800);
		System.out.println("Student's Score in Math is " + res.MGpa);
		res.Mcal();
		Thread.sleep(800);
		System.out.println("Student's Score in Physics is " + res.PGpa);
		res.Pcal();
		Thread.sleep(800);
		System.out.println();
		Thread.sleep(800);
		System.out.println("Student's Overall Gpa is " + res.Gpa);
		res.cal();
		Thread.sleep(800);
		// System.out.println(); res.cal();
	}
}
