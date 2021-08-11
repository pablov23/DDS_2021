package domain.servicioCriptomoneda;

import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class APICriptomonedas {
    public static List<Criptomoneda> Get_Criptomonedas() throws IOException {
        List<Criptomoneda> criptomonedas = new ArrayList<Criptomoneda>();
        String url = "https://api.coincap.io/v2/assets";
        CloseableHttpClient httpClient = HttpClients.createDefault();
        try {
            HttpGet request = new HttpGet(url);

            CloseableHttpResponse response = httpClient.execute(request);

            try {
                HttpEntity entity = response.getEntity();
                if (entity != null && response.getStatusLine().getStatusCode() == 200) { // Debo validar que el codigo sea 200, sino hay algun problema con la API
                    // Traigo el string de ML
                    String result = EntityUtils.toString(entity);

                    // Convierto a un objeto JSON y traigo el array con las criptomonedas
                    JSONObject obj = new JSONObject(result);
                    JSONArray currencies = obj.getJSONArray("data");

                    // Itero sobre la lista de criptomonedas y seteo los correspondientes atributos
                    for (int i = 0; i < currencies.length(); i++) {
                        JSONObject monedita = (JSONObject)currencies.get(i);
                        Criptomoneda nuevaMoneda = new Criptomoneda(monedita.getString("id"), monedita.getInt("rank"),monedita.getString("symbol"), monedita.getString("priceUsd"));
                        criptomonedas.add(nuevaMoneda);
                    }
                }

            } finally {
                response.close();
            }

        } finally {
            httpClient.close();
        }

        return criptomonedas;
    }
}
