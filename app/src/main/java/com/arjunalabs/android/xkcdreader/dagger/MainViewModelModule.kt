package com.arjunalabs.android.xkcdreader.dagger

import com.arjunalabs.android.xkcdreader.repository.XKCDService
import com.arjunalabs.android.xkcdreader.repository.XKCDServiceImpl
import com.arjunalabs.android.xkcdreader.usecase.GetComicByNumber
import com.arjunalabs.android.xkcdreader.usecase.GetComicByNumberImpl
import com.arjunalabs.android.xkcdreader.usecase.GetLatestComic
import com.arjunalabs.android.xkcdreader.usecase.GetLatestComicImpl
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class MainViewModelModule {

//    @Provides
//    @Singleton
//    open fun provideXKCDService(): XKCDService {
//        return XKCDServiceImpl.create()
//    }

    // for now, the xkcdService is created here, we want to inject it like above does.
    @Provides
    fun providesGetComicByNumber(): GetComicByNumber {
        return GetComicByNumberImpl(XKCDServiceImpl.create())
    }

    @Provides
    fun providesGetLatestComic(): GetLatestComic {
        return GetLatestComicImpl(XKCDServiceImpl.create())
    }
}