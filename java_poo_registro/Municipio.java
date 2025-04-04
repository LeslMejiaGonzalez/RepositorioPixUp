public class Municipio extends Entidad {
    private int idEstado;

    @Override
    public void registrar() {
        System.out.println("Registro de Municipio:");
        System.out.print("Nombre: ");
        setNombre(ReadUtil.read());
        System.out.print("ID del Estado: ");
        idEstado = ReadUtil.readInt();
        System.out.println("Municipio registrado: " + this);
    }

    @Override
    public String toString() {
        return super.toString() + ", ID Estado: " + idEstado;
    }
}