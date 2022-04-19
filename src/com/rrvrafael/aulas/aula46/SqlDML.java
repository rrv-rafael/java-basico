package com.rrvrafael.aulas.aula46;

public interface SqlDML {
    void insert(String query);
    void update(String query);
    void delete(String query);
    void select(String query);
}
