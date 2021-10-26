package TallerCalidad;

import org.junit.Test;
import static org.junit.Assert.*;

import org.junit.Before;

public class OperacionesTest {

    Operaciones operaciones;

    @Before
    public void setUp() {
        operaciones = new Operaciones();
    }

    @Test
    public void ReciboSieteYSieteYObtengoAprueba() {
        int notaBimestreUno = 7;
        int notaBimestreDos = 7;
        String resultado = operaciones.resumenCurso(notaBimestreUno, notaBimestreDos);
        assertEquals("Aprueba", resultado);
    }

    @Test
    public void ReciboCuatroYSeisYObtengoSupletorio() {
        int notaBimestreUno = 4;
        int notaBimestreDos = 6;
        String resultado = operaciones.resumenCurso(notaBimestreUno, notaBimestreDos);
        assertEquals("Supletorio", resultado);
    }

    @Test
    public void ReciboCincoYCuatroYObtengoReprueba() {
        int notaBimestreUno = 5;
        int notaBimestreDos = 4;
        String resultado = operaciones.resumenCurso(notaBimestreUno, notaBimestreDos);
        assertEquals("Reprueba", resultado);
    }
}
