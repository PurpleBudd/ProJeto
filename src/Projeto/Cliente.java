
package Projeto;
public class Cliente extends Pessoa{
    private int CodCliente;
    private Double Credito;
    private Banco Banco;

    public int getCodCliente() {
        return CodCliente;
    }

    public void setCodCliente(int CodCliente) {
        this.CodCliente = CodCliente;
    }

    public Double getCredito() {
        return Credito;
    }

    public void setCredito(Double Credito) {
        this.Credito = Credito;
    }

    public Banco getBanco() {
        return Banco;
    }

    public void setBanco(Banco Banco) {
        this.Banco = Banco;
    }

}
