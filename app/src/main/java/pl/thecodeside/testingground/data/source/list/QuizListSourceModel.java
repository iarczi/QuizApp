package pl.thecodeside.testingground.data.source.list;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * Created by iarczi on 03.01.2017.
 */

@JsonInclude(JsonInclude.Include.NON_NULL)

public class QuizListSourceModel {
    @JsonProperty("items")
    public List<QuizListItem> items;
}


