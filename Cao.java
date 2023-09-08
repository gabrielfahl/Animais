class Cao extends Canino implements Pet {
    private String nome;
    private String raca;


    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getRaca() {
        return raca;
    }

    public void brincar() {
        System.out.println("Cao está brincando");
    }
}
