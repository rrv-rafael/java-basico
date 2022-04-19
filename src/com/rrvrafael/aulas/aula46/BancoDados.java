package com.rrvrafael.aulas.aula46;

public interface BancoDados extends SqlDCL, SqlDML, SqlDDL {
    void abrirConexao(String query);
    void fecharConexao(String query);
}
