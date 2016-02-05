package at.bals.dataStack;

public class Main {
	public static void main(String[] args) {
		
		NodeStack ns = new NodeStack();
		ns.push(7);
		ns.push(10);
		ns.push(12);
		ns.push(2);

		System.out.println("Die POP liefert das zurück: " + ns.pop().getValue());
		System.out.println("Die POP liefert das zurück: " + ns.pop().getValue());
		
		ns.outline();
	}
}
