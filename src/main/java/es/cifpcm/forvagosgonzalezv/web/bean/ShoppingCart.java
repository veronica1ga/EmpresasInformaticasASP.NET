package es.cifpcm.forvagosgonzalezv.web.bean;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import es.cifpcm.forvagosgonzalezv.web.model.Hoteloffer;

public class ShoppingCart implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final List<Hoteloffer> offers = new ArrayList<>();

	public ShoppingCart() {
	}

	public void addOffer(Hoteloffer offer) {
		this.offers.add(offer);
	}

	public void removeOffer(Hoteloffer offer) {
		this.offers.remove(offer);
	}

	public BigDecimal getTotal() {
		return this.offers.stream().map(o -> o.getPrice()).reduce(BigDecimal.ZERO, BigDecimal::add);
	}

}
