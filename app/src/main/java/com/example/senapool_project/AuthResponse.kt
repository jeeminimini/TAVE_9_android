package com.example.senapool_project

import com.google.gson.annotations.SerializedName
import org.json.JSONObject

data class AuthResponse(
    @SerializedName(value = "isSuccess") val isSuccess:Boolean,
    @SerializedName(value = "code") val code:Int,
    @SerializedName(value = "message") val message:String
    )

data class VerifySendResponse(
    @SerializedName(value = "isSuccess") val isSuccess:Boolean,
    @SerializedName(value = "code") val code:Int,
    @SerializedName(value = "message") val message:String
)

data class VerifyConfirmResponse(
    @SerializedName(value = "isSuccess") val isSuccess:Boolean,
    @SerializedName(value = "code") val code:Int,
    @SerializedName(value = "message") val message:String
)

data class LoginResponse(
    @SerializedName(value = "isSuccess") val isSuccess:Boolean,
    @SerializedName(value = "code") val code:Int,
    @SerializedName(value = "message") val message:String,
    @SerializedName(value = "result") val result: Result
)
data class Result(
    @SerializedName("token") var token: String?="",
    @SerializedName("userPk") var userPk: String?="",
    @SerializedName("userId") var userId: String?="",
    @SerializedName("email") var email: String?="",
    @SerializedName("userImageUrl") var userImageUrl: String?="",
)

data class MyPlantListResponse(
    @SerializedName(value = "isSuccess") val isSuccess:Boolean,
    @SerializedName(value = "code") val code:Int,
    @SerializedName(value = "message") val message:String,
    @SerializedName(value = "result") val result: MyPlantListResult
)

data class MyPlantEnrollResponse(
    @SerializedName(value = "isSuccess") val isSuccess:Boolean,
    @SerializedName(value = "code") val code:Int,
    @SerializedName(value = "message") val message:String
)

data class MyPlantDiaryListResponse(
    @SerializedName(value = "isSuccess") val isSuccess:Boolean,
    @SerializedName(value = "code") val code:Int,
    @SerializedName(value = "message") val message:String,
    @SerializedName(value = "result") val result: MyPlantDiaryList
)

data class MyPlantDiaryList(
    @SerializedName("plantInfoDto") val plantInfoDto: plantInfoDto,
    @SerializedName("diaryPrevListDto") val diaryPrevListDto: diaryPrevListDto,
)

data class plantInfoDto(
    @SerializedName("plantPK") var plantPK: String?="",
    @SerializedName("plantImage") var plantImage: String?="",
    @SerializedName("plantName") var plantName: String?="",
    @SerializedName("plantType") var plantType: String?="",
    @SerializedName("waterPeriod") var waterPeriod: Int?=null,
    @SerializedName("period") var period: Int?=null
)

data class diaryPrevListDto(
    @SerializedName("diaryPrevDtoList") var diaryPrevDtoList: ArrayList<DiaryList>
)

data class DiaryList(
    //아직 모름
    @SerializedName("title") var title:String="",
    @SerializedName("publish") var publish:Boolean,
    @SerializedName("image") var image:String="",
    @SerializedName("diaryPK") var diaryPK:String="",
    @SerializedName("createdAt") var createdAt:String=""
)