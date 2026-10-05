public class LogServicioNube extends DestinoLog{
    @Override
    public void guardarRegistro(String nivel, String mensaje) {
        System.out.println(" Enviando payload HTTPS cifrado a AWS CloudWatch -> [" + nivel + "] " + mensaje);
    }
}
