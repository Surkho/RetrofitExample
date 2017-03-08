
package juanjo.retrofrit_2.model;

import com.google.gson.annotations.SerializedName;

public class Countdown {

    @SerializedName("season")
    private Integer season;
    @SerializedName("episode")
    private Integer episode;
    @SerializedName("name")
    private String name;
    @SerializedName("air_date")
    private String airDate;

    @SerializedName("season")
    public String getSeason() {
        return String.valueOf(season);
    }

    @SerializedName("season")
    public void setSeason(Integer season) {
        this.season = season;
    }

    @SerializedName("episode")
    public Integer getEpisode() {
        return episode;
    }

    @SerializedName("episode")
    public void setEpisode(Integer episode) {
        this.episode = episode;
    }

    @SerializedName("name")
    public String getName() {
        return name;
    }

    @SerializedName("name")
    public void setName(String name) {
        this.name = name;
    }

    @SerializedName("air_date")
    public String getAirDate() {
        return airDate;
    }

    @SerializedName("air_date")
    public void setAirDate(String airDate) {
        this.airDate = airDate;
    }

}
