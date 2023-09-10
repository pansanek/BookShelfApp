package ru.potemkin.bookshelfapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import ru.potemkin.bookshelfapp.ui.BooksApp
import ru.potemkin.bookshelfapp.ui.theme.BookShelfAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BookShelfAppTheme {
                BooksApp()
            }
        }
    }
}