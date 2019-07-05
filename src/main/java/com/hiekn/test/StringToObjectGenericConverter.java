package com.hiekn.test;

import com.google.common.collect.Sets;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ResolvableType;
import org.springframework.core.convert.TypeDescriptor;
import org.springframework.core.convert.converter.GenericConverter;
import org.springframework.format.FormatterRegistry;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

@Component
public class StringToObjectGenericConverter implements GenericConverter, WebMvcConfigurer {

    @Autowired
    private Gson gson;

    @Override
    public Set<ConvertiblePair> getConvertibleTypes() {
        return Sets.newHashSet(new ConvertiblePair(String.class, MarkObject.class),
                new ConvertiblePair(String.class, Collection.class),
                new ConvertiblePair(String.class, Map.class));
    }

    @Override
    public Object convert(Object source, TypeDescriptor sourceType, TypeDescriptor targetType) {
        ResolvableType resolvableType = targetType.getResolvableType();
        return gson.fromJson(source.toString(),resolvableType.hasGenerics()?resolvableType.getType():resolvableType.resolve());
    }

    @Override
    public void addFormatters(FormatterRegistry registry) {
        registry.addConverter(this);
    }

}
