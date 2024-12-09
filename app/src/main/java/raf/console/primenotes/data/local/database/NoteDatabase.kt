package raf.console.primenotes.data.local.database

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverter
import androidx.room.TypeConverters
import raf.console.primenotes.data.local.converters.DateConverter
import raf.console.primenotes.data.local.converters.ListConverter
import raf.console.primenotes.data.local.dao.NoteDao
import raf.console.primenotes.data.local.model.Note

@TypeConverters(DateConverter::class, ListConverter::class)
@Database(
    entities = [Note::class],
    version = 1,
    exportSchema = false
)
abstract class NoteDatabase : RoomDatabase() {
    abstract val noteDao: NoteDao
}