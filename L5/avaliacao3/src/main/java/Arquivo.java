import java.io.*;
import java.util.ArrayList;
import java.lang.String;

    public class Arquivo {

        public void escrever( Jogo jogo ){

            OutputStream os = null; //converte String para bin[ea
            OutputStreamWriter osw = null;
            BufferedWriter bw = null;
            String linhaEscrever;

            try{

                os = new FileOutputStream("Arquivo.txt", true);
                osw = new OutputStreamWriter(os);
                bw = new BufferedWriter(osw);

                bw.write("Jogo");
                bw.newLine();
                bw.write(jogo.getNome() + "\n");
                bw.write(jogo.getPreco()+ "\n");
                bw.write(jogo.getGenero() + "\n");

            }catch(Exception e){

                System.out.println(e);

            }finally {

                try {
                    bw.close();
                }catch (Exception e){
                    System.out.println(e);
                }

            }

        }

        public ArrayList<Jogo> ler(){

            ArrayList<Jogo> jogos  = new ArrayList<Jogo>();

            InputStream is = null;
            InputStreamReader isr = null;
            BufferedReader br = null;
            String linhaLer;

            try{

                is = new FileInputStream("Arquivo.txt");
                isr = new InputStreamReader(is);
                br = new BufferedReader(isr);

                linhaLer = br.readLine();
                while(linhaLer != null){
                    if(linhaLer.contains("Jogo")){
                        Jogo j = new Jogo();
                        j.setNome(br.readLine());
                        j.setPreco(Double.parseDouble(br.readLine()));
                        j.setGenero(br.readLine());
                        jogos.add(j);
                    }
                    linhaLer = br.readLine();
                }

            }catch (Exception e){
                System.out.println(e);
            }finally {
                try{
                    br.close();
                }catch (Exception e){
                    System.out.println(e);
                }
            }


            return jogos;
        }

    }