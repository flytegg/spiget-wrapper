package gg.flyte.spigetWrapper

import gg.flyte.spigetWrapper.type.objects.SpiGetClient

fun main() {
    println(SpiGetClient.getResourceVersion(9089, "508424").body()!!)
}