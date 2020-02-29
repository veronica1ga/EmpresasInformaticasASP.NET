package es.cifpcm.forvagosgonzalezv.web.bean;

import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import es.cifpcm.forvagosgonzalezv.web.data.HotelDao;
import es.cifpcm.forvagosgonzalezv.web.data.HotelDaoImpl;
import es.cifpcm.forvagosgonzalezv.web.model.Hoteloffer;

@Named(value = "hotelBean")
@RequestScoped
public class HotelBean extends Hoteloffer {
	public HotelBean() {
	}
	private static final long serialVersionUID = 1L;

	public List<Hoteloffer> getHotelList() {
		HotelDao listaHoteles = new HotelDaoImpl();
		List<Hoteloffer> hotel = new ArrayList<Hoteloffer>();
		try {
			hotel = listaHoteles.selectAll();
		} catch (Exception e) {
			// logger.error("ERROR: {}",e.getMessage());
		}
		return hotel;

	}

}
