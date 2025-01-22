package com.glektarssza.player_immunity.utils;

import java.lang.reflect.Type;

import javax.annotation.Nonnull;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;

import com.glektarssza.player_immunity.api.ImmunityType;

/**
 * A class which provides serialization and deserialization for the
 * {@link com.glektarssza.player_immunity.api.ImmunityType ImmunityType}
 * enumeration.
 */
public class ImmunityTypeSerializer
    implements JsonSerializer<ImmunityType>, JsonDeserializer<ImmunityType> {
    // #region Public Methods

    @Override
    @Nonnull
    public JsonElement serialize(ImmunityType src, Type typeOfSrc,
        JsonSerializationContext context) {
        return new JsonPrimitive(src.name());
    }

    @Override
    @Nonnull
    public ImmunityType deserialize(JsonElement json, Type typeOfT,
        JsonDeserializationContext context) throws JsonParseException {
        String value = json.getAsString();
        try {
            return ImmunityType.valueOf(value);
        } catch (IllegalArgumentException ex) {
            throw new JsonParseException(String.format(
                "Unknown or invalid ImmunityType enumeration value '%s'",
                value), ex);
        }
    }

    // #endregion
}
