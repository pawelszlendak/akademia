package com.szlendak.akademia.core.di

import org.koin.core.module.Module

val koinInjector: List<Module> = listOf(
    networkModule,
    databaseModule,
    appModule
)