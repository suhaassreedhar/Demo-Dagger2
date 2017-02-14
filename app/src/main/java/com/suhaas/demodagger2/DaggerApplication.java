package com.suhaas.demodagger2;

import android.app.Application;
import android.content.Context;

import com.suhaas.demodagger2.data.DataManager;
import com.suhaas.demodagger2.di.component.ApplicationComponent;
import com.suhaas.demodagger2.di.component.DaggerApplicationComponent;
import com.suhaas.demodagger2.di.module.ApplicationModule;

import javax.inject.Inject;

public class DaggerApplication extends Application{
    protected ApplicationComponent applicationComponent;

    @Inject
    DataManager dataManager;

    public static DaggerApplication get(Context context) {
        return (DaggerApplication) context.getApplicationContext();
    }

    @Override
    public void onCreate() {
        super.onCreate();
        applicationComponent = DaggerApplicationComponent
                .builder()
                .applicationModule(new ApplicationModule(this))
                .build();
        applicationComponent.inject(this);
    }

    public ApplicationComponent getComponent(){
        return applicationComponent;
    }
}
