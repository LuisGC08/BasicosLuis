
public class basicos {

	

	/**
     * Método para mostrar ejemplos de tipos numericos.
     */
    public static void cadenas() {
    	 String cadena;
         cadena="HolaMundo";



           //Mostrar en pantalla el contendido de las variables de tipos básicos.
           
           
           System.out.println(cadena);
	  /**
     * Método para mostrar ejemplos de tipos numericos.
     */
    }
    public static void numericos() {

        //Estos son los tipos básicos
        byte elMasPeque;
        short chiquitin;
        int entero;
        long duplicaEntero;
        float grande;
        double doble;

        //Ejemplos de asignación de valores a las variables de tipos básicos
        entero = 10;
        doble = 5.6;

        //Mostrar en pantalla el contendido de las variables de tipos básicos.
        System.err.println("Valor entero");
        System.out.println(entero);
        System.out.println("Valor doble");
        System.out.println(doble);
    }


     
        
    
public static void main(String[] args) {
	// TODO Auto-generated method stub
	 numericos();  // Llamada al método
	 cadenas();
}
}

