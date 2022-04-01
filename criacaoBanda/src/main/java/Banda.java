public class Banda {
    private String nome;
    private String genero;
    private Empresario empresario;
    private Membro[] membros = new Membro[6];
    private Musica[] musicas = new Musica[15];

    public Banda(String nome, String genero) {
        this.nome = nome;
        this.genero = genero;
    }

    void mostraInfo(){
        System.out.println(this.nome);
        if (empresario != null) {
            System.out.println("Nome do epresario: " + empresario.getNome() );
            System.out.println("CNPJ do epresario: " + empresario.getCnpj() );
        }
        else
            System.out.println("Nao possui empresario");

        //Mostrando os membros
        System.out.println(" ");
        System.out.println("Membros:");

        for (Membro membro:membros){
            if (membro != null) {
                System.out.println("Nome: " + membro.getNome());
                System.out.println("Funcao: " + membro.getFuncao());
            }
        }


        //Mostrando os musicas
        System.out.println(" ");
        System.out.println("Musicas:");

        for (Musica musica:musicas){
            if (musica != null) {
                System.out.println("Nome da musica: " + musica.getNome());
                System.out.println("Duracao da musica: " + musica.getDuracao());
            }
        }



    }

    void addMusicaNova(Musica m){
        for(int i = 0; i < musicas.length;i++){
            if(musicas[i] == null){
                musicas[i] = m;
                break;
            }
        }
    }

    void addMembro(Membro m){
        for (int i = 0; i < membros.length; i++){
            if(membros[i] == null){
                membros[i] = m;
                break;
            }
        }
    }


}
