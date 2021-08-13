import domain.servicioCriptomoneda.APICriptomonedas;
import domain.servicioCriptomoneda.Criptomoneda;
import junit.framework.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

public class TestAPICriptomonedas {
    static List<Criptomoneda> criptomonedaList;

    @BeforeClass
    public static void init() throws IOException {
        criptomonedaList = APICriptomonedas.Get_Criptomonedas();
    }

    @Test
    public void CantidadCriptoEs100(){
        Assert.assertEquals(100,criptomonedaList.size());
    }

    @Test
    public void PrimerElementoDeLaListaEsBitcoin(){
        Assert.assertEquals("bitcoin",criptomonedaList.get(0).getId());
    }
}
