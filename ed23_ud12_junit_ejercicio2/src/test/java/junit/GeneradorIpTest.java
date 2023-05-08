package junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

class GeneradorIpTest {
	GeneradorIp gip;

	private GeneradorIp generadorIp;

	@BeforeEach
	void setUp() {
		generadorIp = new GeneradorIp();
	}

	@RepeatedTest(1000)
	public void testGenerarNumero() {
		int numero = generadorIp.generarNumero(0, 254);
		assertTrue(numero >= 0 && numero <= 254);
	}

	@RepeatedTest(1000)
	public void testGeneraIp() {
		String ip = generadorIp.generarIp();
		String[] partes = ip.split("\\.");
		assertFalse(partes[0].equals("0") || partes[3].equals("0"));
	}
}
