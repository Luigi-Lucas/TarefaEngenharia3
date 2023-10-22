package controller;

import java.util.Scanner;
import abstracoes.Despesa;
import model.Apartamento;
import model.Cobranca;
import model.DespesaFixa;
import model.DespesaVariavel;

public class CondominioController {

	private Scanner scan = new Scanner(System.in);
	private Despesa[] despesas = new Despesa[20];
	private static int indice = 0;

	public void menu() {
		while (true) {
			System.out.println("1 - Lancar Despesas");
			System.out.println("2 - Gerar Boleto");
			System.out.println("3 - Sair");

			int opc = scan.nextInt();

			switch (opc) {
			case 1:
				lancarDespesa();
				break;
			case 2:
				gerarBoleto();
				break;
			case 3:
				System.out.println("Programa finalizado!");
				System.exit(0);
			default:
				System.out.println("Opcao invalida!");
				break;
			}
		}
	}

	public void lancarDespesa() {
		System.out.println("Qual tipo de despesa deseja lancar?");
		System.out.println("1 - Fixa \n2 - Especifica");
		int tipo = scan.nextInt();

		if (tipo != 1 && tipo != 2) {
		    System.out.println("Opcao invalida!");
			return;
		}
		
		System.out.println("Digite a descricao da despesa: ");
		String descricao = scan.next();

		System.out.println("Digite o valor: ");
		double valor = scan.nextDouble();
		
		System.out.println("Digite a data de referencia: ");
		String ref = scan.next();

		if (tipo == 1) {
			Despesa d = new DespesaFixa(descricao, valor, ref);
			d.registrarDesp(d);
			despesas[indice] = d;
			indice++;
		} else {
			Despesa d = new DespesaVariavel(descricao, valor, ref);
			d.registrarDesp(d);
			despesas[indice] = d;
			indice++;
		}
		System.out.println("Despesa lancada!\n");
	}

	public void gerarBoleto() {
		if (!(despesas[0] == null)) {
			
			System.out.println("Digite as informacoes do apartamento que deseja cobrar:");
			System.out.println("numero do apartamento: ");
			int numero = scan.nextInt();

			System.out.println("numero de quartos: ");
			int numQuartos = scan.nextInt();

			Apartamento apto = new Apartamento(numero, numQuartos);
			
			System.out.println("Digite o valor da multa (se houver): ");
			double multa = scan.nextDouble();

			System.out.println("Digite a data de referencia da cobranca: ");
			String referencia = scan.next();

			System.out.println("Digite a data de pagamento da cobranca: ");
			String dataPagamento = scan.next();

			Cobranca c = new Cobranca(referencia, multa, dataPagamento, apto);
			
			System.out.println("Digite o somatorio de quartos de todo o predio: ");
			int somatorio = scan.nextInt();
			
			for(Despesa d : despesas) {
				if (d != null) {
					c.calcularCondominio(apto, d, somatorio);
				}
			}
			
			System.out.println("Informacoes da cobranca: " + "Valor final: " + c.getValor() + ", Numero apartamento: "
					+ c.getApartamento().getNumApto() + ", Referencia: " + c.getReferencia() + ", Data de pagamento: "
					+ c.getDataPagamento());
			
			System.out.println("Cobranca gerada! \n");
			
		} else {
			System.out.println("Nao ha despesas lancadas para gerar uma cobranca!");
			return;
		}
	}
}
