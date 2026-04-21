import java.util.Scanner;
public class DemoCarro {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Entre com a quant de carro: ");
		int n = sc.nextInt();
		sc.nextLine();

		Carro [] c = new Carro[n];

		for(int i = 0; i<n; i++) {
			System.out.println("Modelo do carro: "+(i+1)+ ": ");
			String modelo = sc.nextLine();
			System.out.println("Ano do carro: "+(i+1)+": ");
			int ano = sc.nextInt();
			System.out.println("Preco do carro: "+(i+1)+": ");
			float preco = sc.nextFloat();
			sc.nextLine();
			c[i] = new Carro(modelo,ano,preco);
		}

		Carro maior = c[0];
		for(int i = 1; i<n; i++) {
			if(c[i].getPreco()>maior.getPreco()) {
			maior = c[i];
			}
		}
		System.out.println("Carro mais caro: "+maior);

		float soma = 0;
		for(int i = 0; i<n; i++) {
			soma +=c[i].getPreco();
		}
		float media = soma/n;
		System.out.println("\nMedia de preco: "+media);

	int cont = 0;
    for(int i = 0; i<n; i++){
		if(c[i].getAno()>=2020) {
			cont++;
		}
    }
    System.out.println("Carros acima de 2020: "+cont);

	for(int i=0; i<n-1; i++) {
		for(int j = 0; j<n-1-i; j++) {
			if(c[j].getAno()>c[j+1].getAno()) {
				Carro ca = c[j];
				c[j] = c[j+1];
				c[j+1] = ca;
			}
		}
	}
	System.out.println("!!! Ordem crescente !!!");
	for(int i=0; i<n; i++) {
		System.out.println(c[i]);
	}
	for(int i=0; i<n-1; i++) {
		for(int j = 0; j<n-1-i; j++) {
			if(c[j].getModelo().compareTo(c[j+1].getModelo()) > 0) {
             Carro ca = c[j];
                        c[j] = c[j+1];
                        c[j+1] = ca;
                    }
		}
	}
	System.out.println("!!! Ordem alfabetica !!!");
	    for(int i=0; i<n; i++) {
		System.out.println(c[i]);
	    }
	sc.close();
	}
}