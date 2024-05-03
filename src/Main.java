import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Modulo I, Sintaxis en Java");
        System.out.println("por: Miguel Angel Fuentes Escobedo\n");
        System.out.println("Proyecto de Encriptacion");

        Encriptador encriptador = new Encriptador();
        RepositorDeAcciones repositor = new RepositorDeAcciones();

        System.out.print("Ingresa la ruta con el nombre del archivo a realizar codificacion Cesar : ");

        Scanner indicaRutadeArchivo = new Scanner(System.in);
        String nombreDeArchivo = indicaRutadeArchivo.nextLine();
        String ruta = Files.readString(Path.of(nombreDeArchivo));

        /*Se genera clave aleatoria y se pasa al metodo que cifrara al archivo codificado.txt */
        String textoEncriptado  = encriptador.asignarClaveAleatoria(ruta);
        String nombreArchivoCodificado = "c:\\proyecto\\codificado.txt";
        repositor.guardarAarchivo(textoEncriptado, nombreArchivoCodificado);

        /*Desencriptacion del archivo cifrado*/
        DesencriptadorPorFuerzaBruta desencriptador = new DesencriptadorPorFuerzaBruta();
        desencriptador.desencriptarPorFuerzaBruta(textoEncriptado);
    }
}