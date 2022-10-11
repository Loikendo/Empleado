package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import empleado.Empleado;
import empleado.Empleado.*;

class EmpleadoTest {
//Hacer los test de todos los posibles casos
	
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}
	

	@Test
	void testCalculoNominaBrutaTipoVendedor() {
		
		double esperado = 2000;
		float nomina = Empleado.CalculoNominaBruta(tipoEmpleado.Vendedor, 0, 0);
		assertEquals(esperado, (double)nomina);		
	}
	
	@Test
	void testCalculoNominaBrutaTipoEncargado() {
		double esperado = 2500;
		float nomina = Empleado.CalculoNominaBruta(tipoEmpleado.Encargado, 0, 0);
		assertEquals(esperado, (double)nomina);
	}
	
	@Test
	void testCalculoNominaBrutaVentasSinPrima(){
		double esperado = 2000;
		float nomina = Empleado.CalculoNominaBruta(tipoEmpleado.Vendedor, 900, 0);
		assertEquals(esperado, (double)nomina);
	}
	
	@Test
	void testCalculoNominaBrutaVentasPrimaCien() {
		double esperado = 2100;
		float nomina = Empleado.CalculoNominaBruta(tipoEmpleado.Vendedor, 1000, 0);
		assertEquals(esperado, (double)nomina);
	}
	
	@Test
	void testCalculoNominaBrutaTipoVentasPrimaDoscientos() {
		double esperado = 2200;
		float nomina = Empleado.CalculoNominaBruta(tipoEmpleado.Vendedor, 1500, 0);
		
		assertEquals(esperado, (double)nomina);
	}
	
	@Test
	void testCalculoNominaBrutaSinHE() {
		double esperado = 2000;
		float nomina = Empleado.CalculoNominaBruta(tipoEmpleado.Vendedor, 0, 0);
		
		assertEquals(esperado, (double)nomina);
	}
	
	@Test
	void testCalculoNominaBrutaConHE() {
		double esperado = 2600;
		float nomina = Empleado.CalculoNominaBruta(tipoEmpleado.Vendedor, 0, 20);
		
		assertEquals(esperado, (double)nomina);
	}
	
	@Test
	void testCalculoNominaNetaSinRestriccion() {
		double esperado = 2100;
		float nomina = Empleado.calculoNominaNeta(2100);
		
		assertEquals(esperado, (double)nomina);
	}
	
	@Test
	void testCalculoNominaNetaRestriccionQuince() {
		double esperado = 2125;
		float nomina = Empleado.calculoNominaNeta(2500);
		
		assertEquals(esperado, (double)nomina);
	}

	@Test
	void testCalculoNominaNetaRestriccionDieciocho() {
		double esperado = 2460;
		float nomina = Empleado.calculoNominaNeta(3000);
		
		assertEquals(esperado, (double)nomina);
	}

}
