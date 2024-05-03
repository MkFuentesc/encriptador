
import java.io.FileWriter;

public class Encriptador {
    RepositorDeAcciones repositorDeAcciones = new RepositorDeAcciones();

    String encriptar(String textoSinEncriptar, int clave){
        String textoEncriptado = repositorDeAcciones.cambiarLetrasDePalabra(textoSinEncriptar, clave);
        return  textoEncriptado;
    }
    /*Se genera una clave aleatoria de 0 a 10 para realizar el Cifrado Cesar y se pasa al metodo que lo encriptara*/
    String asignarClaveAleatoria(String textoSinEncriptar){
        int claveAleatoria = (int) (Math.random() * 10);
        System.out.println("Clave: "+claveAleatoria);
        String textoEncriptado = encriptar(textoSinEncriptar, claveAleatoria);
        return textoEncriptado;
    }
}