
package juanjo.retrofrit_2.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;


public class TvShow {

    @SerializedName("id")
    private Integer id;
    @SerializedName("name")
    private String name;
    @SerializedName("permalink")
    private String permalink;
    @SerializedName("url")
    private String url;
    @SerializedName("description")
    private String description;
    @SerializedName("description_source")
    private String descriptionSource;
    @SerializedName("start_date")
    private String startDate;
    @SerializedName("end_date")
    private Object endDate;
    @SerializedName("country")
    private String country;
    @SerializedName("status")
    private String status;
    @SerializedName("runtime")
    private Integer runtime;
    @SerializedName("network")
    private String network;
    @SerializedName("youtube_link")
    private String youtubeLink;
    @SerializedName("image_path")
    private String imagePath;
    @SerializedName("image_thumbnail_path")
    private String imageThumbnailPath;
    @SerializedName("rating")
    private String rating;
    @SerializedName("rating_count")
    private String ratingCount;
    @SerializedName("countdown")
    private Countdown countdown;
    @SerializedName("genres")
    private List<String> genres = null;
    @SerializedName("pictures")
    private List<String> pictures = null;
    @SerializedName("episodes")
    private List<Episode> episodes = null;

    @SerializedName("id")
    public Integer getId() {
        return id;
    }

    @SerializedName("id")
    public void setId(Integer id) {
        this.id = id;
    }

    @SerializedName("name")
    public String getName() {
        return name;
    }

    @SerializedName("name")
    public void setName(String name) {
        this.name = name;
    }

    @SerializedName("permalink")
    public String getPermalink() {
        return permalink;
    }

    @SerializedName("permalink")
    public void setPermalink(String permalink) {
        this.permalink = permalink;
    }

    @SerializedName("url")
    public String getUrl() {
        return url;
    }

    @SerializedName("url")
    public void setUrl(String url) {
        this.url = url;
    }

    @SerializedName("description")
    public String getDescription() {
        return description;
    }

    @SerializedName("description")
    public void setDescription(String description) {
        this.description = description;
    }

    @SerializedName("description_source")
    public String getDescriptionSource() {
        return descriptionSource;
    }

    @SerializedName("description_source")
    public void setDescriptionSource(String descriptionSource) {
        this.descriptionSource = descriptionSource;
    }

    @SerializedName("start_date")
    public String getStartDate() {
        return startDate;
    }

    @SerializedName("start_date")
    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    @SerializedName("end_date")
    public Object getEndDate() {
        return endDate;
    }

    @SerializedName("end_date")
    public void setEndDate(Object endDate) {
        this.endDate = endDate;
    }

    @SerializedName("country")
    public String getCountry() {
        return country;
    }

    @SerializedName("country")
    public void setCountry(String country) {
        this.country = country;
    }

    @SerializedName("status")
    public String getStatus() {
        return status;
    }

    @SerializedName("status")
    public void setStatus(String status) {
        this.status = status;
    }

    @SerializedName("runtime")
    public Integer getRuntime() {
        return runtime;
    }

    @SerializedName("runtime")
    public void setRuntime(Integer runtime) {
        this.runtime = runtime;
    }

    @SerializedName("network")
    public String getNetwork() {
        return network;
    }

    @SerializedName("network")
    public void setNetwork(String network) {
        this.network = network;
    }

    @SerializedName("youtube_link")
    public String getYoutubeLink() {
        return youtubeLink;
    }

    @SerializedName("youtube_link")
    public void setYoutubeLink(String youtubeLink) {
        this.youtubeLink = youtubeLink;
    }

    @SerializedName("image_path")
    public String getImagePath() {
        return imagePath;
    }

    @SerializedName("image_path")
    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    @SerializedName("image_thumbnail_path")
    public String getImageThumbnailPath() {
        return imageThumbnailPath;
    }

    @SerializedName("image_thumbnail_path")
    public void setImageThumbnailPath(String imageThumbnailPath) {
        this.imageThumbnailPath = imageThumbnailPath;
    }

    @SerializedName("rating")
    public String getRating() {
        return rating;
    }

    @SerializedName("rating")
    public void setRating(String rating) {
        this.rating = rating;
    }

    @SerializedName("rating_count")
    public String getRatingCount() {
        return ratingCount;
    }

    @SerializedName("rating_count")
    public void setRatingCount(String ratingCount) {
        this.ratingCount = ratingCount;
    }

    @SerializedName("countdown")
    public Countdown getCountdown() {
        return countdown;
    }

    @SerializedName("countdown")
    public void setCountdown(Countdown countdown) {
        this.countdown = countdown;
    }

    @SerializedName("genres")
    public List<String> getGenres() {
        return genres;
    }

    @SerializedName("genres")
    public void setGenres(List<String> genres) {
        this.genres = genres;
    }

    @SerializedName("pictures")
    public List<String> getPictures() {
        return pictures;
    }

    @SerializedName("pictures")
    public void setPictures(List<String> pictures) {
        this.pictures = pictures;
    }

    @SerializedName("episodes")
    public List<Episode> getEpisodes() {
        return episodes;
    }

    @SerializedName("episodes")
    public void setEpisodes(List<Episode> episodes) {
        this.episodes = episodes;
    }

}
