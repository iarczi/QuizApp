package pl.thecodeside.testingground.quizlist;

import java.util.List;

import javax.inject.Inject;

import pl.thecodeside.testingground.data.Quiz;

/**
 * Created by Artur Latoszewski on 16.11.2016.
 */

public class QuizListPresenter implements QuizListContract.Presenter {

  private final QuizListRepository quizListRepository;

  private final QuizListContract.View view;

  @Inject
  public QuizListPresenter(QuizListRepository quizListRepository, QuizListContract.View view) {
      this.quizListRepository = quizListRepository;
      this.view = view;
  }


  @Override public void subscribe() {

  }

  @Override public void unsubscribe() {

  }
}
