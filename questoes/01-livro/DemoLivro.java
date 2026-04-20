import java.util.Scanner;
    public class DemoLivro{
        public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("\nEntre com a quant de livros: ");
        int n = sc.nextInt();
        sc.nextLine();
        
        Livro [] l = new Livro[n];
        
        for(int i = 0; i<n; i++){
            System.out.println("Nome do livro "+(i+1)+ ": ");
            String livro = sc.nextLine();
            System.out.println("Preço do livro"+(i+1)+": ");
            float preco = sc.nextFloat();
            sc.nextLine();
            l[i] = new Livro(livro,preco);
        }
        float soma = 0;
        for(int i = 0; i<n; i++){
            soma += l[i].getPreco();
        }
        float media = soma/ n; 
        System.out.println("\nMedia de preco: "+media);
        
            System.out.println("Ultimo livro: "+ l[n-1]);
        
        for(int i = 0; i<n-1; i++){
            for (int j = 0; j<n -1 - i; j++){
                if(l[j].getPreco()>l[j+1].getPreco()){
                    Livro te = l[j];
                    l[j] = l[j+1];
                    l[j+1] = te;
                }
            }
        }
        System.out.println("\n--- Livros em ordem crescente de preço ---");
        for (int i = 0; i < n; i++) {
            System.out.println(l[i]);
        }
        sc.close();
        
                }
    }