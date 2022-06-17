
package paquete1;

public class DocenteFactura extends Docente {

    private double valorFactura;
    private double valorIva;
    private double valorCancelar;

    public DocenteFactura() {

    }

    public void establecerValorFactura(double s) {
        valorFactura = s;
    }

    public double obtenerValorFactura() {
        return valorFactura;
    }

    public void establecerValorIvaDescuento(double ivades) {
        valorIva = ivades;
    }

    public double obtenerValorIvaDescuento() {
        return valorIva;
    }

    public void calcularValorCancelar() {
        double valorc = 0;
        valorc = valorFactura - (valorFactura * (valorIva / 100));
        valorCancelar = valorc;
    }

    public double obtenerValorCancelar() {
        return valorCancelar;
    }

    @Override
    public String toString() {
        String reporte = String.format(super.toString());
        reporte = String.format("%s\n"
                + "Valor Factura: %.2f\n"
                + "Valor iva Descuento: %.2f\n"
                + "Valor cancelar: %.2f\n", reporte,
                obtenerValorFactura(),
                obtenerValorIvaDescuento(),
                obtenerValorCancelar());
        return reporte;

    }

}
