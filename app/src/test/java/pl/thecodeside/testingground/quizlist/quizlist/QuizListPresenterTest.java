package pl.thecodeside.testingground.quizlist.quizlist;

import com.google.common.collect.Lists;

import java.util.ArrayList;
import java.util.List;
import org.junit.Before;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import pl.thecodeside.testingground.data.Quiz;
import pl.thecodeside.testingground.quizlist.QuizListContract;
import pl.thecodeside.testingground.quizlist.QuizListPresenter;
import pl.thecodeside.testingground.quizlist.QuizListRepository;

import static org.mockito.Mockito.when;

/**
 * Created by Artur Latoszewski on 16.11.2016.
 */

public class QuizListPresenterTest {
  private static List<Quiz> QUIZLIST;
  private QuizListPresenter quizListPresenter;

  @Mock
  private QuizListRepository quizListRepository;

  @Mock
  private QuizListContract.View quizListView;



  @Before
  public void setupQuizListPresenter() {
    MockitoAnnotations.initMocks(this);
    quizListPresenter = new QuizListPresenter(quizListRepository, quizListView) ;
    when(quizListView.isActive()).thenReturn(true);
    QUIZLIST = new ArrayList<>();
  }


}
