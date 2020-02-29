package es.cifpcm.forvagosgonzalezv.web.data;

import java.util.List;

import es.cifpcm.forvagosgonzalezv.web.model.Hoteloffer;

public interface HotelDao {
	public Hoteloffer insert(Hoteloffer hoteloffer);
	public List<Hoteloffer> selectAll();
}
