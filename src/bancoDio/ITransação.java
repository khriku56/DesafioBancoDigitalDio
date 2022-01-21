package bancoDio;

public interface ITransação {
	public void sacar(double saldo);
	public void transferir(double valor, Conta contaBeneficiário); 
	public void depositar(double valor); 
}
