package com.example.triviaapp.di;

import com.example.triviaapp.ui.UserFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(subcomponents = FragmentBindingModule_UserFragment.UserFragmentSubcomponent.class)
public abstract class FragmentBindingModule_UserFragment {
  private FragmentBindingModule_UserFragment() {}

  @Binds
  @IntoMap
  @ClassKey(UserFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      UserFragmentSubcomponent.Factory builder);

  @Subcomponent
  public interface UserFragmentSubcomponent extends AndroidInjector<UserFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<UserFragment> {}
  }
}
