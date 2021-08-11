package domain.prueba;

import domain.servicioCriptomoneda.APICriptomonedas;
import domain.servicioCriptomoneda.Criptomoneda;
import java.io.IOException;
import java.util.List;

public class Test {
    public static void main(String[] args) throws IOException {
        List<Criptomoneda> criptomonedaList = APICriptomonedas.Get_Criptomonedas();
        System.out.println(criptomonedaList.get(0).toString());
    }
}
