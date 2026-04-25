import java.util.Scanner;
public class DemoAtleta{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("\nDigite o quant de atletas:: ");
        int n = sc.nextInt();
        sc.nextLine();

        Atleta [] at = new Atleta[n];

        for(int i =0; i<n; i++){
            System.out.println("\nDigite o nome do atleta: ");
            String nome = sc.nextLine();
            System.out.println("\nDigite a modalidade do atleta: ");
            String mol = sc.nextLine();
            System.out.println("\nDigite a pontuação do atleta: ");
            float pont = sc.nextFloat();
            sc.nextLine();
            at[i]= new Atleta(nome,mol,pont);
        }

        float soma = 0.0f;
            for(int i=0; i<n; i++){
            soma += at[i].getPont();
        }
        float media = soma/n;
        System.out.println("\nMedia da pontuação dos atletas: " + media);

        Atleta maior = at[0];
        for(int i=1; i<n; i++){
            if(at[i].getPont()> maior.getPont()){
                maior = at[i];
            }
        }
        System.out.println("\nAtleta com maior pontuação: " + maior.getPont());

        Atleta menor = at[0];
        for(int i=1; i<n; i++){
            if(at[i].getPont()< menor.getPont()){
                menor = at[i];
            }
        }
        System.out.println("\nAtleta com menor pontuação: " + menor.getPont());

        int contJudo = 0;
        for(int i=0; i<n; i++){
            if(at[i].getMol().equalsIgnoreCase("judo")){
                contJudo++;
            }
        }
        System.out.println("\nQuant de atletas na modalidade judo: " + contJudo);

        int contMedia = 0;
        for(int i=0; i<n; i++){
            if(at[i].getPont()>= media){
                contMedia++;
            }
        }
        System.out.println("\nQuant de atletas com pontuação acima da média: " + contMedia);

        System.out.println(at[0]);
        System.out.println(at[n-1]);

        for(int i=0; i<n; i++){
            for(int j=0; j<n-1; j++){
                if(at[j].getPont() < at[j+1].getPont()){
                    Atleta k = at[j];
                    at[j] = at[j+1];
                    at[j+1] = k;
                }
            }
        }

        System.out.println("\nOrdem decrescente das pontuações: ");
        for(int i=0; i<n; i++){
            System.out.println(at[i]);
        }
        for(int i=0; i<n; i++){
            for(int j=0; j<n-1; j++){
                if(at[j].getNome().compareTo(at[j+1].getNome()) > 0){
                    Atleta k = at[j];
                    at[j] = at[j+1];
                    at[j+1] = k;
                }
            }
        }

        System.out.println("\nOrdem Alfabetica dos nomes: ");
        for(int i = 0; i<n; i++){
            System.out.println(at[i].getNome());
        }
        System.out.println("\nTotal de atletas cadastrados: " + Atleta.getProximoId());
        sc.close();

        }
    }