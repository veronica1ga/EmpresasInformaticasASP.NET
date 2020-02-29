package es.cifpcm.forvagosgonzalezv.web.bean;

import java.io.Serializable;
import java.text.NumberFormat;

import javax.inject.Named;

@Named(value = "shoppingCartBean")
public class ShoppingCartBean extends ShoppingCart implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ShoppingCartBean() {
	}

	public String getTotalAsString() {
		return NumberFormat.getCurrencyInstance().format(getTotalAsString());
	}

}
