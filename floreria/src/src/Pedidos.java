
package src;


public class Pedidos {
    
    
    String fechaVenta; // DIA/MES/AÑO
    int importeTotal;
    String [ ] listaFloresSolicitadas;
    int cantidad;

    public Pedidos(String fechaVenta, int importeTotal, String[] listaFloresSolicitadas, int cantidad) {
        this.fechaVenta = fechaVenta;
        this.importeTotal = importeTotal;
        this.listaFloresSolicitadas = listaFloresSolicitadas;
        this.cantidad = cantidad;
    }

    public String getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(String fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

    public int getImporteTotal() {
        return importeTotal;
    }

    public void setImporteTotal(int importeTotal) {
        this.importeTotal = importeTotal;
    }

    public String[] getListaFloresSolicitadas() {
        return listaFloresSolicitadas;
    }

    public void setListaFloresSolicitadas(String[] listaFloresSolicitadas) {
        this.listaFloresSolicitadas = listaFloresSolicitadas;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    
    
    
    
}
