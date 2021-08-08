package domain.prueba;

import domain.servicioCriptomoneda.Criptomoneda;
import domain.servicioCriptomoneda.ListadoDeCriptomonedas;
import domain.servicioCriptomoneda.ServicioCriptomoneda;
import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {
        ServicioCriptomoneda servicioCriptomoneda = ServicioCriptomoneda.getInstance();
        ListadoDeCriptomonedas listadoDeCriptomonedas = servicioCriptomoneda.listadoDeCriptomonedas();
        //listadoDeCriptomonedas.data.sort((c1,c2)-> c1.getPriceUsd() > c2.getPriceUsd()? 1:-1);

        for(Criptomoneda criptomoneda : listadoDeCriptomonedas.data){
            System.out.println(criptomoneda.toString());
        }
    }
}
