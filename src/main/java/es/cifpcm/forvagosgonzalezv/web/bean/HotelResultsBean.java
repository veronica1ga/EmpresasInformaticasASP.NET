package es.cifpcm.forvagosgonzalezv.web.bean;

import java.io.Serializable;
import java.util.List;

import javax.inject.Named;

import es.cifpcm.forvagosgonzalezv.web.model.Hoteloffer;

@Named(value = "hotelResultsBean")
public class HotelResultsBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Hoteloffer selectedOffer;

	public HotelResultsBean() {
	}

	public List<Hoteloffer> getOffers() {
		return new SearchManager().getOffers(null);
	}

	/**
	 * @return the selectedOffer
	 */
	public Hoteloffer getSelectedOffer() {
		return selectedOffer;
	}

	/**
	 * @param selectedOffer the selectedOffer to set
	 */
	public void setSelectedOffer(Hoteloffer selectedOffer) {
		this.selectedOffer = selectedOffer;
	}

}
