import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Object[] conta = {"Pessoa Fisica", "Pessoa Juridica"};
        Object[] itens = {"Sacar", "Depositar", "MostrarSaldo", "Encerrar"};
        Object selectedValue = "";
        Object tipoConta = "";
        pessoaFisica pessoaFisica = new pessoaFisica();
        pessoaJuridica pessoaJuridica = new pessoaJuridica();
        tipoConta = JOptionPane.showInputDialog(null,
                "Escolha o tipo da sua conta", "opção", JOptionPane.INFORMATION_MESSAGE, null, conta, conta[0]);
        JOptionPane.showMessageDialog(null, "Seja bem vindo ao banco!");

        if (tipoConta == "Pessoa Fisica") {
            JOptionPane.showMessageDialog(null,"A conta criada foi do tipo PF");
            while (selectedValue != "Encerrar") {
                selectedValue = JOptionPane.showInputDialog(null,
                        "Escolha o item", "opção", JOptionPane.INFORMATION_MESSAGE, null, itens, itens[0]);
                String sacar;
                double valor;
                if (selectedValue == "Sacar") {
                    sacar = JOptionPane.showInputDialog(null, "Digite o valor que deseja sacar");
                    valor = Double.parseDouble(sacar);
                    boolean verificaSeSacou = pessoaFisica.sacaSaldo(valor);
                    if (verificaSeSacou) {
                        JOptionPane.showMessageDialog(null, "Saque feito com sucesso");
                    } else {
                        JOptionPane.showMessageDialog(null, "Saque recusado");
                    }

                } else if (selectedValue == "Depositar") {
                    sacar = JOptionPane.showInputDialog(null, "Digite o valor que deseja depositar");
                    valor = Double.parseDouble(sacar);
                    pessoaFisica.setSaldo(valor);
                } else if (selectedValue == "MostrarSaldo") {
                    double valorConta = pessoaFisica.getSaldo();
                    JOptionPane.showMessageDialog(null, "O saldo da sua conta é :" + valorConta);
                } else {
                    JOptionPane.showMessageDialog(null, "Você encerrou!");
                    break;
                }
            }
            ;
        }
        else{
            JOptionPane.showMessageDialog(null,"A conta criada foi do tipo PJ");
            while (selectedValue != "Encerrar") {
                selectedValue = JOptionPane.showInputDialog(null,
                        "Escolha o item", "opção", JOptionPane.INFORMATION_MESSAGE, null, itens, itens[0]);
                String sacar;
                double valor;
                if (selectedValue == "Sacar") {
                    sacar = JOptionPane.showInputDialog(null, "Digite o valor que deseja sacar");
                    valor = Double.parseDouble(sacar);
                    boolean verificaSeSacou = pessoaJuridica.sacaSaldo(valor);
                    if (verificaSeSacou) {
                        JOptionPane.showMessageDialog(null, "Saque feito com sucesso");
                    } else {
                        JOptionPane.showMessageDialog(null, "Saque recusado");
                    }

                } else if (selectedValue == "Depositar") {
                    sacar = JOptionPane.showInputDialog(null, "Digite o valor que deseja depositar");
                    valor = Double.parseDouble(sacar);
                    pessoaJuridica.setSaldo(valor);
                } else if (selectedValue == "MostrarSaldo") {
                    double valorConta = pessoaJuridica.getSaldo();
                    JOptionPane.showMessageDialog(null, "O saldo da sua conta é :" + valorConta);
                } else {
                    JOptionPane.showMessageDialog(null, "Você encerrou!");
                    break;
                }
            }
            ;
        }
    }

}