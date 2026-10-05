public class LogBaseDatos extends  DestinoLog{
    @Override
    public void guardarRegistro(String nivel, String mensaje) {
        System.out.println(" Conenctando a PostgreSQL e insertando registros -> [" + nivel + "] " + mensaje);
    }
}
