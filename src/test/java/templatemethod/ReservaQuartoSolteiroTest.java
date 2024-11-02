package templatemethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ReservaQuartoSolteiroTest {

    @Test
    void deveRetornarCalculoPrecoReserva() {
        ReservaQuartoSolteiro quarto = new ReservaQuartoSolteiro();
        quarto.setQuantDias(3);
        assertEquals(240, quarto.calculaPrecoReserva());
    }

    @Test
    void deveRetornarInformacoes(){
        ReservaQuartoSolteiro quarto = new ReservaQuartoSolteiro();
        quarto.setQuantDias(3);
        quarto.setDataCheckIn("29/04/2023");
        quarto.calculaPrecoReserva();
        assertEquals("Quarto Solteiro{data de Check-in= 29/04/2023, quantidade de dias reservados= 3', preço da reserva= 240.0}", quarto.emitirRelatorioReserva());
    }

}