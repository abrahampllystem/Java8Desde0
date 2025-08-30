package pe.tcs.java8.defaultMethod;

public class DefaultMethod implements PersonaA,PersonaB{

	@Override
	public void caminar() {		
		System.out.println("Hola Tcser");
	}	
		
	@Override
	public void hablar() {
		PersonaB.super.hablar();
		System.out.println("Suscribanse Tcser");
	}
	
//	@Override
//	public void hablar() {
//		//System.out.println("hola clase");
//		PersonaB.super.hablar();
//	
//	}

	public static void main(String[] args) {
		DefaultMethod app = new DefaultMethod();
		app.hablar();
	}
	
}
