package hello;
/**
 * The HelloWorldApp class implements an application that
 * simply prints "Hello World!" to standard output.
 */
public class HelloWorld {
	/**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Hello World!"); // Display the string.
        System.out.println("Hello World!2");
        System.out.println(System.currentTimeMillis());
        String nombre = "Agustina Leonela";
        String apellido = "Orozco Reina";
        String linea= "__________________________";
        System.out.println(nombre+ " "+ apellido );
        System.out.println(linea);
        
        Bicicleta bici1= new Bicicleta();
        Bicicleta bici2= new Bicicleta();
        
        bici1.ponerColor("blanco");
        
        bici2.ponerColor("verde");
        
        System.out.println("color bici1: "+ bici1.dameColor());
        System.out.println("color bici2: "+ bici2.dameColor());
    }

}
