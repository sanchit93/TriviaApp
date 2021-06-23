// Generated by Dagger (https://dagger.dev).
package com.example.triviaapp.base;

import com.example.testlocationapp.di.ViewModelFactory;
import com.example.testlocationapp.error.ErrorHandler;
import dagger.MembersInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DaggerBaseActivity_MembersInjector implements MembersInjector<DaggerBaseActivity> {
  private final Provider<ErrorHandler> errorHandlerProvider;

  private final Provider<ViewModelFactory> viewModelFactoryProvider;

  private final Provider<DispatchingAndroidInjector<Object>> androidInjectorProvider;

  public DaggerBaseActivity_MembersInjector(Provider<ErrorHandler> errorHandlerProvider,
      Provider<ViewModelFactory> viewModelFactoryProvider,
      Provider<DispatchingAndroidInjector<Object>> androidInjectorProvider) {
    this.errorHandlerProvider = errorHandlerProvider;
    this.viewModelFactoryProvider = viewModelFactoryProvider;
    this.androidInjectorProvider = androidInjectorProvider;
  }

  public static MembersInjector<DaggerBaseActivity> create(
      Provider<ErrorHandler> errorHandlerProvider,
      Provider<ViewModelFactory> viewModelFactoryProvider,
      Provider<DispatchingAndroidInjector<Object>> androidInjectorProvider) {
    return new DaggerBaseActivity_MembersInjector(errorHandlerProvider, viewModelFactoryProvider, androidInjectorProvider);
  }

  @Override
  public void injectMembers(DaggerBaseActivity instance) {
    BaseActivity_MembersInjector.injectErrorHandler(instance, errorHandlerProvider.get());
    injectViewModelFactory(instance, viewModelFactoryProvider.get());
    injectAndroidInjector(instance, androidInjectorProvider.get());
  }

  @InjectedFieldSignature("com.example.triviaapp.base.DaggerBaseActivity.viewModelFactory")
  public static void injectViewModelFactory(DaggerBaseActivity instance,
      ViewModelFactory viewModelFactory) {
    instance.viewModelFactory = viewModelFactory;
  }

  @InjectedFieldSignature("com.example.triviaapp.base.DaggerBaseActivity.androidInjector")
  public static void injectAndroidInjector(DaggerBaseActivity instance,
      DispatchingAndroidInjector<Object> androidInjector) {
    instance.androidInjector = androidInjector;
  }
}
