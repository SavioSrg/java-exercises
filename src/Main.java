public class Main {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();

        p1.nome = "Sávio";
        p1.idade = 22;
        p1.sexo = true;
        p1.hobbies = "Música";

        System.out.println("----Método apresentar----");
        p1.apresentaPessoa();
    }
}