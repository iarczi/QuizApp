package pl.thecodeside.testingground.data.source.list;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "id", "title", "mainPhoto"
})
public class QuizListItem {

    @JsonProperty("id")
    public String id;
    @JsonProperty("title")
    public String title;

    @JsonProperty("mainPhoto")
    public MainPhoto mainPhoto;

    /**
     * No args constructor for use in serialization
     */
    public QuizListItem() {
    }

    /**
     * @param id
     * @param title
     * @param mainPhoto
     */
    public QuizListItem(String id, String title, MainPhoto mainPhoto) {

        this.id = id;
        this.title = title;
        this.mainPhoto = mainPhoto;
    }

}




