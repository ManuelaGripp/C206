public class Main {

    public static void main(String[] args) {

        Banda banda1 = new Banda("Fundo de quintal","Samba");

        Membro membro1 = new Membro("Bira Presidente", "Vocalista/Pandeiro");
        Membro membro2 = new Membro("Ubirany", "Repique de mao");
        Membro membro3 = new Membro("Almir Guineto", "Banjo");

        Musica musica1 = new Musica("A amizade", 3);
        Musica musica2 = new Musica("O show tem que continuar", 3);
        Musica musica3 = new Musica("Vai la vai la", 3);
        Musica musica4 = new Musica("O batuque dos nossos tantans", 3);

        banda1.addMembro(membro1);
        banda1.addMembro(membro2);
        banda1.addMembro(membro3);

        banda1.addMusicaNova(musica1);
        banda1.addMusicaNova(musica2);
        banda1.addMusicaNova(musica3);
        banda1.addMusicaNova(musica4);

        banda1.mostraInfo();






    }
}
