package pl.thecodeside.testingground.data;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import javax.annotation.Generated;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "id", "title", "mainPhoto"
})
public class Quiz {

  @JsonProperty("id") public String id;
  @JsonProperty("title") public String title;

  @JsonProperty("mainPhoto") public MainPhoto mainPhoto;

  /**
   * No args constructor for use in serialization
   */
  public Quiz() {
  }

  /**
   *
   * @param id
   * @param title
   * @param mainPhoto
   */
  public Quiz(String id, String title, MainPhoto mainPhoto) {

    this.id = id;
    this.title = title;
    this.mainPhoto = mainPhoto;
  }

  @JsonInclude(JsonInclude.Include.NON_NULL)
  @JsonPropertyOrder({
      "url"
  })
  public class MainPhoto {

    @JsonProperty("url") public String url;

    /**
     * No args constructor for use in serialization
     */
    public MainPhoto() {
    }

    /**
     *
     * @param url
     */
    public MainPhoto(String url) {
      this.url = url;
    }
  }
}




