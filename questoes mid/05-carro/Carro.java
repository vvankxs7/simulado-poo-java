public class Carro{
    private String modelo;
    private int ano;
    private float preco;
    
    public Carro(String modelo,int ano,float preco){
        this.modelo = modelo;
        this.ano = ano;
        this.preco = preco;
    }
    
    public Carro(String modelo){
        this(modelo,0,0.0f);
    }
    public Carro(String modelo,int ano){
        this(modelo,ano,0.0f);
    }
    public Carro(){
        this("indefinido",0,0.0f);
    }
    
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    public String getModelo(){
        return this.modelo;
    }
    public void setAno(int ano){
        this.ano = ano;
    }
    public int getAno(){
        return this.ano;
    }
    public void setPreco(float preco){
        this.preco = preco;
    }
    public float getPreco(){
        return this.preco;
    }
    
    public String toString(){
        String r;
        r = "\nModelo: "+this.modelo+"\nAno: "+this.ano+"\nPreço: "+this.preco;
        return r;
    }
}