/**
 * 
 */
package es.cifpcm.forvagosgonzalezv.web.bean;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import es.cifpcm.forvagosgonzalezv.web.model.Hoteloffer;

/**
 * @author vero_
 *
 */
public class SearchManager {
	public List<Hoteloffer> getOffers(List<Hoteloffer> hotels) {
		List<Hoteloffer> offers = new ArrayList<>();
		offers.add(new Hoteloffer("Club Tarahal", new BigDecimal(70), "tarahal.jpg", 1));
		offers.add(new Hoteloffer("Hotel Botanico y Oriental Spa Garden", new BigDecimal(70), "botanico.jpg",1));
		offers.add(new Hoteloffer("Bahía Príncipe San Felipe", new BigDecimal(70), "bahia_principe.jpg",2));
		offers.add(new Hoteloffer("Apartamentos Masaru", new BigDecimal(70), "masaru.jpg",3));
		offers.add(new Hoteloffer("H10 Tenerife Playa", new BigDecimal(70), "h10_tenerife_playa.jpg",3));
		offers.add(new Hoteloffer("Hotel Vallemar", new BigDecimal(70), "vallemar.jpg",3));
		offers.add(new Hoteloffer("Catalonia Las Vegas", new BigDecimal(70), "catalonia_las_vegas.jpg",3));
		return offers;
	}
	
	public List<Hoteloffer> getHotels(HotelSearchInput searchInput){
		return null;
	}
}
