package bancoDio;

public interface ITransa��o {
	public void sacar(double saldo);
	public void transferir(double valor, Conta contaBenefici�rio); 
	public void depositar(double valor); 
}
