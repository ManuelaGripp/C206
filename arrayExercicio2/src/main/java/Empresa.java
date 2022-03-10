public class Empresa {

    String cnpj;
    String endereco;
    Contato[] contatos = new Contato[100];

    public Empresa(String cnpj, String endereco) {
        this.cnpj = cnpj;
        this.endereco = endereco;
    }

    void exibirInfos(){
        System.out.println("Empresa: " + cnpj);
        for (int i = 0; i < contatos.length; i++) {
            if(contatos[i] != null){

                System.out.println("Nome: " + contatos[i].nome);
                System.out.println("Email: " + contatos[i].email );
                System.out.println("Telefone: " + contatos[i].telefone);
                System.out.println("Data de Nascimento: " + contatos[i].dataNascimento);
            }

        }
    }



}
