import java.util.Scanner;

    public class DemoMusica {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("\nQuant de musicas: ");
            int n = sc.nextInt();
            sc.nextLine();

            Musica[] m = new Musica[n];

            for (int i = 0; i < n; i++) {
                System.out.println("\nTitulo: ");
                String titulo = sc.nextLine();
                System.out.println("\nArtista: ");
                String artista = sc.nextLine();
                System.out.println("\nGenero: ");
                String genero = sc.nextLine();
                System.out.println("\nDuracao: ");
                float duracao = sc.nextFloat();
                sc.nextLine();
                m[i] = new Musica(titulo, artista, genero, duracao);
            }

            float soma = 0.0f;
            for (int i = 0; i < n; i++) {
                soma += m[i].getDuracao();
            }
            System.out.println("\nDuracao total: " + soma);

            float media = soma / n;
            System.out.println("\nMedia geral de duracao: " + media);

            Musica longa = m[0];
            for (int i = 1; i < n; i++) {
                if (m[i].getDuracao() > longa.getDuracao()) {
                    longa = m[i];
                }
            }
            System.out.println("\nMusica mais longa: " + longa);

            Musica curta = m[0];
            for (int i = 1; i < n; i++) {
                if (m[i].getDuracao() < curta.getDuracao()) {
                    curta = m[i];
                }
            }
            System.out.println("\nMusica mais curta: " + curta);

            int contRock = 0;
            for (int i = 0; i < n; i++) {
                if (m[i].getGenero().equals("Rock")) {
                    contRock++;
                }
            }
            System.out.println("\nQuant de Rock: " + contRock);

            int contLegiao = 0;
            for (int i = 0; i < n; i++) {
                if (m[i].getArtista().equals("Legião Urbana")) {
                    contLegiao++;
                }
            }
            System.out.println("\nQuant de musicas da Legiao: " + contLegiao);

            int contLongas = 0;
            for (int i = 0; i < n; i++) {
                if (m[i].getDuracao() > 4.0f) {
                    contLongas++;
                }
            }
            System.out.println("\nMusicas com mais de 4 min: " + contLongas);

            System.out.println("\nPrimeira musica: " + m[0].getTitulo());
            System.out.println("Ultima musica: " + m[n - 1].getTitulo());

            Musica aux;
            for (int i = 0; i < n - 1; i++) {
                for (int j = i + 1; j < n; j++) {
                    if (m[i].getDuracao() < m[j].getDuracao()) {
                        aux = m[i];
                        m[i] = m[j];
                        m[j] = aux;
                    }
                }
            }
            System.out.println("\nORDEM DECRESCENTE DE DURACAO");
            for (int i = 0; i < n; i++) {
                System.out.println(m[i]);
            }

            for (int i = 0; i < n - 1; i++) {
                for (int j = i + 1; j < n; j++) {
                    if (m[i].getTitulo().compareTo(m[j].getTitulo()) > 0) {
                        aux = m[i];
                        m[i] = m[j];
                        m[j] = aux;
                    }
                }
            }
            System.out.println("\nORDEM ALFABETICA DE TITULO");
            for (int i = 0; i < n; i++) {
                System.out.println(m[i]);
            }

            System.out.println("\nProximo codigo id: " + Musica.getProximoCodigo());
            sc.close();
        }
    }