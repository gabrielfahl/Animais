public class Main {
    public static void main(String[] args) {

        Pet[] pets = new Pet[4];
        pets[0] = new Cao();
        pets[1] = new Gato();
        pets[2] = new Caotron();
        pets[3] = new Mechanigato();


        for (Pet pet : pets) {
            pet.brincar();
        }
    }
}