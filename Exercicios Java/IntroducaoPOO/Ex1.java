package IntroducaoPOO;

public class Ex1
{
    //atributos
    String nome;
    int idade;
    String cpf;
    String rg;
    //metodos

    public Ex1()
    {
        this.nome="Henrique";
        this.idade=26;
        this.cpf="xxx.xxx.xxx.xx";
        this.rg="xx.xxx.xxx-x";
    }

        public void informarNome()
        {
            System.out.println("seu nome: "+nome);
        }

        public void informarIdade()
        {
            System.out.println("sua idade: "+idade);
        }

        public void informarCpf()
        {
            System.out.println("seu cpf: "+cpf);
        }

        public void informarRg()
        {
            System.out.println("seu rg: "+ rg);
        }

}