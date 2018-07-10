package com.hankkin.reading.http.api

import com.hankkin.reading.domain.*
import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query
import retrofit2.http.QueryMap

/**
 * Created by huanghaijie on 2018/7/6.
 */
interface HomeApi{

    @GET("openapi/news_list")
    fun getNewsList(@QueryMap map: HashMap<String, Any>): Observable<MutableList<NewsListBean>>

    @GET("banner/json")
    fun getHomeBanner(): Observable<BaseResponse<MutableList<BannerBean>>>

    @GET("article/list/{page}/json")
    fun getArticle(@Path("page") page: Int): Observable<BaseResponse<ArticleBean>>

    @GET("tree/json")
    fun getCates(): Observable<BaseResponse<MutableList<CateBean>>>

    @GET("article/list/{page}/json")
    fun getArticleCid(@Path("page") page: Int,@Query("cid") cid: Int): Observable<BaseResponse<ArticleBean>>
}