import java.util.ArrayList;
import java.util.List;
public class GestorAuditoria {
    List<DestinoLog>destinos = new ArrayList<>();
    void agregarDestino(DestinoLog destino){
        destinos.add(destino);
    }


    void difundirRegistro(String nivel, String mensaje){
        System.out.println(">>> Iniciando difusión de auditoría para nivel: " + nivel + " <<<");
        for(DestinoLog destino: destinos){
            destino.guardarRegistro(nivel, mensaje);
        }
        System.out.println(">>> Difusión completada con éxito <<<\n");

    }
}
