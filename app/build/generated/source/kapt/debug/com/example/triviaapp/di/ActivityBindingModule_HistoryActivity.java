package com.example.triviaapp.di;

import com.example.triviaapp.ui.HistoryActivity;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(subcomponents = ActivityBindingModule_HistoryActivity.HistoryActivitySubcomponent.class)
public abstract class ActivityBindingModule_HistoryActivity {
  private ActivityBindingModule_HistoryActivity() {}

  @Binds
  @IntoMap
  @ClassKey(HistoryActivity.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      HistoryActivitySubcomponent.Factory builder);

  @Subcomponent
  public interface HistoryActivitySubcomponent extends AndroidInjector<HistoryActivity> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<HistoryActivity> {}
  }
}
