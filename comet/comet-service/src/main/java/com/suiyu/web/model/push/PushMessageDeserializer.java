package com.suiyu.web.model.push;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;

import java.lang.reflect.Type;

/**
 * Created by yinbing on 2/25/2016.
 */
public class PushMessageDeserializer implements JsonDeserializer<PushMessage>{
    @Override
    public PushMessage deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        return null;
    }
}
