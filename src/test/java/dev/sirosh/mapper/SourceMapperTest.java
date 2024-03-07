package dev.sirosh.mapper;

import dev.sirosh.dto.SourceDto;
import dev.sirosh.entity.Source;
import org.junit.jupiter.api.Test;
import org.mapstruct.factory.Mappers;

import static org.junit.Assert.assertEquals;

class SourceMapperTest {

    @Test
    void toEntity() {
        SourceMapper mapper = Mappers.getMapper(SourceMapper.class);

        Source expected = new Source();
        expected.setName("noop !");

        SourceDto from = new SourceDto();
        from.setName("noop !");

        Source actual = mapper.toEntity(from);

        assertEquals(expected, actual);
    }
}