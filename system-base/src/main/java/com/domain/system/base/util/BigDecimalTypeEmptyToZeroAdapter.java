package com.domain.system.base.util;

import com.google.gson.*;

import java.lang.reflect.Type;
import java.math.BigDecimal;

public class BigDecimalTypeEmptyToZeroAdapter implements JsonSerializer<BigDecimal>, JsonDeserializer<BigDecimal> {

    public JsonElement serialize(BigDecimal src, Type arg1, JsonSerializationContext arg2) {
        String dataString = src.toString();
        return new JsonPrimitive(dataString);
    }

    public BigDecimal deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        if (!(json instanceof JsonPrimitive)) {
            throw new JsonParseException("The date should be a string value");
        }
        try {
            String content = json.getAsString();
            BigDecimal bigDecimal = new BigDecimal(0);
            if(null != content && !content.trim().isEmpty()) {
                bigDecimal = new BigDecimal(content);
            }
            return  bigDecimal;
        } catch (NumberFormatException e) {
            System.out.println("DateTypeAdapter input date value:" + json.getAsString());
            return null;
        }
    }
}