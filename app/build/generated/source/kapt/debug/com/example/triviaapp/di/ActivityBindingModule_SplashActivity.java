package com.example.triviaapp.di;

import com.example.triviaapp.ui.SplashActivity;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(subcomponents = ActivityBindingModule_SplashActivity.SplashActivitySubcomponent.class)
public abstract class ActivityBindingModule_SplashActivity {
  private ActivityBindingModule_SplashActivity() {}

  @Binds
  @IntoMap
  @ClassKey(SplashActivity.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      SplashActivitySubcomponent.Factory builder);

  @Subcomponent
  public interface SplashActivitySubcomponent extends AndroidInjector<SplashActivity> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<SplashActivity> {}
  }
}
