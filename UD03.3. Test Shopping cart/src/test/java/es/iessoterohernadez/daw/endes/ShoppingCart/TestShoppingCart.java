package es.iessoterohernadez.daw.endes.ShoppingCart;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestShoppingCart {

	private ShoppingCart sp;
	private Product prod, prod2;
	
	@BeforeEach
	public void init() {
		sp = new ShoppingCart(); 
		prod = new Product("Frutos secos", 10);
		prod2 = new Product("Pipas", 1.50);
	}
	
	@Test
	public void testIfEmptyWhenCreatedTrue() {
		assertTrue(sp.getItemCount() == 0);
	}
	
	@Test
	public void testIfEmptyWhenCreatedFalse() {
		assertFalse(sp.getItemCount() > 0);
	}
	
	@Test
	public void testEmptyTrue() {
		sp.addItem(prod);
		sp.empty();
		assertTrue(sp.getItemCount() == 0);
	}
	
	@Test
	public void testEmptyFalse() {
		sp.addItem(prod);
		sp.empty();
		assertFalse(sp.getItemCount() == 1);
	}
	
	@Test
	public void testItemCountIncreaseTrue() {
		sp.addItem(prod);
		sp.addItem(prod);
		assertTrue(sp.getItemCount() == 2);
	}
	
	@Test
	public void testItemCountIncreaseFalse() {
		sp.addItem(prod);
		sp.addItem(prod2);
		assertFalse(sp.getItemCount() < 2);
	}
	
	@Test
	public void testBalance() {
		sp.addItem(prod);
		sp.addItem(prod2);
		assertTrue(sp.getBalance() == 11.5);
	}
	
	@Test
	public void testBalanceFalse() {
		sp.addItem(prod);
		sp.addItem(prod2);
		assertFalse(sp.getBalance() > 11.5 || sp.getBalance() < 11.5);
	}
	
	@Test
	public void testItemCountDecreaseTrue() throws ProductNotFoundException {
		sp.addItem(prod);
		sp.addItem(prod2);
		sp.removeItem(prod2);
		assertTrue(sp.getItemCount() == 1);
	}
	
	@Test
	public void testItemCountDecreaseFalse() throws ProductNotFoundException {
		sp.addItem(prod);
		sp.addItem(prod2);
		sp.removeItem(prod2);
		assertFalse(sp.getItemCount() > 1);
	}
	
	@Test
	public void testItemNotInCart() {
		sp.addItem(prod);
		try {
			sp.removeItem(prod2);
			fail();
		} catch (ProductNotFoundException e) {
			e.printStackTrace();
		}
	}
}
