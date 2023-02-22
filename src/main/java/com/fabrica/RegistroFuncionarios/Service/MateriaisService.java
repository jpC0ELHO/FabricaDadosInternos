package com.fabrica.RegistroFuncionarios.Service;

import com.fabrica.RegistroFuncionarios.Model.CategoriaMateriais;
import com.fabrica.RegistroFuncionarios.Model.Materiais;
import com.fabrica.RegistroFuncionarios.Repository.MateriaisRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MateriaisService {


    @Autowired
    private MateriaisRepository materiaisRepository;

    private MateriaisService(){}

    public List<Materiais>ListarMateriais(){
        List<Materiais>ListarMateriaisCategoria=this.materiaisRepository.findAll();
        return ListarMateriaisCategoria;
    }
    public Materiais CadastrarMateriais(Materiais materiais){
        CategoriaMateriais categoria1=new CategoriaMateriais(1);
        CategoriaMateriais categoria2=new CategoriaMateriais(2);
        CategoriaMateriais categoria3=new CategoriaMateriais(3);
        CategoriaMateriais categoria4=new CategoriaMateriais(4);
        Integer result;
        if(materiais.getPeso()<=100){
            result=materiais.getPeso();
            materiais.setCategoria(categoria1);
            materiais.setQtdM(100);
        } else if (materiais.getPeso()>=101||materiais.getPeso()<=500) {
            result=materiais.getPeso();
            materiais.setCategoria(categoria2);
            materiais.setQtdM(500);
        }else if (materiais.getPeso()>=501||materiais.getPeso()<=1000) {
            result=materiais.getPeso();
            materiais.setCategoria(categoria3);
            materiais.setQtdM(1000);
        }else if (materiais.getPeso()>=1001||materiais.getPeso()<=10000) {
            result=materiais.getPeso();
            materiais.setCategoria(categoria4);
            materiais.setQtdM(10000);
        }

        return(Materiais) this.materiaisRepository.save(materiais);

    }
    public Optional<Materiais> listarPeso(Integer id){
        return this.materiaisRepository.findById(id);
    }
    @Transactional
    public void removerPeso(Integer id){
        this.materiaisRepository.deleteById(id);
    }
}
