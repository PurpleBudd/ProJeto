
package Projeto;


public class Principal {


    public static void main(String[] args) {
        Banco b = new Banco();
        Funcionario f = new Funcionario();
        Cliente c = new Cliente();
        
        b.setCliente(c);
        b.setFuncionario(f);
        c.setBanco(b);
        f.setBanco(b);
        
        System.out.println("Nome: "+b.getNome());
        System.out.println("Funcionario: "+b.getFuncionario());
        System.out.println("Cliente: "+b.getCliente());
        System.out.println("CodBanco: "+b.getCodBanco());
        
        System.out.println("Nome "+f.getNome());
        System.out.println("Cpf "+f.getCPF());
        System.out.println("Setor "+f.getSetor());
        System.out.println("Banco: "+f.getBanco());
        System.out.println("CodFuncionario: "+f.getCodFuncionario());
        System.out.println("Idade Funcionario: "+f.getIdade());
        
        System.out.println("Nome: "+c.getNome());
        System.out.println("CPF: "+c.getCPF());
        System.out.println("Banco: "+c.getBanco());
        System.out.println("CodCliente: "+c.getCodCliente());
        System.out.println("Idade Cliente: "+c.getIdade());      
     
    }
    
}
