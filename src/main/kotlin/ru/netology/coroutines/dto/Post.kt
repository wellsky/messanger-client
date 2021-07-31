package ru.netology.coroutines.dto

data class Post(
    val id: Long,
    val authorId: Long,
    val content: String,
    val published: Long,
    val likedByMe: Boolean,
    val likes: Int = 0,

    // Устанавливаются позже с помощью отдельных методов
    var author: Author,
    var comments: List<Comment>,
) {
    fun setAuthor(author: Author): Post {
        this.author = author
        return this
    }

    fun setComments(comments: List<Comment>): Post {
        this.comments = comments
        return this
    }
}

