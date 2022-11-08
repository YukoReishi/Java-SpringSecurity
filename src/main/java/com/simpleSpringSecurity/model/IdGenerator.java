package com.simpleSpringSecurity.model;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

import java.io.Serializable;
import java.util.function.BiFunction;
import java.util.function.Function;

public class IdGenerator implements IdentifierGenerator {
    @Override
    public Serializable generate(SharedSessionContractImplementor sharedSessionContractImplementor, Object o) throws HibernateException {

        String prefix = "STD";
        Long suffix = Long.valueOf(10000);

        BiFunction<String, Long, String> idGenerated = (value1, value2) -> value1 + value2;
        suffix = suffix + 1;
        return (idGenerated.apply(prefix, suffix));

    }
}
