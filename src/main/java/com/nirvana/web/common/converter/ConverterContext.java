package com.nirvana.web.common.converter;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConverterContext {

    private static final Map<String, Converter> converterCache = new ConcurrentHashMap<>();

    private static final Map<String, Converter> nameLinkedConverterCache = new ConcurrentHashMap<>();

    public static <DOMAIN, DTO> Converter<DOMAIN, DTO> getConverter(Class<DOMAIN> domainClass, Class<DTO> dtoClass) {
        return null;
    }

    @SuppressWarnings("unchecked")
    public static <T extends Converter> T getConverter(Class<T> converterClass) {
        String className = converterClass.getName();
        T converter = (T) converterCache.get(className);
        if (converter == null) {
            try {
                converter = converterClass.newInstance();
                converterCache.put(className, converter);
            } catch (InstantiationException | IllegalAccessException e) {
                throw new IllegalArgumentException("转换器：" + className + "未找到默认公开的无参构造方法。");
            }
        }
        return converter;
    }

}
