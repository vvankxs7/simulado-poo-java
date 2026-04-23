public class Aluno {
    private String nome;
    private int mat;
    private float media;
    public static int matAux = 100;

    public Aluno(String nome,float media){
        this.nome = nome;
        this.media = media;
        this.mat = matAux;
        matAux++;
    }

    public Aluno(String nome){
        this(nome,0.0f);
    }

    public Aluno(){
        this("indenfinido",0.0f);
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }
    public void setMedia(float media){
        this.media = media;
    }
    public float getMedia(){
        return this.media;
    }
    public int getMat(){
        return this.mat;
    }

    public static int getProximaMatricula(){
        return matAux;
    }

    public String toString(){
        String r;
        r = "\nNome :"+this.nome+"\nMatricula: "+this.mat+"\nMedia: "+this.media;
        return r;
    }
}
