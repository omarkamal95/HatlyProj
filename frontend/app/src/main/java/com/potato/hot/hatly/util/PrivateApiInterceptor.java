package com.potato.hot.hatly.util;

import retrofit.RequestInterceptor;

/**
 * Created by omar on 15/12/15.
 */

public class PrivateApiInterceptor implements RequestInterceptor {
    private String token;

    public PrivateApiInterceptor(String token) {
        this.token = token;
    }

    @Override
    public void intercept(RequestFacade request) {
        request.addHeader("Authorization", token);
    }
}
