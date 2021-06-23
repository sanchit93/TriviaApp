package com.example.triviaapp.di;

import com.example.triviaapp.ui.GameFragment1;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(subcomponents = FragmentBindingModule_GameFragment1.GameFragment1Subcomponent.class)
public abstract class FragmentBindingModule_GameFragment1 {
  private FragmentBindingModule_GameFragment1() {}

  @Binds
  @IntoMap
  @ClassKey(GameFragment1.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      GameFragment1Subcomponent.Factory builder);

  @Subcomponent
  public interface GameFragment1Subcomponent extends AndroidInjector<GameFragment1> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<GameFragment1> {}
  }
}
