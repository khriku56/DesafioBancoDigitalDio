package bancoDio;

public class ContaPoupanca extends Conta implements ITransação{
	public ContaPoupanca(ICliente cliente) {
		super(cliente);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void sacar(double valor) {
		// TODO Auto-generated method stub
		super.sacar(valor);
	}

	@Override
	public void transferir(double valor, Conta contaBeneficiario) {
		// TODO Auto-generated method stub
		super.transferir(valor, contaBeneficiario);
	}

	@Override
	public void depositar(double valor) {
		// TODO Auto-generated method stub
		super.depositar(valor);
	}

	@Override
	public int getAgencia() {
		// TODO Auto-generated method stub
		return super.getAgencia();
	}

	@Override
	public int getNumero() {
		// TODO Auto-generated method stub
		return super.getNumero();
	}

	@Override
	public double getSaldo() {
		// TODO Auto-generated method stub
		return super.getSaldo();
	}
}