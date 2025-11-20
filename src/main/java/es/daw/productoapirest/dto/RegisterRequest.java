package es.daw.productoapirest.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data //en los entity no se puede poner
public class RegisterRequest {
    @NotBlank(message = "El nombre de usuario es obligatorio")
    private String username;
    @NotBlank(message = "La contraseña es obligatoria")
    private String password;
    //private String email; //si fuese algo más completo, tendría email entre otras cosas
    private String role; // opcional: Rol del usuario nuevo...
    //PENDIENTE TODO y si queremos indicar varios roles???
    //private List<String> roles = new ArrayList<>();

//    {
//        "username": "pepito",
//        "password": "1234",
//        "roles": ["ADMIN", "editor", "ROLE_USER"]
//    }
}
