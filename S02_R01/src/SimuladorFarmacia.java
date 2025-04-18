//Sesión 2 Reto 01: Sarahí Orta H.
public class SimuladorFarmacia {
public static void main (String[]args) {

    //Nombre del Medicamento
    var Medicamento= " Amoxicilina ";

    //Precio Unitario
    double PrecioUnitario = 120.0;

    //Cantidad
    int Cantidad = 5;

    //Cálculo del Total
    double total= (PrecioUnitario * Cantidad);

    //Descuento si el total supera $500
    boolean aplicaDescuento= total > 500;

    //Asignación del Descuento (15%)
    double descuento = aplicaDescuento ? total * 0.15:0;

    //Cálculo Final
    double totalFinal= total - descuento;

    // Imprimir los valores
    System.out.println (" Medicamento: " + Medicamento);
    System.out.println (" Precio Unitario: " + PrecioUnitario);
    System.out.println (" Cantidad: " + Cantidad);
    System.out.println (" Total Sin Descuento: " + total);
    System.out.println (" ¿Aplica Descuento?: " + aplicaDescuento);
    System.out.println (" Descuento: " + descuento);
    System.out.println (" Total a Pagar: " + totalFinal);
}
}