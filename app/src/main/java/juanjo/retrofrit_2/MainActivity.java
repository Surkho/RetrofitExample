package juanjo.retrofrit_2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import butterknife.Bind;
import butterknife.ButterKnife;
import juanjo.retrofrit_2.model.ShowResponse;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity implements RetrofitRestCall.Data{
    @Bind(R.id.imgShow)
    ImageView imgShow;
    @Bind(R.id.tv_name)
    TextView tvName;
    @Bind(R.id.tv_country)
    TextView tvCountry;
    @Bind(R.id.tv_description)
    TextView tvDescription;
    @Bind(R.id.tv_started)
    TextView tvStarted;
    @Bind(R.id.tv_total_sesion)
    TextView tvTotalSesion;
    @Bind(R.id.tv_next_air)
    TextView tvNextAir;
    @Bind(R.id.tv_ended)
    TextView tvEnded;
    ShowResponse show;
    final String URL_DETAILS = "https://www.episodate.com/api/";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        loadData(URL_DETAILS);
    }

    @Override
    public void loadData(String URL_DETAILS) {
        //Creating object Retrofit
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(URL_DETAILS)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        //Reference Interface
        RetrofitRestCall service = retrofit.create(RetrofitRestCall.class);
        String nameShow = "Arrow";
        String query = "show-details?q=" + nameShow;
        Call<ShowResponse> callShow = service.getShowDetails(query);
        callShow.enqueue(new Callback<ShowResponse>() {
            @Override
            public void onResponse(Call<ShowResponse> call, Response<ShowResponse> response) {
                show = response.body();
                createDataLayout(show);
            }

            @Override
            public void onFailure(Call<ShowResponse> call, Throwable t) {
                Log.e("Respuesta: ","TV SHOW NOT FOUND");
            }
        });

    }

    private void createDataLayout(ShowResponse show) {
        Glide.with(MainActivity.this).load(show.getTvShow().getImagePath().toString()).into(imgShow);
        tvName.setText(show.getTvShow().getName());
        tvCountry.setText(show.getTvShow().getCountry());
        tvDescription.setText(show.getTvShow().getDescription());
        tvNextAir.setText(show.getTvShow().getCountdown().getAirDate());
        tvTotalSesion.setText(show.getTvShow().getCountdown().getSeason());
        tvStarted.setText(show.getTvShow().getStartDate());
        if(show.getTvShow().getEndDate() == null)
            tvEnded.setText(show.getTvShow().getStatus());
        else
            tvEnded.setText((String)show.getTvShow().getEndDate());
    }
}
