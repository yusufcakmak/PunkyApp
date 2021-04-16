package com.yusufcakmak.punkyapp.domain.di

import com.yusufcakmak.punkyapp.common.Mapper
import com.yusufcakmak.punkyapp.data.BeerResponse
import com.yusufcakmak.punkyapp.domain.Beer
import com.yusufcakmak.punkyapp.domain.BeerDataMapper
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class DataMapperModule {

    @Provides
    @Singleton
    fun provideBeerMapper(): Mapper<BeerResponse, Beer> {
        return BeerDataMapper()
    }
}
