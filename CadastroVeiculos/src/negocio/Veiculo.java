
package negocio;

public class Veiculo {

    private String nome;
    private String marca;
    private String ano;

    //Método Construtor. Botão direito --> "Insert Code" --> "Constructor"
    public Veiculo(String nome, String marca, String ano) {
        this.nome = nome;
        this.marca = marca;
        this.ano = ano;
    }
    //caso queira criar objeto, mas não iniciar com nenhum valor
    public Veiculo () {
        
    }
    //Botão direito --> "Insert Code" --> "Getter and Setter"
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }
    
    
    
    
    
}
