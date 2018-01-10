package com.mycompany.myapp.client.isbn.api;

import com.mycompany.myapp.client.AuthorizedFeignClient;

@AuthorizedFeignClient(name="number")
public interface ApiApiClient extends ApiApi {
}
