package es.cifpcm.forvagosgonzalezv.web.data;

import java.util.List;

import es.cifpcm.forvagosgonzalezv.web.model.Municipio;

public interface MunicipiosDao {
	List<Municipio> selectAll();
	List<Municipio> cambioProvincia(Short id_provincia, List<Municipio> municipio);
}
