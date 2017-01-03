package pl.thecodeside.testingground.quizlist;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.marshalchen.ultimaterecyclerview.UltimateRecyclerviewViewHolder;
import com.squareup.picasso.Picasso;

import butterknife.BindView;
import butterknife.ButterKnife;
import pl.thecodeside.testingground.R;
import pl.thecodeside.testingground.data.Quiz;

/**
 * Created by iarczi on 03.01.2017.
 */

public class QuizItemViewHolder extends UltimateRecyclerviewViewHolder {

    @BindView(R.id.quiz_title)
    TextView quizTitle;

    @BindView(R.id.score)
    TextView score;

    @BindView(R.id.progress)
    TextView progress;

    @BindView(R.id.quiz_image)
    ImageView quizImage;


    public QuizItemViewHolder(View itemView) {
        super(itemView);
        ButterKnife.bind(this, itemView);
    }

    private void populate(Context context, Quiz quiz){
        Picasso.with(context).load(quiz.getImageUrl()).into(quizImage);
    }
}
