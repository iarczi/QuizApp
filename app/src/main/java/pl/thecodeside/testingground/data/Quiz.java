package pl.thecodeside.testingground.data;

/**
 * Created by iarczi on 03.01.2017.
 */

public class Quiz {

    private String title;
    private String imageUrl;
    private String id;


    public Quiz(String title, String imageUrl, String id) {
        this.title = title;
        this.imageUrl = imageUrl;
        this.id = id;
    }



    public String getTitle() {

        return title;
    }

    public String getId() {
        return id;
    }


    public String getImageUrl() {
        return imageUrl;
    }
}

