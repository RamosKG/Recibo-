package br.com.db1.start.recibo;

import java.util.Date;
import java.util.List;

public class Recibo {

	private Integer numero;

	private Double valor;

	private Date dataCadastro;

	private Boolean confirmacao;

	private Date dataEmissao;

	private List<Servico> servico;
	
	private Emitente emitente; 
	
	private Pagador pagador; 
	
	private Endereco endereco;
	
	private Cidade cidade; 

	public String getValorDescritivo() {
		return " ";
	}

	public String getDataEmissaoDescritiva() {
		return " "; 
	}
}
