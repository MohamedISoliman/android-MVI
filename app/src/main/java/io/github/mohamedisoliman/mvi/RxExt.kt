package io.github.mohamedisoliman.mvi

import android.support.v4.widget.SwipeRefreshLayout
import android.support.v7.widget.AppCompatButton
import android.view.View
import io.reactivex.Observable

/**
 *
 * Created by Mohamed Ibrahim on 9/27/18.
 */

fun AppCompatButton.clickObservable(): Observable<Unit> {
    return Observable.create { emitter ->
        val onClickListener = View.OnClickListener {
            emitter.onNext(Unit)
        }
        this.setOnClickListener(onClickListener)
        emitter.setCancellable { this.setOnClickListener(null) }

    }
}

fun SwipeRefreshLayout.refreshObservable(): Observable<Any> =
        Observable.create<Any> {
            val listener = SwipeRefreshLayout.OnRefreshListener {
                it.onNext(Unit)
            }
            setOnRefreshListener(listener)
            it.setCancellable { setOnRefreshListener(null) }
        }
