package pl.thecodeside.testingground.data;

/**
 * Created by iarczi on 03.01.2017.
 */

public class QuizResult extends Quiz{

    private int progress;
    private int score;

    public QuizResult(String title, String imageUrl, String id) {
        super(title, imageUrl, id);
        progress = 0;
        score = 0;
    }

    public int getProgress() {
        return progress;
    }

    public void setProgress(int progress) {
        this.progress = progress;
    }

    public int getScore() {
        return score;
    }

    public boolean isComplete() {
        return progress >= 100;
    }


}
