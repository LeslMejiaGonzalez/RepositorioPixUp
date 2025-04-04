public class Colonia extends Entidad {
    private String codigoPostal;
    private int idMunicipio;

    @Override
    public void registrar() {
        System.out.println("Registro de Colonia:");
        System.out.print("Nombre: ");
        setNombre(ReadUtil.read());
        System.out.print("Código Postal: ");
        codigoPostal = ReadUtil.read();
        System.out.print("ID del Municipio: ");
        idMunicipio = ReadUtil.readInt();
        System.out.println("Colonia registrada: " + this);
    }

    @Override
    public String toString() {
        return super.toString() + ", Código Postal: " + codigoPostal + ", ID Municipio: " + idMunicipio;
    }
}