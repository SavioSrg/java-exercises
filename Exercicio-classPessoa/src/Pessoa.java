public class Pessoa {
    String nome;
    int idade;
    boolean sexo;
    String hobbies;

    void apresentaPessoa(){
        System.out.println("Apresentação da ficha: ");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Sexo: " + sexo);
        System.out.println("Hobbies: " + hobbies);
    }

}
