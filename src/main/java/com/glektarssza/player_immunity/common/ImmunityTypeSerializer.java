package com.glektarssza.player_immunity.common;

import java.lang.reflect.Type;

import javax.annotation.Nonnull;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;

/**
 * The serializer for the {@link ImmunityType} enumeration.
 */
public class ImmunityTypeSerializer
    implements JsonSerializer<ImmunityType>, JsonDeserializer<ImmunityType> {
    @Override
    public JsonElement serialize(ImmunityType src, Type typeOfSrc,
        JsonSerializationContext context) {
        return new JsonPrimitive(src.toString());
    }

    @Override
    @Nonnull
    public ImmunityType deserialize(JsonElement json, Type typeOfT,
        JsonDeserializationContext context) throws JsonParseException {
        String input = json.getAsString();
        try {
            return ImmunityType.valueOf(input);
        } catch (IllegalArgumentException ex) {
            throw new JsonParseException(
                String.format("Invalid immunity type '%s'",
                    input),
                ex);
        }
    }
}
