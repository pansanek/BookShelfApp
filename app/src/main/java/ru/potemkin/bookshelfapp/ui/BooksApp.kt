package ru.potemkin.bookshelfapp.ui

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.lifecycle.viewmodel.compose.viewModel
import ru.potemkin.bookshelfapp.R
import ru.potemkin.bookshelfapp.ui.screens.HomeScreen


@Composable
fun BooksApp(
    modifier: Modifier = Modifier
) {
    val booksViewModel: BooksViewModel =
        viewModel(factory = BooksViewModel.Factory)

    Scaffold(
        modifier = modifier.fillMaxSize(),
        topBar = {
            TopAppBar (
                title = {
                    Text(text = stringResource(id = R.string.app_name))
                }
            )
        }

    ) {
        Surface(modifier = modifier
            .fillMaxSize()
            .padding(it),
            color = MaterialTheme.colors.background
        ) {
            HomeScreen(
                booksUiState = booksViewModel.booksUiState,
                retryAction = { booksViewModel.getBooks() },
                modifier = modifier
            )
        }
    }
}