package pl.thecodeside.testingground.data.source.list;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Created by artix on 03.01.2017.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "url"
})
public class MainPhoto {

    @JsonProperty("url")
    public String url;

    /**
     * No args constructor for use in serialization
     */
    public MainPhoto() {
    }

    /**
     * @param url
     */
    public MainPhoto(String url) {
        this.url = url;
    }
}
