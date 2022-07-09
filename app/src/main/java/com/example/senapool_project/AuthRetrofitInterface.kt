package com.example.senapool_project

import okhttp3.MultipartBody
import retrofit2.Call
import retrofit2.http.*

interface AuthRetrofitInterface {

    @Multipart
    @POST("/user/signup")
    fun signUp(@Query("email") email:String,
               @Query("password") password:String,
               @Query("userId") userId:String,
               @Part userImage: MultipartBody.Part): Call<AuthResponse>

    @POST("/mailConfirm")
    fun verifyEmailSend(@Body email: VerifySendEmail): Call<VerifySendResponse>

    @POST("/verifyCode")
    fun verifyConfirm(@Body code: VerifyCodeConfirm): Call<VerifyConfirmResponse>

    @POST("/user/login")
    fun login(@Body login:Login): Call<LoginResponse>

    @GET("/myplant-list/{userPK}")
    fun MyPlantList(@Path("userPK") userPK: String): Call<MyPlantListResponse>

    @Multipart
    @POST("/myplant-list/{userPK}")
    fun MyPlantEnroll(@Header("Authorization") token:String,
                      @Path("userPK") userPK: String,
                      @Query("lastWater") lastWater:String,
                      @Query("plantName") plantName:String,
                      @Query("plantType") plantType:String,
                      @Query("startDay") startDay:String,
                      @Query("waterPeriod") waterPeriod:String,
                      @Part file: MultipartBody.Part): Call<MyPlantEnrollResponse>

    @GET("/myplant-list/{userPK}/{plantPK}")
    fun MyPlantDiaryList(@Header("Authorization") token:String,
                         @Path("userPK") userPK:String,
                         @Path("plantPK") plantPK:String): Call<MyPlantDiaryListResponse>

    @GET("/myplant-diary/{plantPK}")
    fun MyPlantDiaryDetail(@Header("Authorization") token:String,
                           @Path("plantPK") plantPK:String): Call<MyPlantDiaryDetailResponse>

    @Multipart
    @POST("/myplant-diary/{userPK}/{plantPK}")
    fun DiaryEnroll(@Header("Authorization") token:String,
                      @Path("userPK") userPK: String,
                      @Path("plantPK") plantPK: String,
                      @Query("content") content:String,
                      @Query("createDate") createDate:String,
                      @Query("publish") publish:Boolean,
                      @Query("title") title:String,
                      @Part file: MultipartBody.Part): Call<MyPlantEnrollResponse>

    @GET("/plant-diary")
    fun DiaryFeed(@Header("Authorization") token:String,
                  @Query("page") num: Char
    ): Call<DiaryFeedResponse>
}