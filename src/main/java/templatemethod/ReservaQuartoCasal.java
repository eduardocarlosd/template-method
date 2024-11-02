package templatemethod;

public class ReservaQuartoCasal extends Reserva{

    private double precoDiaria = 120;
    public double calculaPrecoReserva(){
        return precoDiaria * this.getQuantDias();
    }

    @Override
    public String getTipo() {
        return "Quarto Casal";
    }
}
