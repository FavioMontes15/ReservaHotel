
package Data;

public class vhabitacion {

    private int id_habitacion;
    private String num_habitacion;
    private String piso;
    private String descripcion;
    private String caracteristicas;
    private Double precio_dia;
    private String estado;
    private String tipo_habitacion;

    public vhabitacion(int id_habitacion, String num_habitacion, String piso, String descripcion, String caracteristicas, Double precio_dia, String estado, String tipo_habitacion) {
        this.id_habitacion = id_habitacion;
        this.num_habitacion = num_habitacion;
        this.piso = piso;
        this.descripcion = descripcion;
        this.caracteristicas = caracteristicas;
        this.precio_dia = precio_dia;
        this.estado = estado;
        this.tipo_habitacion = tipo_habitacion;
    }

    public vhabitacion() {
    }

    public int getId_habitacion() {
        return id_habitacion;
    }

    public void setId_habitacion(int id_habitacion) {
        this.id_habitacion = id_habitacion;
    }

    public String getNum_habitacion() {
        return num_habitacion;
    }

    public void setNum_habitacion(String num_habitacion) {
        this.num_habitacion = num_habitacion;
    }

    public String getPiso() {
        return piso;
    }

    public void setPiso(String piso) {
        this.piso = piso;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCaracteristicas() {
        return caracteristicas;
    }

    public void setCaracteristicas(String caracteristicas) {
        this.caracteristicas = caracteristicas;
    }

    public Double getPrecio_dia() {
        return precio_dia;
    }

    public void setPrecio_dia(Double precio_dia) {
        this.precio_dia = precio_dia;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getTipo_habitacion() {
        return tipo_habitacion;
    }

    public void setTipo_habitacion(String tipo_habitacion) {
        this.tipo_habitacion = tipo_habitacion;
    }

}
