public class MenuRegistro {

    public void mostrarMenu() {
        while (true) {
            System.out.println("\nSeleccione una opción:");
            System.out.println("1. Registrar Estado");
            System.out.println("2. Registrar Municipio");
            System.out.println("3. Registrar Colonia");
            System.out.println("0. Salir");

            int opcion = ReadUtil.readInt();

            Entidad entidad;
            switch (opcion) {
                case 1:
                    entidad = new Estado();
                    break;
                case 2:
                    entidad = new Municipio();
                    break;
                case 3:
                    entidad = new Colonia();
                    break;
                case 0:
                    System.out.println("Saliendo del registro...");
                    return;
                default:
                    System.out.println("Opción no válida.");
                    continue;
            }

            registrarEntidad(entidad);
        }
    }

    public void registrarEntidad(Entidad entidad) {
        entidad.registrar();
    }
}