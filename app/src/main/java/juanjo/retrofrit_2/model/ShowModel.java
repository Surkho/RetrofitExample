
package juanjo.retrofrit_2.model;


import com.google.gson.annotations.SerializedName;

public class ShowModel {

    @SerializedName("tvShow")
    private TvShow tvShow;

    @SerializedName("tvShow")
    public TvShow getTvShow() {
        return tvShow;
    }

    @SerializedName("tvShow")
    public void setTvShow(TvShow tvShow) {
        this.tvShow = tvShow;
    }

}
