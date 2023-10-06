package gg.flyte.spigetWrapper

import gg.flyte.spigetWrapper.tye.objects.SpiGetClient

fun main() {
    SpiGetClient.getResource(9089).body()?.let { println(it.testedVersions) }
}