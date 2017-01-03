package pl.thecodeside.testingground.quizlist;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.marshalchen.ultimaterecyclerview.UltimateViewAdapter;

import java.util.List;

import pl.thecodeside.testingground.R;
import pl.thecodeside.testingground.data.Quiz;

/**
 * Created by iarczi on 03.01.2017.
 */
public class QuizListAdapter extends UltimateViewAdapter {
    private List<Quiz> quizList;
    private LayoutInflater inflater;

    public QuizListAdapter(Context context) {
        inflater = LayoutInflater.from(context);
    }

    @Override
    public RecyclerView.ViewHolder newFooterHolder(View view) {
        return null;
    }

    @Override
    public RecyclerView.ViewHolder newHeaderHolder(View view) {
        return null;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent) {
        View itemView = inflater.inflate(R.layout.quiz_list_item, parent, false);
        return new QuizItemViewHolder(itemView);
    }

    @Override
    public int getAdapterItemCount() {
        return quizList.size();
    }

    @Override
    public long generateHeaderId(int position) {
        return position;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public RecyclerView.ViewHolder onCreateHeaderViewHolder(ViewGroup parent) {
        return null;
    }

    @Override
    public void onBindHeaderViewHolder(RecyclerView.ViewHolder holder, int position) {

    }

    public void setQuizList(List<Quiz> quizList) {
        this.quizList.clear();
        this.quizList.addAll(quizList);
        notifyDataSetChanged();
    }
}
