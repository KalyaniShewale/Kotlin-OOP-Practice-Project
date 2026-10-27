package com.kalyani.shewale.kotlinoopspractice.model

import android.util.Log

private const val TAG = "Library"

class Book(val title: String, val author: String) {
    override fun toString(): String = "$title by $author"
}

class Library {
    private val books = mutableListOf<Book>()

    fun addBook(book: Book) {
        books.add(book)
        Log.d(TAG, "Added: $book")
    }

    fun removeBook(title: String) {
        val removed = books.removeAll { it.title.equals(title, ignoreCase = true) }
        if (removed) Log.d(TAG, "Removed book with title: $title")
        else Log.d(TAG, "Book '$title' not found!")
    }

    fun showBooks() {
        if (books.isEmpty()) {
            Log.d(TAG, "Library is empty.")
        } else {
            Log.d(TAG, "--- Books in Library ---")
            books.forEachIndexed { i, b -> Log.d(TAG, "${i + 1}. $b") }
            Log.d(TAG, "Total books: ${books.size}")
        }
    }
}

fun runLibrarySystem() {
    val library = Library()

    library.addBook(Book("The Alchemist", "Paulo Coelho"))
    library.addBook(Book("Atomic Habits", "James Clear"))
    library.addBook(Book("Kotlin in Action", "Dmitry Jemerov"))

    library.showBooks()

    library.removeBook("Atomic Habits")
    library.showBooks()

    library.removeBook("Unknown Book")
}