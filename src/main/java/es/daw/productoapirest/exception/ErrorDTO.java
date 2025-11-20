package es.daw.productoapirest.exception;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.Map;

@Data //por ser un DTO. Incluye getters y setters
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ErrorDTO {
    private String message; //mensaje nuestro personalizado
    private LocalDateTime timestamp;
    private Map<String, String> details;
}
