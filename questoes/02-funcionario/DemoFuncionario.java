import java.util.Scanner;
public class DemoFuncionario{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre com o quant de funcionario: ");
        int n = sc.nextInt();
        sc.nextLine();
        Funcionario [] f = new Funcionario[n];
        
        for(int i = 0; i<n; i++){
            System.out.println("Nome do funcionario: "+(i+1)+": ");
            String nome = sc.nextLine();
            System.out.println("Salario do funcionario: "+(i+1)+": ");
            float salario = sc.nextFloat();
            sc.nextLine();
            f[i] = new Funcionario(nome,salario);
        }
        
        Funcionario maior = f[0];
        for(int i = 1; i<n; i++){
            if(f[i].getSalario() > maior.getSalario()){
                maior = f[i];
            }
        }
        System.out.println("Funcionario com maior salario "+maior+": ");
        
        float soma = 0;
        for(int i = 0; i<n; i++){
            soma =+ f[i].getSalario();
        }
        float media = soma / n;
        System.out.println("\nMedia de salario da empresa: "+media+": ");
        
        for(int i =0; i<n-1; i++){
            for(int j = 0; j<n-1; j++){
                if(f[j].getNome().compareTo(f[j+1].getNome()) > 0){
                    Funcionario sla = f[j];
                    f[j] = f[j+1];
                    f[j+1] = sla;
                }
            }
        }
        System.out.println("--- Funcionários em Ordem Alfabética ---");
        for (int i = 0; i < n; i++) {
            System.out.println("Nome: " + f[i].getNome() + "\nSalário: " + f[i].getSalario());
}
        sc.close();
    }
        }