package FirstClass;

public class WhileLoop {
	int id;
	void display() {
		System.out.println(id);
	}
	public static void main(String[] args) {
	
		int i =2;
		while (i<=8){
		System.out.println(i);
		i+=2;
	
		WhileLoop wl = new WhileLoop();
		wl.display();
		
		
		
		}

}}
