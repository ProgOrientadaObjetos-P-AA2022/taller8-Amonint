
package paquete1;

public class DocenteNombramiento extends Docente {

    private double valorSueldo;
    private double valorHoraExtra;
    private double numeroHorasExtras;
    private double sueldoFinal;

    public DocenteNombramiento() {

    }

    public void establecerValorSueldo(double s) {
        valorSueldo = s;
    }

    public double obtenerValorSueldo() {
        return valorSueldo;
    }

    public void establecerValorHoraExtra(double horaEx) {
        valorHoraExtra = horaEx;
    }

    public double obtenerValorHoraExtra() {
        return valorHoraExtra;
    }

    public void establecerNumeroHorasExtras(double numeroHorasE) {
        numeroHorasExtras = numeroHorasE;
    }

    public double obtenerNumeroHorasExtras() {
        return numeroHorasExtras;
    }

    public void calcularSueldoFinal() {
        double sf = 0;
        sf = (valorHoraExtra * numeroHorasExtras) + valorSueldo;

        sueldoFinal = sf;
    }

    public double obtenerSueldoFinal() {
        return sueldoFinal;
    }

    @Override
    public String toString() {
        String reporte = String.format(super.toString());
        reporte = String.format("%s\nValor Sueldo: %.2f\n"
                + "Valor Hora Extra: %.2f\n"
                + "Numero Horas Extras: %.2f\n"
                + "Sueldo Final: %.2f\n", reporte,
                obtenerValorSueldo(),
                obtenerValorHoraExtra(),
                obtenerNumeroHorasExtras(),
                obtenerSueldoFinal());
        return reporte;
    }

}
