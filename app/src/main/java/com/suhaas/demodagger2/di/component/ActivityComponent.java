package com.suhaas.demodagger2.di.component;


import com.suhaas.demodagger2.di.scope.PerActivity;
import com.suhaas.demodagger2.di.module.ActivityModule;
import com.suhaas.demodagger2.ui.MainActivity;

import dagger.Component;

@PerActivity
@Component(dependencies = ApplicationComponent.class, modules = ActivityModule.class)
public interface ActivityComponent {

    void inject(MainActivity mainActivity);

}