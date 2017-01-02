package pl.thecodeside.testingground;

import android.content.Context;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Artur Latoszewski on 14.11.2016.
 */

@Module
public final class ApplicationModule {

    private final Context mContext;

    ApplicationModule(Context context) {
        mContext = context;
    }

    @Provides
    Context provideContext() {
        return mContext;
    }
}
