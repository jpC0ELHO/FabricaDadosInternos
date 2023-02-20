package com.fabrica.RegistroFuncionarios.Service;

import com.fabrica.RegistroFuncionarios.Model.Categoria;
import com.fabrica.RegistroFuncionarios.Model.Funcionarios;
import com.fabrica.RegistroFuncionarios.Repository.FuncionariosRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FuncionariosService {

    @Autowired
    private FuncionariosRepository funcionariosRepository;

    public FuncionariosService(){}


    @Transactional
    public List<Funcionarios>ListarFuncionarios(){
        List<Funcionarios>ListarFuncionariosCargos=this.funcionariosRepository.findAll();
        return ListarFuncionariosCargos;
    }

    public Funcionarios cadastrarFuncao(Funcionarios funcionarios){
        Categoria categoria1=new Categoria(1);
        Categoria categoria2=new Categoria(2);
        Categoria categoria3=new Categoria(3);
        Categoria categoria4=new Categoria(4);
        Categoria categoria5=new Categoria(5);
        String result;
        if(funcionarios.getFuncao().equals("Estagiario")||funcionarios.getFuncao().equals("Assistente")){

            result=funcionarios.getFuncao();
            funcionarios.setCategoria(categoria1);
            funcionarios.setAcesso(false);

        }
        else if(funcionarios.getFuncao().equals("Operador")||funcionarios.getFuncao().equals("Profissional")){
            result=funcionarios.getFuncao();
            funcionarios.setCategoria(categoria2);
            funcionarios.setAcesso(false);
        }
        else if(funcionarios.getFuncao().equals("Supervisor")||funcionarios.getFuncao().equals("Gestor")){
            result=funcionarios.getFuncao();
            funcionarios.setCategoria(categoria3);
            funcionarios.setAcesso(true);
        }
        else if(funcionarios.getFuncao().equals("Analista")||funcionarios.getFuncao().equals("Encarregado")){
            result=funcionarios.getFuncao();
            funcionarios.setCategoria(categoria4);
            funcionarios.setAcesso(true);
        }
        else if(funcionarios.getFuncao().equals("Chefe")||funcionarios.getFuncao().equals("Socio")){
            result=funcionarios.getFuncao();
            funcionarios.setCategoria(categoria5);
            funcionarios.setAcesso(true);
        }

        return (Funcionarios)this.funcionariosRepository.save(funcionarios);

    }
    public Optional<Funcionarios>listarCargos(Integer id){

        return this.funcionariosRepository.findById(id);
    }
    @Transactional
    public void removerCargo(Integer id){this.funcionariosRepository.deleteById(id);}

}
