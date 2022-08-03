package br.com.banco;

public class ContaBanco {
    public int numConta;
    protected String tipoConta;
    private String dono;
    private float saldo;
    private boolean status;

    public ContaBanco(){
        saldo = 0;
        status = false;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
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

    public void abrirConta(String tipo){
        setTipoConta(tipo);
        setStatus(true);

        if (tipo.equals("CC")){
            setSaldo(50);
        }else if (tipo.equals("CP")){
            setSaldo(150);
        }
    }
    public void fecharConta(){
        if (saldo == 0.0) {
            setStatus(false);
        }
           else if (saldo < 0.0){
            System.out.println("Não é possivel fechar conta, pois possui pendencias");
        }
        else {
            System.out.println("Conta não pode ser fechada, pois possui saldo!");
        }
    }
    public void depositar(float valor){
        if (this.getStatus()) {
          //  saldo += valor;
            this.setSaldo(this.getSaldo() + valor);
        } else {
            System.out.println("Impossivel depositar em uma conta fechada!!");
        }
    }
    public void sacar(float valor){
     if (this.getStatus())
      if (this.getSaldo() >= valor)
        saldo -= valor;
      else {
          System.out.println("Saldo insufuciente!!");
      }
    }
    public void pagarMensal(float valorMensal){
       if (getTipoConta().equals("CC"))
        valorMensal = 12.0f;
       else if (getTipoConta().equals("CP")){
           valorMensal = 20.0f;
       }
       saldo -= valorMensal;
    }

    public void mostrarCliente(){
        System.out.println("------ CONTA DIGITAL ------");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo conta: " + this.getTipoConta());
        System.out.println("Dono conta: " + this.getDono());
        System.out.println("Saldo em conta: " + this.getSaldo());
    }
}
