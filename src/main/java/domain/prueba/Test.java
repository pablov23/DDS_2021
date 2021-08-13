package domain.prueba;

import domain.servicioCotizacion.APICotizacion;
import domain.servicioCotizacion.Moneda;

import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {
        //List<Criptomoneda> criptomonedaList = APICriptomonedas.Get_Criptomonedas();
        //System.out.println(criptomonedaList.get(0).toString());

        Moneda moneda = APICotizacion.Get_Cotizacion();
        System.out.println(moneda.toString());
    }
}
