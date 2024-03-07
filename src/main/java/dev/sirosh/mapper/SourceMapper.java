package dev.sirosh.mapper;

import dev.sirosh.dto.SourceDto;
import dev.sirosh.entity.Source;

import java.util.List;

@org.mapstruct.Mapper
public interface SourceMapper extends Mapper<SourceDto, Source> {
    SourceDto toDto(Source entity);

    Source toEntity(SourceDto entity);

    List<SourceDto> toDto(List<Source> entity);

    List<Source> toEntity(List<SourceDto> dto);
}
