package raf.console.primenotes.presentation.home

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid
import androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells
import androidx.compose.foundation.lazy.staggeredgrid.itemsIndexed
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.BookmarkRemove
import androidx.compose.material.icons.outlined.BookmarkAdd
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.room.Index
import kotlinx.coroutines.selects.whileSelect
import raf.console.primenotes.data.local.model.Note

@Composable
private fun HomeDetail(
    notes: List<Note>,
    modifier: Modifier,
    onBookMarkChange: (note: Note) -> Unit,
    onDeleteNote: (Long) -> Unit,
    onNoteClicked: (Long) -> Unit,
) {
    LazyVerticalStaggeredGrid(
        columns = StaggeredGridCells.Fixed(2), // Количество столбцов на экране
        contentPadding = PaddingValues(4.dp),
        modifier = Modifier
    ) {
        itemsIndexed(notes) { index, note ->

        }
    }

}

// 01:05:27

@Composable
fun NoteCard(
    index: Int,
    note: Note,
    onBookMarkChange: (note: Note) -> Unit,
    onDeleteNote: (Long) -> Unit,
    onNoteClicked: (Long) -> Unit
) {
    val isEvenIndex = index % 2 == 0
    val share = when {
        isEvenIndex -> {
            RoundedCornerShape(
                topStart = 50f,
                bottomEnd = 50f,

            )
        }
        else -> {
            RoundedCornerShape(
                topEnd = 50f,
                bottomStart = 50f
            )
        }
    }
    val icon = if (note.isBookmarked) Icons.Default.BookmarkRemove
    else Icons.Outlined.BookmarkAdd

    Card(
        modifier = Modifier.fillMaxWidth().padding(4.dp),
        shape = share,
        onClick = {
            onNoteClicked(note.id)
        }

    ) {
        Column(
            modifier = Modifier.fillMaxWidth().padding(8.dp)
        ) {
            Text(
                text = note.title,
                fontWeight = FontWeight.Bold,
                maxLines = 1
            )
        }
    }
}
