package pe.tcs.java8;

import java.util.List;

public class EjerciciosBasico {
	/**
     * Convertir a may�sculas cada una de las palabras recibidas como par�metro.
     * Trata de usar uno de los nuevos m�todos adicionados a las listas en Java 8, verifica cual m�todo permite
     * reemplazar los items de la lista por medio de una funci�n.
     *
     * @param palabras Listado de palabras a convertir
     * @return Lista que contiene las palabras en may�sculas
     */
    public List<String> ejercicio1(List<String> palabras) {
        throw new UnsupportedOperationException();
    }

    /**
     * Del listado de cadenas de texto eliminar las cadenas de ese listado cuyo tama�o sea inferior o igual a 10 caracteres.
     * Trata de usar uno de los nuevos m�todos adicionados a las listas en Java 8
     *
     * @param listado cadenas de texto. Atenci�n: Este listado es no modificable, por lo que una nueva lista de debe ser
     * creada a partir de este listado, por ejemplo: {@code List<String> nuevaLista = new ArrayList<>(listado);}
     * @return lista que contiene cadenas de texto cuyo tama�o de caracteres es superior a 10
     */
    public List<String> ejercicio2(List<String> listado) {
        throw new UnsupportedOperationException();
    }

    /**
     * Del listado pasado como par�metro, une la tercera, cuarta y quinta cadena separadas por gui�n (-).
     * Usa la API Stream y sus m�todos que permiten saltar y limitar el stream.
     *
     * @param listado cadenas de texto
     * @return Cadena de texto que se compone de la tercera, cuarta y quinta cadena de texto separadas por guiones
     * @see java.util.stream.Stream
     * @see java.util.stream.Collectors
     */
    public String ejercicio3(List<String> listado) {
        throw new UnsupportedOperationException();
    }

    /**
     * Ordernar el listado pasado como par�metro usando orden natural num�rico.
     * Atenci�n, el listado contiene n�meros como cadenas de texto, por lo tanto, se debe hacer conversi�n.
     * Usa la API Stream
     *
     * @param listado n�meros a ordenar
     * @return Listado de n�meros en orden natural
     * @see java.util.stream.Stream
     * @see java.util.stream.Collectors
     */
    public List<Integer> ejercicio4(List<String> listado) {
        throw new UnsupportedOperationException();
    }

    /**
     * Ordernar el listado pasado como par�metro primero por tama�o de la cadena de texto y luego alfabeticamente
     * Usa la API Stream.
     * Crea un {@code Comparator<String>} compuesto para que compares primero por el tama�o y luego alfabeticamente.
     *
     * @param listado cadenas de texto a ordenar
     * @return Listado ordenado primero por n�mero de caracteres y luego alfabeticamente
     * @see java.util.stream.Stream
     * @see java.util.stream.Collectors
     */
    public List<String> ejercicio5(List<String> listado) {
        throw new UnsupportedOperationException();
    }
}
