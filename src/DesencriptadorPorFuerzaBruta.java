
public class DesencriptadorPorFuerzaBruta {
    Desencriptador desencriptador = new Desencriptador();
    RepositorDeAcciones repositor = new RepositorDeAcciones();

    String desencriptarPorFuerzaBruta(String textoEncriptado){
        String textoPosiblementeDesencriptado = "";
        String archivoDescodificado = "c:\\proyecto\\descodificado.txt";

        /*Se realiza un ciclo en un rango de 11 posibles soluciones*/
        for (int i = 0; i <=10 ; i++) {
            textoPosiblementeDesencriptado = desencriptador.desencriptar(textoEncriptado, i);
            /*valida si se encontraron cadenas de Strings conocidas*/
            boolean contienePalabraEnEspanol = hayPatronDePalabras(textoPosiblementeDesencriptado);

            if(contienePalabraEnEspanol){
                System.out.println("La clave es " +i);
                System.out.println("El texto desencriptado es: "+textoPosiblementeDesencriptado);
                repositor.guardarAarchivo(textoPosiblementeDesencriptado, archivoDescodificado);
            }
        }
        return textoPosiblementeDesencriptado;
    }
    /*Con base a un diccionario de palabras se obtiene el texto a buscar que coincida
    con algunos caracteres conocidos en el idiona español*/
    boolean hayPatronDePalabras(String texto){
        String[] diccionarioDePalabras = {" de ", " la ", " y ", " en ",
                " el ", " tu ", " o ", " si ", " es ", " que "};

        for (int i = 0; i < diccionarioDePalabras.length; i++) {
            if( texto.toLowerCase().contains(diccionarioDePalabras[i]) ){
                return true;
            }
        }
        return false;
    }
}