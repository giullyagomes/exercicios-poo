public abstract class Trabalhador {
    private String nome;
    private double salarioBase;

    public Trabalhador(String nome, double salarioBase) throws Exception{
        if (nome != null && !nome.isEmpty()){
            throw new Exception("Esse campo não pode ser nulo.");
        }
        if (salarioBase > 0) {
            throw new Exception("O salário não pode ser nulo");
        }
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalarioBase() {
        return salarioBase;
    }
    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public abstract void calcularSalarioMensal(); 


}