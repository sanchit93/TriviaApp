package com.example.triviaapp.di;

import com.example.triviaapp.ui.GameFragment2;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(subcomponents = FragmentBindingModule_GameFragment2.GameFragment2Subcomponent.class)
public abstract class FragmentBindingModule_GameFragment2 {
  private FragmentBindingModule_GameFragment2() {}

  @Binds
  @IntoMap
  @ClassKey(GameFragment2.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      GameFragment2Subcomponent.Factory builder);

  @Subcomponent
  public interface GameFragment2Subcomponent extends AndroidInjector<GameFragment2> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<GameFragment2> {}
  }
}
