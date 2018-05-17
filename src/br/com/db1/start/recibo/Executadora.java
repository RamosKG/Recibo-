package br.com.db1.start.recibo;

public class Executadora {

	public static void main(String[] args) {
		exibirCepFormatado(80540150);
		exibirCepFormatado(87350698);
		exibirCepFormatado(87707070);

		exibirDocumentoFormatado("00000000000");

	}

	private static void exibirCepFormatado(Integer cepSemFormatar) {
		Endereco endereco = new Endereco();
		endereco.setCep(cepSemFormatar);
		System.out.println(endereco.getCepFormatado());
	}

	private static void exibirDocumentoFormatado(String documentoSemFormatacao) {
		Emitente documento = new Emitente();
		documento.setDocumento(documentoSemFormatacao);
		System.out.println(documento.getDocumentoFormatado());
	}
}
