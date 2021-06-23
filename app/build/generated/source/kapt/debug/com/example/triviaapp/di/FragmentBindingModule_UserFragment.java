package com.example.triviaapp.di;

import com.example.triviaapp.ui.UserNameFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(subcomponents = FragmentBindingModule_UserFragment.UserNameFragmentSubcomponent.class)
public abstract class FragmentBindingModule_UserFragment {
  private FragmentBindingModule_UserFragment() {}

  @Binds
  @IntoMap
  @ClassKey(UserNameFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      UserNameFragmentSubcomponent.Factory builder);

  @Subcomponent
  public interface UserNameFragmentSubcomponent extends AndroidInjector<UserNameFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<UserNameFragment> {}
  }
}
