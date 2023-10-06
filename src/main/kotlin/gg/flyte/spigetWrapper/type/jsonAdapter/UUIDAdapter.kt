package gg.flyte.spigetWrapper.type.jsonAdapter

import com.squareup.moshi.*
import java.util.UUID

class UUIDAdapter : JsonAdapter<UUID>() {
    @FromJson override fun fromJson(reader: JsonReader): UUID = UUID.fromString(reader.nextString())
    @ToJson override fun toJson(writer: JsonWriter, value: UUID?) { writer.value(value.toString()) }
}