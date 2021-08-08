package domain.servicioCriptomoneda;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.io.IOException;

public class ServicioCriptomoneda {
    private static ServicioCriptomoneda instancia = null;
    private static final String urlAPI = "https://api.coincap.io/v2/assets"; // guardar en un archivo de config
    private Retrofit retrofit;

    private ServicioCriptomoneda(){
        this.retrofit = new Retrofit.Builder()
                .baseUrl(urlAPI)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    public static ServicioCriptomoneda getInstance(){
        if(instancia == null){
            instancia = new ServicioCriptomoneda();
        }
        return instancia;
    }

    public ListadoDeCriptomonedas listadoDeCriptomonedas() throws IOException {
        CriptomonedasServices criptomonedasServices = this.retrofit.create(CriptomonedasServices.class);
        Call<ListadoDeCriptomonedas> requestCriptomonedas = criptomonedasServices.listadoCriptomonedas();
        Response<ListadoDeCriptomonedas> responseCriptomonedas = requestCriptomonedas.execute();
        return responseCriptomonedas.body();
    }
}
