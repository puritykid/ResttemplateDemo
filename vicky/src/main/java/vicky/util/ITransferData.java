package vicky.util;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.Map;

public interface ITransferData {


    public ObjectMapper getMapper()throws Exception;


    public default <T> T transferData(JSONEntity obj, Class<T> c) throws Exception {
        return null;
    };

    public static Map transferData(JSONEntity obj, Class keytype, Class vtype) throws Exception {
        return null;
    };
}