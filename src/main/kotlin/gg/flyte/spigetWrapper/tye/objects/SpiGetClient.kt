package gg.flyte.spigetWrapper.tye.objects

import com.squareup.moshi.Moshi
import gg.flyte.spigetWrapper.tye.interfaces.SpiGetService
import gg.flyte.spigetWrapper.tye.jsonAdapter.UUIDAdapter
import org.spiget.data.resource.Resource
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

object SpiGetClient {

    const val BASE_URL = "https://api.spiget.org/v2/"
    const val USER_AGENT = "flytegg/pp-lib/2.0.0 (hello@flyte.gg)"

    val moshi = Moshi.Builder()
        .add(UUIDAdapter())
        .build()

    val retrofit = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(MoshiConverterFactory.create(moshi))
        .build()

    private val spiGetService = retrofit.create(SpiGetService::class.java)

    fun getResource(id: Int): Response<Resource> = spiGetService.getResource(id).execute()

}