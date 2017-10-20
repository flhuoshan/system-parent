package com.gznb.system.base.util.json;

import com.google.gson.*;
import com.gznb.system.base.util.BigDecimalTypeEmptyToZeroAdapter;
import com.gznb.system.base.util.DateTypeEmptyToNullAdapter;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.util.Date;

@SuppressWarnings("unchecked")
public class GsonUtil {
    private static Gson gson = new GsonBuilder()
            .serializeNulls()
            .setDateFormat("yyyy-MM-dd HH:mm:ss")
            .registerTypeAdapter(Date.class, new DateTypeEmptyToNullAdapter())
            .registerTypeAdapter(BigDecimal.class, new BigDecimalTypeEmptyToZeroAdapter())
            .create();

    /**
     * jason字串转为对象实例
     * @param json    json格式字符串
     * @param mainClass  结果对象class
     * @param subClass  如果对象class中包含泛型字段，此为泛型class
     * @param <T>
     * @return
     */
    public static <T> T fromJsonToClass(String json, Class mainClass, Class subClass) {

        if(null == subClass) {
            return (T)gson.fromJson(json, mainClass);
        }
        else {
            Type objectType = type(mainClass, subClass);
            return gson.fromJson(json, objectType);
        }
    }

    public static <T> T fromJsonToClass(String json, Class<T> clz) {
        return gson.fromJson(json, clz);
    }

    public static String toJson(Object obj) {
        return gson.toJson(obj);
    }

    public static String toJson(Object obj, boolean prettyPrinting) {
        if(prettyPrinting) {
            return new GsonBuilder()
                    .serializeNulls()
                    .setDateFormat("yyyy-MM-dd HH:mm:ss")
                    .registerTypeAdapter(Date.class, new DateTypeEmptyToNullAdapter())
                    .setPrettyPrinting()
                    .create().toJson(obj);
        }
        else {
            return gson.toJson(obj);
        }
    }

    /**
     * 对象实例转jason格式字符串
     * @param obj  待转实例
     * @param mainClass  对象class
     * @param subClass 如果对象class中包含泛型字段，此为泛型class
     * @return
     */
    public static String toJsonFromClass(Object obj, Class mainClass, Class subClass) {
        if(null == subClass) {
            return gson.toJson(obj, mainClass);
        }
        else {
            Type objectType = type(mainClass, subClass);
            return gson.toJson(obj, objectType);
        }

    }

    /**
     * @param raw
     * @param args
     * @return
     */
    public static ParameterizedType type(final Class raw, final Type... args) {
        return new ParameterizedType() {
            public Type getRawType() {
                return raw;
            }

            public Type[] getActualTypeArguments() {
                return args;
            }

            public Type getOwnerType() {
                return null;
            }
        };
    }
}
