package domain.servicioCriptomoneda;

import retrofit2.Call;
import retrofit2.http.GET;

public interface CriptomonedasServices {
    @GET("criptomonedas")
    Call<ListadoDeCriptomonedas> listadoCriptomonedas();


}
