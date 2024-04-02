package br.com.fiap;


public class UsaPoupanca1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			// TODO Auto-generated method stub
			ContaPoupanca conta1 = new ContaPoupanca();
			ContaPoupanca conta2 = new ContaPoupanca();
			conta1.setNumConta(777);
			conta1.setDonoConta("Mohamed");
			conta1.setSaldoConta(7000000);
			conta2.setNumConta(284);
			conta2.setDonoConta("Lu Bu");
			conta2.setSaldoConta(700000000);
			//
			System.out.println("Conta 1");
			System.out.println("ID: "+ conta1.getNumConta());
			System.out.println("Dono da conta: " + conta1.getDonoConta());
			System.out.println("Saldo na conta: " + conta1.getSaldoConta());
			//
			System.out.println("Conta 2");
			System.out.println("ID: "+ conta2.getNumConta());
			System.out.println("Dono da conta: " + conta2.getDonoConta());
			System.out.println("Saldo na conta: " + conta2.getSaldoConta());
		}catch(Exception e){
			System.out.println("Algo deu errado");
		}

}
}
