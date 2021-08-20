package Instituicao;

public class Principal {

    public static void main(String[] args) {

        Cachorro cachorro1 = new Cachorro("Putty", "viralata", 2018, 10, true, true);
        Cachorro cachorro2 = new Cachorro("Kiko","poodle", 2017, 3, false, false);
        Cachorro cachorro3 = new Cachorro("Samuca", "Rottweiler", 2015, 12, true, false);

        System.out.println("Informações do cachorro " + cachorro1.getNome());
        System.out.println("Idade: " + cachorro1.validarIdade(2021));
        System.out.println("Está apto para adoção: " + cachorro1.apto());
        System.out.println("Está com chip: " + cachorro1.verificarChip());

        System.out.println("\nInformações do cachorro " + cachorro2.getNome());
        System.out.println("Idade: " + cachorro2.validarIdade(2021));
        System.out.println("Está apto para adoção: " + cachorro2.apto());
        System.out.println("Está com chip: " + cachorro2.verificarChip());
        
        System.out.println("\nInformações do cachorro " + cachorro3.getNome());
        System.out.println("Idade: " + cachorro3.validarIdade(2021));
        System.out.println("Está apto para adoção: " + cachorro3.apto());
        System.out.println("Está com chip: " + cachorro3.verificarChip());

    }
}
