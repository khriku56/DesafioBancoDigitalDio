package bancoDio;

public class PessoaF�sica implements ICliente{

	private String nomeCliente;
	private long cpfCliente;
	private long RgCliente;
	
	
	public PessoaF�sica(String nomeCliente, long cpfCliente, long rgCliente) {
		super();
		this.nomeCliente = nomeCliente;
		this.cpfCliente = cpfCliente;
		RgCliente = rgCliente;
	}
	@Override
	public void EscreveCliente(){
	System.out.println(String.format("RG: %d",this.getRgCliente()));
	System.out.println(String.format("CPF: %d",this.getId()));
	}

	@Override
	public String getNome() {
		return this.nomeCliente;
	}

	@Override
	public long getId() {

		return this.cpfCliente;
	}
	
	public long getRgCliente() 
	{
		return this.RgCliente;
	}
}
