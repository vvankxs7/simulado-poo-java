public class Livro {

    private String titulo;
    private float preco;
    
   
    public Livro(String titulo, float preco) {
        this.titulo = titulo; 
        this.preco = preco;
    }
    
    public Livro(String titulo) {
        this(titulo, 0.0f);
    }
    
    public Livro() {
        this("indefinido", 0.0f);
    }
    
    public String getTitulo() {
        return titulo;
    }
    
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    public float getPreco() {
        return preco;
    }
    
    public void setPreco(float preco) {
        this.preco = preco;
    }
    
    public String toString() {
        return "Livro [titulo=" + titulo+ ", preco=" + preco + "]";
    }
}