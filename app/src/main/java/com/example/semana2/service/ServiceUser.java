package com.example.semana2.service;
import com.example.semana2.entity.User;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ServiceUser {

    @GET("users")
    public abstract Call<List<User>> listausuarios();

}
