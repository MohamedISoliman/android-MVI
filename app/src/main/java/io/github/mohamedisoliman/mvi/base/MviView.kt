package io.github.mohamedisoliman.mvi.base

/**
 *
 * Created by Mohamed Ibrahim on 9/27/18.
 */
interface MviView {

    fun render(viewState: MviViewState)
}