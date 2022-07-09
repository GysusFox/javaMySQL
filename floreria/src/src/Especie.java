
package src;


public class Especie {
    
    
    String nombre;
    String epocaFloracion;
    String estacioPlantacion;
    String tipoSueloPlantacion;
    int tiempoExposicion;

    public Especie(String nombre, String epocaFloracion, String estacioPlantacion, String tipoSueloPlantacion, int tiempoExposicion) {
        this.nombre = nombre;
        this.epocaFloracion = epocaFloracion;
        this.estacioPlantacion = estacioPlantacion;
        this.tipoSueloPlantacion = tipoSueloPlantacion;
        this.tiempoExposicion = tiempoExposicion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEpocaFloracion() {
        return epocaFloracion;
    }

    public void setEpocaFloracion(String epocaFloracion) {
        this.epocaFloracion = epocaFloracion;
    }

    public String getEstacioPlantacion() {
        return estacioPlantacion;
    }

    public void setEstacioPlantacion(String estacioPlantacion) {
        this.estacioPlantacion = estacioPlantacion;
    }

    public String getTipoSueloPlantacion() {
        return tipoSueloPlantacion;
    }

    public void setTipoSueloPlantacion(String tipoSueloPlantacion) {
        this.tipoSueloPlantacion = tipoSueloPlantacion;
    }

    public int getTiempoExposicion() {
        return tiempoExposicion;
    }

    public void setTiempoExposicion(int tiempoExposicion) {
        this.tiempoExposicion = tiempoExposicion;
    }
    
    
    
    
}
