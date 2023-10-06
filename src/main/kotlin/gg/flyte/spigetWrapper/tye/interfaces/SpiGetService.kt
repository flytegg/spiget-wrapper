package gg.flyte.spigetWrapper.tye.interfaces

import org.spiget.data.resource.Resource
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface SpiGetService {

    @GET("resources/{id}")
    fun getResource(@Path("id") id: Int): Call<Resource>
}