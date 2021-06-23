package com.example.triviaapp.di;

import com.example.triviaapp.ui.SummaryActivity;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(subcomponents = ActivityBindingModule_SummaryActivity.SummaryActivitySubcomponent.class)
public abstract class ActivityBindingModule_SummaryActivity {
  private ActivityBindingModule_SummaryActivity() {}

  @Binds
  @IntoMap
  @ClassKey(SummaryActivity.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      SummaryActivitySubcomponent.Factory builder);

  @Subcomponent
  public interface SummaryActivitySubcomponent extends AndroidInjector<SummaryActivity> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<SummaryActivity> {}
  }
}
