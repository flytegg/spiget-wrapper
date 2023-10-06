package gg.flyte.spigetWrapper.type.interfaces

import org.spiget.data.resource.Resource
import org.spiget.data.resource.version.ResourceVersion
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface SpiGetService {

    @GET("resources/{id}")
    fun getResource(
        @Path("id") id: Int
    ): Call<Resource>

    @GET("resources/{id}/versions/{versionId}")
    fun getResourceVersion(
        @Path("id") id: Int,
        @Path("versionId") versionId: String
    ): Call<ResourceVersion>
}