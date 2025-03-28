public class Consola {
    private final MenuRegistro menuRegistro = new MenuRegistro();

    public void iniciar() {
        System.out.println("Bienvenido al modo consola:");
        menuRegistro.mostrarMenu();
    }
}