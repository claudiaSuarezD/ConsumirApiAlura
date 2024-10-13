public class ConversorMoneda {

    private String monedaOrigen;
    private String monedaConvertir;

    private double cantidad;

    private double resultado;

    public ConversorMoneda(String monedaOrigen, String monedaConvertir, double cantidad) {
        this.monedaOrigen = monedaOrigen;
        this.monedaConvertir = monedaConvertir;
        this.cantidad = cantidad;
    }

    public String getMonedaOrigen() {
        return monedaOrigen;
    }

    public void setMonedaOrigen(String monedaOrigen) {
        this.monedaOrigen = monedaOrigen;
    }

    public String getMonedaConvertir() {
        return monedaConvertir;
    }

    public void setMonedaConvertir(String monedaConvertir) {
        this.monedaConvertir = monedaConvertir;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado =resultado;
    }

    public void convertirMoneda(Conversor conversor){
        this.resultado=this.cantidad * conversor.conversion_rate();
    }

    public void mostrarResultado(){
        System.out.println("El valor de: " + cantidad + " "+ monedaOrigen + "es igual a: " + resultado + " "+ monedaConvertir);
    }

    @Override
    public String toString() {
        return "(MonedaOrigen " + monedaOrigen
                + " MonedaConvertir "+ monedaConvertir
                + " Cantidad " + cantidad
                + "resultado" + resultado+ " )";
    }
}
