package br.com.fiap.bean;
/**
 * 
 * @author Cássio
 *
 */
public class Freelancer implements Funcionario{
	//variáveis 
		private String nome;
		private float valorHoraTrabalho;
		private long CNPJ;
		//gets e setters
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public float getValorHoraTrabalho() {
			return valorHoraTrabalho;
		}
		public void setValorHoraTrabalho(float valorHoraTrabalho) {
			this.valorHoraTrabalho = valorHoraTrabalho;
		}
		public long getCNPJ() {
			return CNPJ;
		}
		public void setCNPJ(long cNPJ) {
			CNPJ = cNPJ;
		}
		//método
		/**
		 * Calcula o salário do vendedor
		 */
		public float calcularSalario() {
			float salario = ((valorHoraTrabalho * 40) * 4) * 1.5f;
			return salario;
		}
}
