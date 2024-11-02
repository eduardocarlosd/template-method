package templatemethod;

public class ReservaQuartoSolteiro extends Reserva{

    private double precoDiaria = 80;
    public double calculaPrecoReserva(){
        return precoDiaria * this.getQuantDias();
    }

    @Override
    public String getTipo() {
        return "Quarto Solteiro";
    }
}
