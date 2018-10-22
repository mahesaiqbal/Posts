package com.mahesaiqbal.posts.base

import android.arch.lifecycle.ViewModel
import com.mahesaiqbal.posts.injection.component.DaggerViewModelInjector
import com.mahesaiqbal.posts.injection.component.ViewModelInjector
import com.mahesaiqbal.posts.injection.module.NetworkModule
import com.mahesaiqbal.posts.ui.post.PostListViewModel

abstract class BaseViewModel : ViewModel() {
    private val injector: ViewModelInjector = DaggerViewModelInjector
            .builder()
            .networkModule(NetworkModule)
            .build()

    init {
        inject()
    }

    /**
     * Injects the required dependencies
     */
    private fun inject() {
        when (this) {
            is PostListViewModel -> injector.inject(this)
//            is PostViewModel -> injector.inject(this)
        }
    }
}