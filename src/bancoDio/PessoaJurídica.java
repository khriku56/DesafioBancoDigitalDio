package bancoDio;

public class PessoaJurídica implements ICliente {

	private String nomeCliente;
	private String nomefantasia;
	private long CNPJCliente;
	
	public PessoaJurídica(String nomeFantasia, String nomeCliente, long cNPJCliente) {
		super();
		this.nomefantasia= nomeFantasia;
		this.nomeCliente = nomeCliente;
		this.CNPJCliente = cNPJCliente;
	}
	
	@Override
	public String getNome() {
		return this.nomeCliente;
	}

	@Override
	public long getId() {
		return this.CNPJCliente;
	}

	public String getNomefantasia() {
		return nomefantasia;
	}
	@Override
	public void EscreveCliente(){
	System.out.println(String.format("Nome Fantasia: %s",this.getNomefantasia()));
	System.out.println(String.format("CNPJ: %s",this.getId()));
	}
}