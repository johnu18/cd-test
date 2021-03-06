package com.ugorji.data;

import android.app.Application;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import com.ugorji.ForApplication;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module(
        complete = false,
        library = true
)
public final class DataModule {
    @Provides @Singleton SharedPreferences provideSharedPreferences(@ForApplication Application app) {
        return PreferenceManager.getDefaultSharedPreferences(app);
    }
}
