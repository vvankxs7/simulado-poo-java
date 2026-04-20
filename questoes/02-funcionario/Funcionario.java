public class Funcionario{
    private String nome;
    private float salario;
    
    public Funcionario(String nome, float salario){
        this.nome = nome;
        this.salario = salario;
    }
    public Funcionario(Funcionario f){
        this(f.nome,f.salario);
    }
    public Funcionario(){
        this("indefinido",0.0f);
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }
    public void setSalario(float salario){
        this.salario = salario;
    }
    public float getSalario(){
        return this.salario;
    }
    public String toString(){
        String r;
        r = "\nNome: "+this.nome+"Salario: "+this.salario;
        return r;
        
    }
}