package koalafix;

public class GuardarFormulario {
    
    private String nombre, cedula, descripcion, fallas, fecha, tipoEquipo;
    private String garantia;

    public GuardarFormulario() {
    }

    public String getFecha() {
        return fecha;
    }

    public String getGarantia() {
        return garantia;
    }

    public String getTipoEquipo() {
        return tipoEquipo;
    }

    public void setTipoEquipo(String tipoEquipo) {
        this.tipoEquipo = tipoEquipo;
    }

    public void setGarantia(String garantia) {
        this.garantia = garantia;
    }

        
    
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
    
    
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setFallas(String fallas) {
        this.fallas = fallas;
    }

    public String getCedula() {
        return cedula;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getFallas() {
        return fallas;
    }



    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    
}
