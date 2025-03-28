public class Estado extends Entidad {
    private String codigo;

    @Override
    public void registrar() {
        System.out.println("Registro de Estado:");
        System.out.print("Nombre: ");
        setNombre(ReadUtil.read());
        System.out.print("Código: ");
        codigo = ReadUtil.read();
        System.out.println("Estado registrado: " + this);
    }

    @Override
    public String toString() {
        return super.toString() + ", Código: " + codigo;
    }
}