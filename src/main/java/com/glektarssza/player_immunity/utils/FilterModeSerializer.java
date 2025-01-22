package com.glektarssza.player_immunity.utils;

import java.lang.reflect.Type;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonParseException;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;

import com.glektarssza.player_immunity.api.FilterMode;

/**
 * A class which provides serialization and deserialization for the
 * {@link com.glektarssza.player_immunity.api.FilterMode FilterMode}
 * enumeration.
 */
public class FilterModeSerializer
    implements JsonSerializer<FilterMode>, JsonDeserializer<FilterMode> {
    @Override
    public JsonElement serialize(@Nullable FilterMode src, Type typeOfSrc,
        JsonSerializationContext context) {
        if (src == null) {
            return JsonNull.INSTANCE;
        }
        return new JsonPrimitive(src.name());
    }

    @Override
    @Nonnull
    public FilterMode deserialize(JsonElement json, Type typeOfT,
        JsonDeserializationContext context) throws JsonParseException {
        String value = json.getAsString();
        try {
            return FilterMode.valueOf(value);
        } catch (IllegalArgumentException ex) {
            throw new JsonParseException(String.format(
                "Unknown or invalid FilterMode enumeration value '%s'",
                value), ex);
        }
    }

}
