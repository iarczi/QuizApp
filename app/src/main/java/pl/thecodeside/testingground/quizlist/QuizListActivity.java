package pl.thecodeside.testingground.quizlist;

import android.app.ListActivity;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import pl.thecodeside.testingground.R;
import pl.thecodeside.testingground.data.Quiz;

public class QuizListActivity extends ListActivity implements QuizListContract.View{

    @BindView(R.id.quiz_list)
    RecyclerView quizList;

    private QuizListAdapter adapter;
    private QuizListContract.Presenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_list);
        ButterKnife.bind(this);
    }

    @Override
    public boolean isActive() {
        return false;
    }

    @Override
    public void showQuizList(List<Quiz> quizList) {
        adapter.setQuizList(quizList);
    }

    @Override
    public void setPresenter(QuizListContract.Presenter presenter) {
        this.presenter = presenter;
    }

    @Override
    protected void onStart() {
        super.onStart();

        adapter = new QuizListAdapter();
        quizList.setLayoutManager(new LinearLayoutManager(this));

        quizList.setAdapter(adapter);

        presenter.subscribe();
    }
}
