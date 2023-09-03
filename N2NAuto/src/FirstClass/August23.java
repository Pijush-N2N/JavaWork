package FirstClass;

public class August23 {
	int ins1 = 12;
	int ins2 = 14;
	static int st1 = 16;
	static int st2 = 18;
public static void main(String[] args) {
	August23 obj = new August23();
	obj.add();
	obj.insAdd();
	obj.paraAdd(1,2);
	obj.statAdd();
	}
	
	public void add() {
		int loc1 = 4;
		int loc2 = 6;
		int locAdd = loc1+loc2;
		System.out.println("Local total is " +locAdd);
	}

	public void insAdd() {
		int inAdd = ins1+ins2;
		System.out.println("Instancce total is "+ inAdd);
	}
	
	public static void statAdd() {
		int st = st1+st2;
		System.out.println("Static total is " +st);
	}
	public void paraAdd(int a, int b) {
		int c = a+b;
		System.out.println("Parameterized total is "+ c);
	}
}
