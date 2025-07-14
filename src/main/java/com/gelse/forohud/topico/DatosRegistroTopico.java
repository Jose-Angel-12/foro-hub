package com.gelse.forohud.topico;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

public record DatosRegistroTopico(
        @NotBlank(message = "El Titulo no puede estar en blanco")
        @Pattern(regexp = "^.{1,100}$", message = "El Titulo solo puede tener de 1 a 100 caracteres")
        String titulo,
        @NotBlank(message = "El Titulo no puede estar en blanco")
        @Pattern(regexp = "^.{1,800}$", message = "El Mensaje solo puede tener de 1 a 800 caracteres")
        String mensaje,
        @NotBlank(message = "El Autor no puede estar en blanco")
        String autor,
        @NotBlank(message = "El Curso no puede estar en blanco")
        String curso
) {
}
