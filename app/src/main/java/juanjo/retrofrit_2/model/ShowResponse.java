
package juanjo.retrofrit_2.model;


public class ShowResponse {

    private TvShow tvShow;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ShowResponse() {
    }

    /**
     * 
     * @param tvShow
     */
    public ShowResponse(TvShow tvShow) {
        super();
        this.tvShow = tvShow;
    }

    public TvShow getTvShow() {
        return tvShow;
    }

    public void setTvShow(TvShow tvShow) {
        this.tvShow = tvShow;
    }

}
