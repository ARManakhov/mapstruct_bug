package dev.sirosh.mapper;

import java.util.List;

public interface Mapper<D, E> {
    D toDto(E entity);

    E toEntity(D entity);

    List<D> toDto(List<E> entity);

    List<E> toEntity(List<D> dto);
}
