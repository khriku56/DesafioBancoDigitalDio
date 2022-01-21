package bancoDio;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		ContaCorrente cc;
		ContaPoupanca cp;
		Scanner entrada= new Scanner(System.in);
		System.out.println("====Digite 1 para pessoa f�sica e 2 para empresas ====");

		short tiposcliente=entrada.nextShort();
		
		System.out.println(String.format("====Por favor digite os Seus dados===="));

		if(tiposcliente==2) {
			PessoaJur�dica cli;
			String nomeCliente;
			String nomefantasia;
			long CNPJCliente;
			System.out.println(String.format("====Por favor digite a sua empresa===="));
			nomefantasia=entrada.nextLine();
			System.out.println(String.format("====Por favor digite o seu nome===="));
			nomeCliente=entrada.nextLine();
			System.out.println(String.format("====Por favor digite o CNPJ da empresa===="));
			CNPJCliente=entrada.nextLong();
			cli= new PessoaJur�dica(nomefantasia,nomeCliente,CNPJCliente);
			cc= new ContaCorrente(cli);
			cp= new ContaPoupanca(cli);
			menu(cli,cc,cp);
		}else if(tiposcliente==1){
			PessoaF�sica cli;
			String nome;
			long RG;
			long CPFCliente;
			System.out.println(String.format("====Por favor digite o seu CPF===="));
			CPFCliente=entrada.nextLong();
			System.out.println(String.format("====Por favor digite o seu nome===="));
			nome=entrada.nextLine();
			System.out.println(String.format("====Por favor digite o seu RG===="));
			RG=entrada.nextLong(); 
			cli=new PessoaF�sica(nome,CPFCliente,RG);
			cc= new ContaCorrente(cli);
			cp= new ContaPoupanca(cli);
			menu(cli, cc, cp);
		}
		else
			System.out.println(String.format("====Error===="));
		entrada.close();
	}

	private static void menu(PessoaF�sica cli, ContaCorrente C,ContaPoupanca P) {
		Scanner entrada= new Scanner(System.in);
		short i=0;
		System.out.println(String.format("====Por favor digite o que deseja fazer===="));
		System.out.print("1:Sacar /n 2:Depositar /n 3:transferir /n 0:sair");
		i=entrada.nextShort();

		do {
		switch(i) {
			case 1:
				System.out.println(String.format("====Insira quantidade===="));
				C.sacar(i);
				System.out.println(String.format("====deseja fazer mais algo?===="));
				System.out.print("1:Sacar /n 2:Depositar /n 3:transferir /n 0:sair");
				break;
			case 2:
				C.depositar(i);
				System.out.println(String.format("====deseja fazer mais algo?===="));
				System.out.print("1:Sacar /n 2:Depositar /n 3:transferir /n 0:sair");
				break;
			case 3:
				C.transferir(i, P);
				System.out.println(String.format("====deseja fazer mais algo?===="));
				System.out.print("1:Sacar /n 2:Depositar /n 3:transferir /n 0:sair");
				break;
			default: 
				break;
			}
		}while(i>0 && i<4);
		entrada.close();
	}
	private static void menu(PessoaJur�dica cli, ContaCorrente C,ContaPoupanca P) {
		Scanner entrada= new Scanner(System.in);
		short i=0;
		double valor=0;
		System.out.println(String.format("====Por favor digite o que deseja fazer===="));
		System.out.print("1:Sacar /n 2:Depositar /n 3:transferir /n 0:sair");
		i=entrada.nextShort();

		do {
		switch(i) {
			case 1:
				System.out.println(String.format("====Insira quantidade a sacar===="));
				valor=entrada.nextDouble();
				C.sacar(valor);
				break;
			case 2:
				System.out.println(String.format("====Insira quantidade a depositar===="));
				valor=entrada.nextDouble();
				C.depositar(valor);
				break;
			case 3:
				System.out.println(String.format("====Insira quantidade a transferir a poupan�a===="));
				valor= entrada.nextDouble();
				C.transferir(valor, P);
				break;
			default: 
				continue;}
			System.out.println(String.format("====deseja fazer mais algo?===="));
			System.out.print("1:Sacar /n 2:Depositar /n 3:transferir /n 0:sair");
			i=entrada.nextShort();
		}while(i>0 && i<4);
		entrada.close();
	}
}
