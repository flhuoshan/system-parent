package com.domain.system.base.util;

import com.google.gson.*;
import org.apache.commons.lang3.time.DateFormatUtils;
import org.apache.commons.lang3.time.DateUtils;

import java.lang.reflect.Type;
import java.text.ParseException;
import java.util.Date;

public class DateTypeEmptyToNullAdapter implements JsonSerializer<Date>, JsonDeserializer<Date> {
    private final String datePattern = "yyyy-MM-dd HH:mm:ss";

    public JsonElement serialize(Date src, Type arg1, JsonSerializationContext arg2) {
        String dateFormatAsString = DateFormatUtils.format(new Date(src.getTime()), datePattern);
        return new JsonPrimitive(dateFormatAsString);
    }

    public Date deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        if (!(json instanceof JsonPrimitive)) {
            throw new JsonParseException("The date should be a string value");
        }
        try {
            String content = json.getAsString();
            Date date = null;
            if(null != content && !content.trim().isEmpty()) {
                date = DateUtils.parseDate(content, datePattern);
            }
            return  date;
        } catch (NumberFormatException e) {
            System.out.println("DateTypeAdapter input date value:" + json.getAsString());
            return null;
        }
        catch (ParseException e) {
            throw new JsonParseException(e);
        }
    }
}