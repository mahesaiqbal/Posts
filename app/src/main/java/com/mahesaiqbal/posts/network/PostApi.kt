package com.mahesaiqbal.posts.network

import com.mahesaiqbal.posts.model.Post
import io.reactivex.Observable
import retrofit2.http.GET

interface PostApi {
    @GET("/posts")
    fun getPosts(): Observable<List<Post>>
}