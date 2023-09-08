abstract class Animal {
    
    public void comportamento() {
        System.out.println("Se comportando como um animal");
    }

    public abstract void setNome(String nome);
    public abstract String getNome();
    public abstract void setRaca(String raca);
    public abstract String getRaca();
}