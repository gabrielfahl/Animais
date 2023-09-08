public class Main {
    public static void main(String[] args) {
        // Criando objetos de cada tipo
        Pet[] pets = new Pet[4];
        pets[0] = new Cao();
        pets[1] = new Gato();
        pets[2] = new Caotron();
        pets[3] = new Mechanigato();

        // Chamando o método brincar de cada objeto
        for (Pet pet : pets) {
            pet.brincar();
        }
    }
}