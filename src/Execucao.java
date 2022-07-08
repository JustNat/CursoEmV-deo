public class Execucao {
    public static void main(String[] args) {
        Conta p1 = new Conta();
        p1.setNumero(1111);
        p1.setDono("Jubileu");
        p1.abrirConta("CC");
        p1.depositar(100);

        Conta p2 = new Conta();
        p2.setNumero(2222);
        p2.setDono("Creuza");
        p2.abrirConta("CP");
        p2.depositar(500);
        p2.sacar(1000);

        p1.estadoAtual();
        p2.estadoAtual();
    }
}
