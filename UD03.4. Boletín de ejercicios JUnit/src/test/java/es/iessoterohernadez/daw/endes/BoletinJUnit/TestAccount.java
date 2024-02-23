package es.iessoterohernadez.daw.endes.BoletinJUnit;

import static org.junit.jupiter.api.Assertions.*;

import java.text.NumberFormat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class TestAccount {
	
	private Account a;
	private NumberFormat fmt = NumberFormat.getCurrencyInstance(); //Lo añado para que en testToString el balance tenga el formato deseado
	
	@BeforeEach
	private void init() {
		a = new Account("Owner", 111111, 12000);
	}
	
	
	@Test
	public void testDeposit() {
		a.deposit(2000);
		assertEquals(14000, a.getBalance());
	}
	
	@Test
	public void testDepositNegative() {
		a.deposit(-2000);
		assertEquals(12000, a.getBalance());
	}
	
	@Test
	public void testWithdraw() {
		a.withdraw(1000, 100);
		assertEquals(10900, a.getBalance());
	}
	
	@Test
	public void testInvalidWithdrawlAmount() {
		a.withdraw(-2000, 100);
		assertEquals(12000, a.getBalance());
	}
	
	@Test
	public void testInvalidWithdrawlFee() {
		a.withdraw(2000, -100);
		assertEquals(12000, a.getBalance());
	}
	
	@Test
	public void testInvalidWithdrawlBalance() {
		a.withdraw(20000, 100);
		assertEquals(12000, a.getBalance());
	}
	
	@Test
	public void testInterest() {
		a.addInterest();
		assertEquals(12540, a.getBalance());
	}
	
	@Test
	public void testTostring() {
		//He creado el método getNombre para que en testToString pueda aparecer el nombre
		String expected = a.getAccountNumber()+"\t" +a.getNombre()+"\t" + fmt.format(a.getBalance());
		assertEquals(expected, a.toString());
	}
}
