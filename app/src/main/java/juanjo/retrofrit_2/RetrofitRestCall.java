package juanjo.retrofrit_2;

import java.util.List;

import juanjo.retrofrit_2.model.ShowResponse;
import juanjo.retrofrit_2.model.TvShow;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Url;

/**
 * Created by juanj on 08/03/2017.
 */

public interface RetrofitRestCall {

    @GET("usersFake")
    Call<List<ResponseService>> getUsersGet();
    @POST("usersFake")
    Call<List<ResponseService>> getUsersPost();

    @GET
    Call<ShowResponse> getShowDetails(@Url String query);

    public  interface Data{

        void loadData(String URL_DETAILS);
    }

}
