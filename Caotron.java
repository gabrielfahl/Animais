class Caotron extends Robo implements Pet {
    private String modelo;
    private String numeroSerie;

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setNumeroSerie(String numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    public String getNumeroSerie() {
        return numeroSerie;
    }

    public void brincar() {
        System.out.println("Caotron está brincando");
    }
}