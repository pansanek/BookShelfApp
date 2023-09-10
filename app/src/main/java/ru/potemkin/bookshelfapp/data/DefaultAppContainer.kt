package ru.potemkin.bookshelfapp.data

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import ru.potemkin.bookshelfapp.network.BookService

class DefaultAppContainer : AppContainer {
    private val BASE_URL = "https://www.googleapis.com/books/v1/"

    private val retrofit: Retrofit = Retrofit.Builder()
        .addConverterFactory(GsonConverterFactory.create())
        .baseUrl(BASE_URL)
        .build()

    private val retrofitService: BookService by lazy {
        retrofit.create(BookService::class.java)
    }

    override val booksRepository: BooksRepository by lazy {
        BooksRepositoryImpl(retrofitService)
    }
}