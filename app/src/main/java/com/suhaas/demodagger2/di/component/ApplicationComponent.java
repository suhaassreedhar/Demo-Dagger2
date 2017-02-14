package com.suhaas.demodagger2.di.component;

import android.app.Application;
import android.content.Context;

import com.suhaas.demodagger2.DaggerApplication;
import com.suhaas.demodagger2.data.DataManager;
import com.suhaas.demodagger2.data.local.DbHelper;
import com.suhaas.demodagger2.data.local.SharedPrefsHelper;
import com.suhaas.demodagger2.di.scope.ApplicationContext;
import com.suhaas.demodagger2.di.module.ApplicationModule;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {

    void inject(DaggerApplication daggerApplication);

    @ApplicationContext
    Context getContext();

    Application getApplication();

    DataManager getDataManager();

    SharedPrefsHelper getPreferenceHelper();

    DbHelper getDbHelper();

}