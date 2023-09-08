class Gato extends Felino implements Pet {
    private String nome;
    private String raca;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public void setRaca(String raca) {
        this.raca = raca;
    }

    @Override
    public String getRaca() {
        return raca;
    }

    @Override
    public void brincar() {
        System.out.println("Gato está brincando");
    }
}
