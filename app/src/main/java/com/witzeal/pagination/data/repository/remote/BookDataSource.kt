//package com.witzeal.pagination.data.repository.remote
//
//import com.witzeal.pagination.data.repository.model.UserDTO
//import retrofit2.Response
//import retrofit2.http.GET
//
//interface BookDataSource {
//    @GET("/books/v1/volumes?q=subject=hindi&startIndex=0&maxResults=40")
//    suspend fun downloadBookList() : Response<UserDTO>
//}