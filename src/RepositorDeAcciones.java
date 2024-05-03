import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class RepositorDeAcciones {
    /*
    * Metodo que cambia el codigo de letra con base a un determinado valor de corrimiento, que
    * representa el Cifrado Cesar que se basa en correr cada letra segun el numero de posiciones seleccionado */
    private char cambiarLetra(char letraSinEncriptar, int clave){
        int codigoDeLetraEncriptada = letraSinEncriptar + clave;
        char letraEncriptada = (char) codigoDeLetraEncriptada;
        return letraEncriptada;
    }
    /*Se encarga de ir juntando los codigos modificados en una nueva cadena de caracteres*/
    String cambiarLetrasDePalabra(String textoOriginal, int clave){
        StringBuilder creadorDeCadenas = new StringBuilder();
        for (int i = 0; i < textoOriginal.length(); i++) {
            char caracterSinEncriptar = textoOriginal.charAt(i);
            char letraEncriptada =  cambiarLetra(caracterSinEncriptar, clave);
            creadorDeCadenas.append(letraEncriptada);
        }
        String textoEncriptado = creadorDeCadenas.toString();
        return textoEncriptado;
    }
    /*Se realiza la escritura en el archivo final de proceso de cifrado y descifrado*/
    void guardarAarchivo(String textoFuente, String nombreArchivo){
        try( FileWriter rutaArchivoAescribir = new FileWriter(nombreArchivo) ){
            rutaArchivoAescribir.write( new String( textoFuente ) );
            System.out.println("\nInformación guardada en archivo: "+ new String( textoFuente ) );
            rutaArchivoAescribir.flush();
        } catch (Exception e){
            System.out.println("Algo salio mal " + e);
        }
    }
}