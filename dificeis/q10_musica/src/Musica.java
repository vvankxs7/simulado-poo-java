public class Musica {
    private String titulo;
    private String artista;
    private String genero;
    private float duracao;
    private final int codigo;

    public static int codAux = 1;

    public Musica(String titulo, String artista, String genero, float duracao) {
        this.titulo = titulo;
        this.artista = artista;
        this.genero = genero;
        this.duracao = duracao;
        this.codigo = codAux;
        codAux++;
    }

    public Musica(String titulo, String artista) {
        this(titulo, artista, "indefinido", 0.0f);
    }

    public Musica(String titulo) {
        this(titulo, "indefinido", "indefinido", 0.0f);
    }

    public Musica() {
        this("indefinido", "indefinido", "indefinido", 0.0f);
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getArtista() {
        return this.artista;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getGenero() {
        return this.genero;
    }

    public void setDuracao(float duracao) {
        this.duracao = duracao;
    }

    public float getDuracao() {
        return this.duracao;
    }

    public int getCodigo() {
        return this.codigo;
    }

    public static int getProximoCodigo() {
        return codAux;
    }

    public String toString() {
        String r;
        r = "\nCódigo: " + this.codigo + "\nTítulo: " + this.titulo + "\nArtista: " + this.artista + "\nGênero: " + this.genero + "\nDuração: " + this.duracao;
        return r;
    }
}
