package bancoDio;

public abstract class Conta implements ITransação {

	private static final int AGENCIA_PRINCIPAL = 1;
	private static int SEQUENTIAL = 1;
	protected int agencia;
	protected int numeroCliente;
	protected double saldo;
	private ICliente cliente;

	public Conta(ICliente cliente) {
		super();
		this.agencia = AGENCIA_PRINCIPAL;
		this.numeroCliente = SEQUENTIAL++;
		this.saldo = 0;
		this.cliente=cliente;
	}

	@Override
	public void sacar(double valor) {
		this.saldo = saldo - valor;
	}

	@Override
	public void transferir(double valor, Conta contaBeneficiario) {
		this.sacar(valor);
		contaBeneficiario.depositar(valor);
	}

	@Override
	public void depositar(double valor) {
		this.saldo = saldo + valor;
	}

	public int getAgencia() {
		return agencia;
	}

	public int getNumero() {
		return numeroCliente;
	}

	public double getSaldo() {
		return saldo;
	}
	public void getExtrato() {
		System.out.println(String.format("====Extrato do Usuário===="));
		System.out.println(String.format("Cliente: %s",this.cliente.getNome()));
		cliente.EscreveCliente();
		System.out.println(String.format("Agencia: %d",this.agencia));
		System.out.println(String.format("ID: %d",this.numeroCliente));
		System.out.println(String.format("Saldo: %.2f",this.saldo));
	}
}