package ru.potemkin.bookshelfapp.network

import retrofit2.http.GET
import retrofit2.http.Query
import ru.potemkin.bookshelfapp.BookShelf

interface BooksService {

    @GET("volumes")
    suspend fun bookSearch(
        @Query("q") searchQuery: String,
        @Query("maxResults") maxResults: Int
    ): BookShelf
}