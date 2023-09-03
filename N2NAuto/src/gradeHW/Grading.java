package gradeHW;

public class Grading extends InputScore {

	int Gpa = ((Bangla + English + Math + Physics) / 4);
	int BGpa = Bangla;
	int EGpa = English;
	int MGpa = Math;
	int PGpa = Physics;

	void cal() {
		if (Gpa <= 40)
			System.err.println(" student failed");
		else if (Gpa > 60 && Gpa <= 70)
			System.err.println(" Student's Overall grade is D");
		else if (Gpa > 70 && Gpa <= 80)
			System.err.println(" Student's Overall grade is C");
		else if (Gpa > 80 && Gpa <= 90)
			System.err.println(" Student's Overall grade is B");
		else if (Gpa > 90 && Gpa <= 100)
			System.err.println(" Student's Overall grade is A");
		else if (Gpa < 0)
			System.err.println(" It's a negetive number!");
		else if (Gpa > 100)
			System.err.println(" It's over 100!");
	}

	void Bcal() {
		if (BGpa <= 40)
			System.err.println(" student failed");
		else if (BGpa > 60 && BGpa <= 70)
			System.err.println(" Student's grade in Bangla is D");
		else if (BGpa > 70 && BGpa <= 80)
			System.err.println(" Student's grade in Bangla is C");
		else if (BGpa > 80 && BGpa <= 90)
			System.err.println(" Student's grade in Bangla is B");
		else if (BGpa > 90 && BGpa <= 100)
			System.err.println(" Student's grade in Bangla is A");
		else if (BGpa < 0)
			System.err.println(" It's a negetive number!");
		else if (BGpa > 100)
			System.err.println(" It's over 100!");
	}

	void Ecal() {
		if (EGpa <= 40)
			System.err.println(" student failed");
		else if (EGpa > 60 && EGpa <= 70)
			System.err.println(" Student's grade in English is D");
		else if (EGpa > 70 && EGpa <= 80)
			System.err.println(" Student's grade in English is C");
		else if (EGpa > 80 && EGpa <= 90)
			System.err.println(" Student's grade in English is B");
		else if (EGpa > 90 && EGpa <= 100)
			System.err.println(" Student's grade in English is A");
		else if (EGpa < 0)
			System.err.println(" It's a negetive number!");
		else if (EGpa > 100)
			System.err.println(" It's over 100!");
	}

	void Mcal() {
		if (MGpa <= 40)
			System.err.println(" student failed");
		else if (MGpa > 60 && MGpa <= 70)
			System.err.println(" Student's grade in Math is D");
		else if (MGpa > 70 && MGpa <= 80)
			System.err.println(" Student's grade in Math is C");
		else if (MGpa > 80 && MGpa <= 90)
			System.err.println(" Student's grade in Math is B");
		else if (MGpa > 90 && MGpa <= 100)
			System.err.println(" Student's grade in Math is A");
		else if (MGpa < 0)
			System.err.println(" It's a negetive number!");
		else if (MGpa > 100)
			System.err.println(" It's over 100!");
	}

	void Pcal() {
		if (PGpa <= 40)
			System.err.println(" student failed");
		else if (PGpa > 60 && PGpa <= 70)
			System.err.println(" Student's grade in Physics is D");
		else if (PGpa > 70 && PGpa <= 80)
			System.err.println(" Student's grade in Physics is C");
		else if (PGpa > 80 && PGpa <= 90)
			System.err.println(" Student's grade in Physics is B");
		else if (PGpa > 90 && PGpa <= 100)
			System.err.println(" Student's grade in Physics is A");
		else if (PGpa < 0)
			System.err.println(" It's a negetive number!");
		else if (PGpa > 100)
			System.err.println(" It's over 100!");
	}
}
