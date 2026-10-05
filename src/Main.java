//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    GestorAuditoria gestor = new GestorAuditoria();

    gestor.agregarDestino(new LogArchivoLocal());
    gestor.agregarDestino(new LogBaseDatos());
    gestor.agregarDestino(new LogServicioNube());

    gestor.difundirRegistro("CRÍTICO", "Falla imprevista en el pool de conexiones de la base de datos principal.");

    gestor.difundirRegistro("ADVERTENCIA", "Uso de memoria superó el 85% de la capacidad.");
}

