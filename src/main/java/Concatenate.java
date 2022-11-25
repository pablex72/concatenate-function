public class Concatenate {

    /*En este ejercicio tenéis que crear un bucle que permita concatenar textos e imprima el
    resultado final por consola.
    Tened en cuenta que los textos pueden venir de un array de tipo String. Por ejemplo:
    String[] nombres = {"", "", "", ""}*/

    public static void main(String[] args) {

        String[] nombres = {"hola", "como", "estas", "chau"};

        //System.out.println(nombres[0]+nombres[1]+nombres[2]);

        for (int i = 0; i< nombres.length; i++  ){
            System.out.println(nombres[i]);
        }

        for ( String nombre: nombres  ) {
            System.out.println(nombre);
        }

    }




}
