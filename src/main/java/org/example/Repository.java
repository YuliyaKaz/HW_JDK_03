package org.example;

public interface Repository<T> {
    void save(T t);
    void delete(T t);
    T findById(Long id);
}
