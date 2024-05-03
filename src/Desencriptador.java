public class Desencriptador {
    RepositorDeAcciones repositorDeAcciones = new RepositorDeAcciones();
    /*Se procesa el texto encriptado con un corrimiento negativo*/
    String desencriptar(String textoEncriptado, int clave){
        int claveNegativa = -clave;
        String textoDesencriptado = repositorDeAcciones.cambiarLetrasDePalabra(textoEncriptado, claveNegativa);
        return textoDesencriptado;
    }
}