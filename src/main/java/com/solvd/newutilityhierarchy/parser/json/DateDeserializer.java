package com.solvd.newutilityhierarchy.parser.json;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;

import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class DateDeserializer extends StdDeserializer<LocalDateTime> {

    private static final long serialVersionUID = 1L;

    protected DateDeserializer() {
        super(LocalDate.class);
    }


    @Override
    public LocalDateTime deserialize(JsonParser jp, DeserializationContext context)
            throws IOException {
        return LocalDateTime.parse(jp.readValueAs(String.class));
    }
}
