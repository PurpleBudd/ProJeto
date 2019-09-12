
package Projeto;
public class Funcionario extends Pessoa{
   private int CodFuncionario;
   private String Setor;
    private Banco Banco;
    
    public int getCodFuncionario() {
        return CodFuncionario;
    }

    public void setCodFuncionario(int CodFuncionario) {
        this.CodFuncionario = CodFuncionario;
    }

    public String getSetor() {
        return Setor;
    }

    public void setSetor(String Setor) {
        this.Setor = Setor;
    }

    public Banco getBanco() {
        return Banco;
    }

    public void setBanco(Banco Banco) {
        this.Banco = Banco;
    }
}
