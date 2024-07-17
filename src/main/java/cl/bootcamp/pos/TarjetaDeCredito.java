package cl.bootcamp.pos;

public class TarjetaDeCredito {
    
    String red="\033[31m"; 
    String reset="\u001B[0m";
    
    private String entidadBancaria;
    private String numeroTarjeta;
    private double saldo;
    private EntidadFinanciera entidadFinanciera;
    private Persona titular;
    
    public TarjetaDeCredito() {};
    
    public TarjetaDeCredito(
            String entidadBancaria,
            String numeroTarjeta,
            double saldo,
            EntidadFinanciera entidadFinanciera,
            Persona titular
    ) {
        this.entidadBancaria = entidadBancaria;
        this.numeroTarjeta = numeroTarjeta;
        this.saldo = saldo;
        this.entidadFinanciera = entidadFinanciera;
        this.titular = titular;
    };

    public String getEntidadBancaria() {
        return entidadBancaria;
    }

    public void setEntidadBancaria(String entidadBancaria) {
        this.entidadBancaria = entidadBancaria;
    }

    public String getNumeroTarjeta() {
        return numeroTarjeta;
    }

    public void setNumeroTarjeta(String numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public EntidadFinanciera getEntidadFinanciera() {
        return entidadFinanciera;
    }

    public void setEntidadFinanciera(EntidadFinanciera entidadFinanciera) {
        this.entidadFinanciera = entidadFinanciera;
    }

    public Persona getTitular() {
        return titular;
    }

    public void setTitular(Persona titular) {
        this.titular = titular;
    }
    
    public boolean tieneSaldoDisponible(double monto) {
        return getSaldo() >= monto;
    }
    
    public void descontar(double monto) {
        this.saldo -= monto;
    }
    
    public String nombreTitular() {
        return titular.nombreCompleto();
    }

    @Override
    public String toString() {
        return "TarjetaDeCredito{" 
                + "entidadBancaria=" + entidadBancaria 
                + ", numeroTarjeta=" + numeroTarjeta +
                red + ", saldo=" + saldo +
                reset + ", entidadFinanciera=" + entidadFinanciera
                + ", titular=" + titular
                + '}';
    }
    
}
