package ru.potemkin.bookshelfapp

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.core.content.ContextCompat
import ru.potemkin.bookshelfapp.ui.BooksApp
import ru.potemkin.bookshelfapp.ui.theme.BookShelfAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BookShelfAppTheme {
                BooksApp(
                    onBookClicked = {
                        ContextCompat.startActivity(
                            this,
                            Intent(Intent.ACTION_VIEW, Uri.parse(it.previewLink)),
                            null
                        )
                    }
                )
            }
        }
    }
}