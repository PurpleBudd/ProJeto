
package Projeto;
public class Banco extends Cliente{
    private String Nome;
    private int CodBanco;
    private Funcionario Funcionario;
    private Cliente Cliente;

    
    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public int getCodBanco() {
        return CodBanco;
    }

    public void setCodBanco(int CodBanco) {
        this.CodBanco = CodBanco;
    }

    public Funcionario getFuncionario() {
        return Funcionario;
    }

    public void setFuncionario(Funcionario Funcionario) {
        this.Funcionario = Funcionario;
    }

    public Cliente getCliente() {
        return Cliente;
    }

    public void setCliente(Cliente Cliente) {
        this.Cliente = Cliente;
    }
}
