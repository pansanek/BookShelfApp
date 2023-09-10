package ru.potemkin.bookshelfapp.data

interface BooksRepository {
    suspend fun getBooks(query: String, maxResults: Int) : List<Book>
}
