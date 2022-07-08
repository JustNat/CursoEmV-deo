public class Conta {
    public int numero;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    public Conta() {
        this.saldo = 0.00f;
        this.status = false;
    }

    public int getnumero() {
        return numero;
    }

    public void setNumero(int n) {
        this.numero = n;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        if (tipo != "CC" & tipo != "CP") {
            System.out.println("Tipo de conta inválido");
        } else this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void abrirConta(String t) {
        if (t.equals("CC")) {
            this.setSaldo(50.00f);
            this.setStatus(true);
            this.setTipo(t);
            System.out.println("Conta criada. Saldo atual :" + getSaldo());
        } else if (t.equals("CP")) {
            this.setSaldo(150.00f);
            this.setStatus(true);
            this.setTipo(t);
            System.out.println("Conta criada. Saldo atual :" + getSaldo());
        } else System.out.println("Tipo de conta inválido. Por favor selecione CP ou CC");
    }

    public void fecharConta() {
        if (this.getSaldo() > 0) {
            System.out.println("Por favor, saque seu dinheiro");
        } else if (this.getSaldo() < 0) {
            System.out.println("Por favor, pague sua dívida");
        } else this.setStatus(false);
    }

    public void depositar(float v) {
        if (this.getStatus() == false) {
            System.out.println("Abra sua conta primeiro");
        } else {
            this.setSaldo(this.getSaldo() + v);
            System.out.println("Dinheiro depositado com sucesso");
        }
    }

    public void sacar(float v) {
        if (v > this.getSaldo()) {
            System.out.println("Saldo insuficiente");
        } else {
            this.setSaldo(this.getSaldo() - v);
            System.out.println("Dinheiro sacado com sucesso");
        }
    }

    public void pagarMensal() {
        if (this.getTipo() == "CC") {
            this.setSaldo(this.getSaldo() - 12.00f);
        } else if (getTipo() == "CP") {
            this.setSaldo(this.getSaldo() - 20.00f);
        }
    }

    public void estadoAtual() {
        System.out.println(this.numero);
        System.out.println(this.dono);
        System.out.println(this.saldo);
        System.out.println(this.status);
        System.out.println("Tipo: " + this.tipo);
    }
}
