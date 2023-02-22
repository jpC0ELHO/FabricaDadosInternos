package com.fabrica.RegistroFuncionarios.Controller;

import com.fabrica.RegistroFuncionarios.Model.Materiais;
import com.fabrica.RegistroFuncionarios.Service.MateriaisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(value = "/Peso")
public class MateriaisController {
    @Autowired
    private MateriaisService materiaisService;

    @GetMapping
    public ResponseEntity<Object>getAllMateriais(){
        return ResponseEntity.status(HttpStatus.OK).body(materiaisService.ListarMateriais());
    }
    @PostMapping
    public ResponseEntity<Object>PostMaterial(@RequestBody Materiais materiais){
        return ResponseEntity.status(HttpStatus.CREATED).body(materiaisService.CadastrarMateriais(materiais));
    }
    @GetMapping(value = "/{id}")
    public ResponseEntity<Object>getMaterial(@PathVariable(value = "id")Integer id){
        return ResponseEntity.status(HttpStatus.OK).body(materiaisService.listarPeso(id));
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<Object>putMareial(@PathVariable(value = "id")Integer id,@RequestBody Materiais materiais){
        Optional<Materiais>dadosMateriais=materiaisService.listarPeso(id);
        Materiais alterarCargas=dadosMateriais.get();
        alterarCargas.setQtdM(materiais.getQtdM());
        alterarCargas.setFornecedor(materiais.getFornecedor());
        alterarCargas.setMaterial(materiais.getMaterial());


        return ResponseEntity.status(HttpStatus.OK).body(materiaisService.CadastrarMateriais(alterarCargas));
    }
    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Object>deletarMaterial(@PathVariable(value = "id") Integer id){
        materiaisService.removerPeso(id);
        return ResponseEntity.status(HttpStatus.OK).body("Item removido com sucesso");
    }


}
