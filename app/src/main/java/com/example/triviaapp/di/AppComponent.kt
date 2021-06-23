package com.example.triviaapp.di

import com.example.triviaapp.TriviaApp
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

@Component(
    modules = [ActivityBindingModule::class,
        FragmentBindingModule::class,
        ViewModelModule::class,
        ContextModule::class,
        RepositoryModule::class,
        ErrorModule::class,
        AppModule::class,
        AndroidSupportInjectionModule::class]
)
@Singleton
interface AppComponent : AndroidInjector<TriviaApp> {
    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(application: TriviaApp): Builder

        fun build(): AppComponent
    }
}