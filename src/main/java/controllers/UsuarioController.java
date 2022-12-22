package controllers;

import models.ModeloUsuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import services.UsuarioServicios;

import java.util.ArrayList;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {
    @Autowired
    UsuarioServicios usuarioServicios;

    @GetMapping()
    public ArrayList<ModeloUsuario> obtenerUsuarios(){
        return usuarioServicios.obtenerUsuarios();
    }

    @PostMapping()
    public ModeloUsuario guardarUsuario(@RequestBody ModeloUsuario usuario){
        return this.usuarioServicios.guardarUsuario(usuario);
    }
}
