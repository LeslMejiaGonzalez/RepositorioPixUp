public abstract class Entidad {
    protected String nombre;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public abstract void registrar();

    @Override
    public String toString() {
        return "Nombre: " + nombre;
    }
}