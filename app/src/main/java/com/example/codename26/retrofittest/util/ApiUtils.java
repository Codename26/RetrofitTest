package com.example.codename26.retrofittest.util;

import com.example.codename26.retrofittest.data.remote.APIService;
import com.example.codename26.retrofittest.data.remote.RetrofitClient;

public class ApiUtils {

    public static final String BASE_URL = "https://api.stackexchange.com/2.2/";

    public static APIService getApiService(){
        return RetrofitClient.getClient(BASE_URL).create(APIService.class);
    }
}
