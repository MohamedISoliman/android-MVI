package io.github.mohamedisoliman.mvi.data.remote

import io.github.mohamedisoliman.mvi.BuildConfig
import io.github.mohamedisoliman.mvi.data.entities.GithubRepository
import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Query

/**
 *
 * Created by Mohamed Ibrahim on 10/19/18.
 */
interface GithubApi {

  @GET("repositories")
  fun getRepositories(
    @Query("since") since: Long,
    @Query("client_id") clientId: String = BuildConfig.CLIENT_ID,
    @Query("client_secret") clientSecret: String = BuildConfig.CLIENT_SECRET
  ): Observable<List<GithubRepository>>

}