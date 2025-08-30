package pe.tcs.java8.defaultMethod;

public interface PersonaB {

	default public void hablar(){
		System.out.println("Saludos Tcser - PersonaB");
	}
}
