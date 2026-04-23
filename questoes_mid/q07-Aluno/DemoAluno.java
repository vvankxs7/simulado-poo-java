import java.util.Scanner;
public class DemoAluno{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("\nDigite o quant de alunos:");
        int n = sc.nextInt();
        sc.nextLine();

        Aluno[] a = new Aluno[n];

        for(int i = 0; i<n; i++){
            System.out.println("\nDigite o nome do aluno: ");
            String nome = sc.nextLine();
            System.out.println("\nDigite a media do aluno: ");
            float media = sc.nextFloat();
            sc.nextLine();
            a[i] = new Aluno(nome,media);
        }

        float soma = 0.0f;
        float maiorMedia = -1.0f;
        float menorMedia = 11.0f;
        for(int i = 0; i<n; i++){
            soma += a[i].getMedia();
            if(a[i].getMedia()> maiorMedia){
                maiorMedia = a[i].getMedia();
            }
            if(a[i].getMedia()< menorMedia){
                menorMedia = a[i].getMedia();
            }
        }
        float media = soma/n;
        System.out.println("\nMaior Media da turma: " + maiorMedia);
        System.out.println("\nMenor media da turma: " + menorMedia);

        int cont = 0;
        for(int i=0; i<n; i++){
            if(a[i].getMedia()>=7.0f){
                cont++;
            }
        }
        System.out.println("\nQuant de alunos aprovados: " + cont);

        System.out.println(a[n-1].getMedia());
        
        for(int i = 0; i<n; i++){
            for(int j = 0; j<n-1; j++){
                if(a[j].getMedia() < a[j+1].getMedia()){
                    Aluno aux = a[j];
                    a[j] = a[j+1];
                    a[j+1] = aux;
                }
            }
        }
        System.out.println("\nOrdem decrescente das medias: ");
        for(int i = 0; i<n; i++){
            System.out.println(a[i].getMedia());
        }
        for(int i = 0; i<n; i++){
            for(int j = 0; j<n-1; j++){
                if(a[j].getNome().compareTo(a[j+1].getNome())>0){
                    Aluno aux = a[j];
                    a[j] = a[j+1];
                    a[j+1] = aux;
                }
            }
        }
        System.out.println("\nOrdem Alfabetica dos nomes: ");
        for(int i = 0; i<n; i++){
            System.out.println(a[i].getNome());
        }

        System.out.println("\nProxima matricula: " + Aluno.getProximaMatricula());
        sc.close();

    }
}