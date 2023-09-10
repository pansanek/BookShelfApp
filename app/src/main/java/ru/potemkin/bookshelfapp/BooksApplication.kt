package ru.potemkin.bookshelfapp

import android.app.Application
import ru.potemkin.bookshelfapp.data.AppContainer
import ru.potemkin.bookshelfapp.data.DefaultAppContainer

class BooksApplication : Application() {
    lateinit var container: AppContainer
    override fun onCreate() {
        super.onCreate()
        container = DefaultAppContainer()
    }
}