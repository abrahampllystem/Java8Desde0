package pe.tcs.java8.colecciones;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class ColeccionApp {

	private List<String> lista;

	public void llenarLista() {
		lista = new ArrayList<>();

		lista.add("Arturo");
		lista.add("Martin");
		lista.add("Karem");
		
	}

	public void usarForEach() {

	}

	public void usarRemoveIf() {

	}
	

	public void usarSort() {
		
	}

	public static void main(String... mitocode) {
		ColeccionApp app = new ColeccionApp();
		app.llenarLista();		
		//app.usarRemoveIf();
		app.usarSort();
		app.usarForEach();
	}

}
