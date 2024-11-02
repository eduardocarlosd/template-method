package templatemethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReservaQuartoCasalTest {

    @Test
    void deveRetornarCalculoPrecoReserva() {
        ReservaQuartoCasal quarto = new ReservaQuartoCasal();
        quarto.setQuantDias(5);
        assertEquals(600, quarto.calculaPrecoReserva());
    }

    @Test
    void deveRetornarInformacoes(){
        ReservaQuartoCasal quarto = new ReservaQuartoCasal();
        quarto.setQuantDias(5);
        quarto.setDataCheckIn("25/05/2023");
        quarto.calculaPrecoReserva();
        assertEquals("Quarto Casal{data de Check-in= 25/05/2023, quantidade de dias reservados= 5', preço da reserva= 600.0}", quarto.emitirRelatorioReserva());
    }

}