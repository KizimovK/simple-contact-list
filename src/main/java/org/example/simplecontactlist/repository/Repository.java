package org.example.simplecontactlist.repository;

import java.util.List;
import java.util.Optional;

public interface Repository<T> {
    long insert(T entity);
    Optional<T> selectById(long id);
    List<T> selectAll();
    T update(T entity);
    void removeById(long id);
}
