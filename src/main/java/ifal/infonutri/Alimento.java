package ifal.infonutri;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class Alimento {

    @Id
    @GeneratedValue
    private Integer id;
    private String nome;
    private double porcao;
    private double valorEnergetico;
    private double carboidratos;
    private double gordurasTotais;
    private double gordurasSaturadas;
    private double gordurasTrans;
    private double fibraAlimentar;
    private double sodio;
    private double proteinas;

    public Alimento() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public double getProteinas() {
        return proteinas;
    }

    public void setProteinas(double proteinas) {
        this.proteinas = proteinas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPorcao() {
        return porcao;
    }

    public void setPorcao(double porcao) {
        this.porcao = porcao;
    }

    public double getValorEnergetico() {
        return valorEnergetico;
    }

    public void setValorEnergetico(double valorEnergetico) {
        this.valorEnergetico = valorEnergetico;
    }

    public double getCarboidratos() {
        return carboidratos;
    }

    public void setCarboidratos(double carboidratos) {
        this.carboidratos = carboidratos;
    }

    public double getGordurasTotais() {
        return gordurasTotais;
    }

    public void setGordurasTotais(double gordurasTotais) {
        this.gordurasTotais = gordurasTotais;
    }

    public double getGordurasSaturadas() {
        return gordurasSaturadas;
    }

    public void setGordurasSaturadas(double gordurasSaturadas) {
        this.gordurasSaturadas = gordurasSaturadas;
    }

    public double getGordurasTrans() {
        return gordurasTrans;
    }

    public void setGordurasTrans(double gordurasTrans) {
        this.gordurasTrans = gordurasTrans;
    }

    public double getFibraAlimentar() {
        return fibraAlimentar;
    }

    public void setFibraAlimentar(double fibraAlimentar) {
        this.fibraAlimentar = fibraAlimentar;
    }

    public double getSodio() {
        return sodio;
    }

    public void setSodio(double sodio) {
        this.sodio = sodio;
    }


}
