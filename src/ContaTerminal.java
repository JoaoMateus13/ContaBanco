public class ContaTerminal {

    private Integer Numero;
    private String Agencia;
    private String NomeCliente;
    private Double Saldo;

    public ContaTerminal(Integer numero, String agencia, String nomeCliente, Double saldo) {
        Numero = numero;
        Agencia = agencia;
        NomeCliente = nomeCliente;
        Saldo = saldo;
    }

    public Integer getNumero() {
        return Numero;
    }

    public void setNumero(Integer numero) {
        Numero = numero;
    }

    public String getAgencia() {
        return Agencia;
    }

    public void setAgencia(String agencia) {
        Agencia = agencia;
    }

    public String getNomeCliente() {
        return NomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        NomeCliente = nomeCliente;
    }

    public Double getSaldo() {
        return Saldo;
    }

    public void setSaldo(Double saldo) {
        Saldo = saldo;
    }

    @Override
    public String toString() {
        return "ContaTerminal{" +
                "Numero=" + Numero +
                ", Agencia='" + Agencia + '\'' +
                ", NomeCliente='" + NomeCliente + '\'' +
                ", Saldo=" + Saldo +
                '}';
    }
}
