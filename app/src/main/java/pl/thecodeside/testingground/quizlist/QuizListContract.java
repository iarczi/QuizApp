package pl.thecodeside.testingground.quizlist;

import android.support.annotation.NonNull;
import java.util.List;
import pl.thecodeside.testingground.base.BasePresenter;
import pl.thecodeside.testingground.base.BaseView;

/**
 * Created by Artur Latoszewski on 16.11.2016.
 */

public interface QuizListContract {

  interface View extends BaseView<Presenter> {
    boolean isActive();
  }

  interface Presenter extends BasePresenter {


  }
}
