/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.ac.polinema.midterm;

/**
 *
 * @author Firnanda(Rizka)
 */
public class DiscountItem extends Item{
	private float discount;

	public DiscountItem() {
	}
	
	//constructor String name, float price, int amount, float discount
	public DiscountItem(String name, float price, int amount, float discount ) {
		super(name, price, amount);
		this.discount = discount;
	}
	
	//menghitung total discount
	public float getTotalPrice(){
		return (price*amount)-(price*amount*discount);
	} 

	public float getDiscount() {
		return discount;
	}
	
	
}
