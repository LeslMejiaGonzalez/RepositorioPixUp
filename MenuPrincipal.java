public class MenuPrincipal {
    public void mostrarMenu() {
        while (true) {
            System.out.println("\nSeleccione el modo de operación:");
            System.out.println("1. Consola");
            System.out.println("2. Ventana");
            System.out.println("0. Salir");

            int opcion = ReadUtil.readInt();

            switch (opcion) {
                case 1:
                    Consola consola = new Consola();
                    consola.iniciar();
                    break;
                case 2:
                    Ventana ventana = new Ventana();
                    ventana.iniciar();
                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    return;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        }
    }
}