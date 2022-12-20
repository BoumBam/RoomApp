package com.example.room

import androidx.room.*

@Dao
interface BookDao {
    @Insert
    fun insertBook(book: Book)

    @Query("SELECT * FROM books_table")
    fun getAllBooks(): List<Book>

    @Update
    fun updateBook(book: Book)

    @Delete
    fun deleteBook(book: Book)
}