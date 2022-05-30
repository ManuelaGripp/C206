import FETIM.FETIM;

public class Main {


    public static void main(String[] args) {

        FETIM fetim = new FETIM();

        try {
            fetim.addProjeto("projeto1", 10);
        } catch (Exception e){
            System.out.println(e);
        } try {
            fetim.addProjeto("projeto2", 60);
        } catch (Exception e){
            System.out.println("Algo deu errado");
        } try {
            fetim.addProjeto("projeto3", 78);
        } catch (Exception e){
            System.out.println("Algo deu errado");
        } try {
            fetim.addProjeto("projeto4", 86);
        } catch (Exception e){
            System.out.println(e);
        }
        try {
            fetim.addProjeto("projeto4", 90);
        } catch (Exception e){
            System.out.println(e);
        }

    }

}
