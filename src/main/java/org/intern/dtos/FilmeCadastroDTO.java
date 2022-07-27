package org.intern.dtos;

import java.time.LocalDate;

import javax.validation.constraints.NotBlank;

import org.serratec.models.Filme;

import com.sun.istack.NotNull;

public class FilmeCadastroDTO {

	@NotNull
	@NotBlank
	public String id;

	@NotNull
    @NotBlank
	public String nome;
	
	@NotNull
	public LocalDate diaSessao;
	
	@NotNull
	@NotBlank
	public String descricao;
	
	public String lancamento;

	public String avaliacao;
	
	
	public Filme toFilme() {
		Filme filme = new Filme();
		filme.setId(this.id);
		filme.setNome(this.nome);
		filme.setDiaSessao(LocalDate.now());
		filme.setDescricao(this.descricao;)
		filme.setLancamento(this.lancamento);
		filme.setAvaliacao(this.avaliacao);
		
		return filme;
	}


	public String getId() {
		return id;
	}

    public String getNome() {
		return nome;
	}

	public LocalDate getDiaSessao() {
		return diaSessao;
	}


	public String getDescricao() {
		return descricao;
	}


	public String getLancamento() {
		return lancamento;
	}

	public String getAvaliacao() {
		return avaliacao;
	}
	
}
