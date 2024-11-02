package templatemethod;

public abstract class Reserva {

    private int quantDias;
    private String dataCheckIn;
    private String dataCheckOut;

    public int getQuantDias() {
        return quantDias;
    }

    public void setQuantDias(int quantDias) {
        this.quantDias = quantDias;
    }

    public String getDataCheckIn() {
        return dataCheckIn;
    }

    public void setDataCheckIn(String dataCheckIn) {
        this.dataCheckIn = dataCheckIn;
    }

    public String getDataCheckOut() {
        return dataCheckOut;
    }

    public void setDataCheckOut(String dataCheckOut) {
        this.dataCheckOut = dataCheckOut;
    }

    public abstract double calculaPrecoReserva();

    public String getTipo() {
        return "Quarto";
    }

    public String emitirRelatorioReserva(){
        return getTipo() + "{" + "data de Check-in= " + this.dataCheckIn
                + ", quantidade de dias reservados= " + this.quantDias + '\'' +
                ", preço da reserva= " + this.calculaPrecoReserva() + '}';
    }
}
