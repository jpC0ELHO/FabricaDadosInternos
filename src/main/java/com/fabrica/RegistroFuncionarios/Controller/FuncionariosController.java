package com.fabrica.RegistroFuncionarios.Controller;

import com.fabrica.RegistroFuncionarios.Model.Funcionarios;
import com.fabrica.RegistroFuncionarios.Service.FuncionariosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(value="/Cargo")
public class FuncionariosController {
    @Autowired
    private FuncionariosService funcionariosService;

    @GetMapping
    public ResponseEntity<Object>getAllCargos(){
return ResponseEntity.status(HttpStatus.OK).body(funcionariosService.ListarFuncionarios());
}
    @PostMapping
    public ResponseEntity<Object>postCargo(@RequestBody Funcionarios funcionarios){
return ResponseEntity.status(HttpStatus.CREATED).body(funcionariosService.cadastrarFuncao(funcionarios));
}
@GetMapping(value="/{id}")
    public ResponseEntity<Object>getCargo(@PathVariable(value="id")Integer id){
        return ResponseEntity.status(HttpStatus.OK).body(funcionariosService.listarCargos(id));
    }
@PutMapping(value="/{id}")
    public ResponseEntity<Object>putCargo(@PathVariable(value = "id")Integer id,@RequestBody Funcionarios funcionarios){

    Optional<Funcionarios>dadosCargos=funcionariosService.listarCargos(id);
    Funcionarios alterarCargos=dadosCargos.get();
    alterarCargos.setNome(funcionarios.getNome());
    alterarCargos.setFuncao(funcionarios.getFuncao());
        return ResponseEntity.status(HttpStatus.OK).body(funcionariosService.cadastrarFuncao(alterarCargos));
}
@DeleteMapping(value="/{id}")
    public ResponseEntity<Object>deleteCargo(@PathVariable(value = "id")Integer id){
funcionariosService.removerCargo(id);
return ResponseEntity.status(HttpStatus.OK).body("Registro removido com Sucesso");
}


}
