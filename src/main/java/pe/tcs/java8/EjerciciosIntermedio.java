package pe.tcs.java8;

import java.nio.file.Path;
import java.util.List;
import java.util.Map;
import java.util.OptionalInt;

public class EjerciciosIntermedio {
	static final String REGEXP = "[- .:,]+"; // separa cadenas de texto en palabras

    /**
     * Contar el n�mero de l�neas no vac�as que tiene el archivo pasado por par�metro.
     * Usar nuevos m�todos encontrados en la clase java.nio.file.Files en Java 8 para obtener un Stream de 
     * las l�neas de texto un archivo.
     *
     * @param archivo Ruta al archivo que se desea evaluar
     * @return Cantidad de l�neas en el archivo
     * @see java.nio.file.Files
     * @see java.util.stream.Stream
     */
    public long ejercicio1(Path archivo) {
        throw new UnsupportedOperationException();
    }

    /**
     * Encuentra el n�mero de caracteres que tiene la l�nea m�s larga del archivo.
     * Usar nuevos m�todos encontrados en la clase java.nio.file.Files en Java 8 para obtener un Stream de 
     * las l�neas de texto de un archivo.
     * Para poder obtener un OptionalInt como resultado, debes convertir el Stream a uno primitivo. 
     *
     * @param archivo Ruta al archivo que se desea evaluar
     * @return Cantidad de caracteres que tiene la l�nea m�s larga del archivo
     * @see java.nio.file.Files
     * @see java.util.stream.Stream
     * @see java.util.stream.IntStream
     */
    public OptionalInt ejercicio2(Path archivo) {
        throw new UnsupportedOperationException();
    }

    /**
     * De las palabras que se encuentran en el archivo pasado por par�metro, conviertelas a min�sculas,
     * sin duplicados, ordenadas primero por tama�o y luego alfabeticamente.
     *
     * Une todas las palabras en una cadena de texto separando cada palabra por un espacio (" ")
     *
     * Usa la constante REGEXP proveida al inicio de esta clase para hacer la separaci�n de cadenas de texto a palabras. 
     * Es posible que esta expresi�n retorne palabras vac�as por lo que tendr�s que adicionar un filtro que las remueva.
     *
     * @param archivo Ruta al archivo que se desea evaluar
     * @return Cadena de texto que contiene las palabras en min�sculas, sin duplicados, ordenadas por tama�o, luego alfabeticamente
     * y cada palabra est� separada por un espacio
     * @see java.nio.file.Files
     * @see java.util.stream.Stream
     * @see java.lang.String
     * @see java.util.stream.Collectors
     */
    public String ejercicio3(Path archivo) {
        throw new UnsupportedOperationException();
    }

    /**
     * Categorizar TODAS las palabras de las primeras 10 l�neas del archivo pasado por par�metro en un Map cuya llave es el
     * n�mero de caracteres y el valor es el listado de palabras que tienen esa cantidad de caracteres
     *
     * Usa la constante REGEXP proveida al inicio de esta clase para hacer la separaci�n de cadenas de texto a palabras. Es posible
     * que esta expresi�n retorne palabras vac�as por lo que tendr�s que adicionar un filtro que las remueva.
     *
     * @param archivo Ruta al archivo que se desea evaluar
     * @return Map cuya llave es la cantidad de caracteres y valor es el listado de palabras que tienen esa cantidad de
     * caracteres en las primeras 10 l�neas del archivo
     * @see java.nio.file.Files
     * @see java.util.stream.Stream
     * @see java.lang.String
     * @see java.util.stream.Collectors
     */
    public Map<Integer, List<String>> ejercicio4(Path archivo) {
        throw new UnsupportedOperationException();
    }


    /**
     * Categorizar TODAS las palabras de las primeras 100 l�neas del archivo pasado por par�metro en un Map cuya llave es la
     * palabra y el valor es la cantidad de veces que se repite la palabra
     * <p/>
     * Usa la constante REGEXP proveida al inicio de esta clase para hacer la separaci�n de cadenas de texto a palabras. Es posible
     * que esta expresi�n retorne palabras vac�as por lo que tendr�s que adicionar un filtro que las remueva.
     *
     * @param archivo Ruta al archivo que se desea evaluar
     * @return Map cuya llave son las palabras de las primeras 100 l�neas del archivo y su valor es la cantidad de veces que se repite
     * dicha palabra en las primeras 100 l�neas del archivo
     * @see java.nio.file.Files
     * @see java.util.stream.Stream
     * @see java.lang.String
     * @see java.util.stream.Collectors
     */
    public Map<String, Long> ejercicio5(Path archivo) {
        throw new UnsupportedOperationException();
    }

    /**
     * Crear una doble agrupaci�n de palabras �nicas del archivo pasado por par�metro. Hacer la agrupaci�n
     * en dos Maps. El Map externo tiene como llave la primera letra de la palabra en may�sculas y como valor otro Map (el interno).
     * El Map interno debe tener como llave la cantidad de letras y como valor un listado de palabras que tienen esa cantidad
     * de letras.
     * <p/>
     * Por ejemplo, dadas las palabras "ermita sebastian sanisidro sancipriano cristorey chipichape"
     * El Map externo tendr� las llaves "E", "C", "S"
     * El valor para la llave "S" debe ser un Map con dos llaves: llave 9 y valor [sebastian sanisidro] (una lista de dos palabras)
     * y otra llave 11 con el valor [sancipriano] (una lista de un solo item)
     * <p/>
     * Usa la constante REGEXP proveida al inicio de esta clase para hacer la separaci�n de cadenas de texto a palabras. Es posible
     * que esta expresi�n retorne palabras vac�as por lo que tendr�s que adicionar un filtro que las remueva.
     * Pista: Pasa las palabras a min�sculas para que el m�otodo distinct las pueda filtrar correctamente
     *
     * @param archivo Ruta al archivo que se desea evaluar
     * @return Map cuya llave es la primera letra en may�sculas de las palabras del archivo y su valor es otro Map cuya llave es la
     * cantidad de letras y su valor es el listado de palabras que tienen esa cantidad de letras
     * @see java.nio.file.Files
     * @see java.util.stream.Stream
     * @see java.lang.String
     * @see java.util.stream.Collectors
     */
    public Map<String, Map<Integer, List<String>>> ejercicio6(Path archivo) {
        throw new UnsupportedOperationException();
    }
}
