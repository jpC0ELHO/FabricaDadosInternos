package com.fabrica.RegistroFuncionarios.Repository;

import com.fabrica.RegistroFuncionarios.Model.Funcionarios;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FuncionariosRepository extends JpaRepository<Funcionarios,String> {
}
