package pe.tcs.java8.anotaciones;

public @interface AnnotacionCustom {

	String nombre();
	boolean habilitado() default true;
}
