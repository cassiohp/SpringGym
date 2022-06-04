package me.dio.academia.digital.entity.form;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.br.CPF;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AlunoForm {

  @NotBlank(message = "Preencha o campo corretamente.")
  private String nome;

  @NotBlank(message = "Preencha o campo corretamente.")
  @CPF(message = "'${validetedValue}' é inválido!")
  private String cpf;

  @NotBlank(message = "Preencha o campo corretamente.")
  private String bairro;

  @NotNull(message = "Preencha o campo corretamente.")
  @Past(message = "Data inválida.")
  private LocalDate dataDeNascimento;
}
