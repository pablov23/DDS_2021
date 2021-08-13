package domain.prueba;

import domain.servicioCotizacion.APICotizacion;
import domain.servicioCotizacion.Moneda;
import domain.servicioCriptomoneda.APICriptomonedas;
import domain.servicioCriptomoneda.Criptomoneda;

import java.io.IOException;
import java.util.List;

public class Test {
    public static void main(String[] args) throws IOException {
        Moneda moneda = APICotizacion.Get_Cotizacion();
        System.out.println(moneda.toString());
    }
}
