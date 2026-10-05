public class LogArchivoLocal extends  DestinoLog{
    @Override
    public void guardarRegistro(String nivel, String mensaje) {
        System.out.println(" Escribiendo en '/var/log/sistema.log' -> [" + nivel + "] " + mensaje);
    }
}
