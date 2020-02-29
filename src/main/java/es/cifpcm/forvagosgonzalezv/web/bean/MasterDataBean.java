package es.cifpcm.forvagosgonzalezv.web.bean;

import java.util.ArrayList;
import java.util.List;
import javax.inject.Named;
import javax.enterprise.context.ApplicationScoped;
import es.cifpcm.forvagosgonzalezv.web.data.*;
import es.cifpcm.forvagosgonzalezv.web.model.*;

/**
 * @author Veronica Gonzalez
 *
 */
@Named(value = "masterDataBean")
@ApplicationScoped
public class MasterDataBean {
	private static final long serialVersionUID = 1L;

	private final List<Provincia> provincias = new ArrayList<Provincia>();
	private final List<Municipio> municipios = new ArrayList<Municipio>();

	/**
	 * Creates a new instance of MasterDataBean
	 */

	public MasterDataBean() {
		ProvinciasDao provDao = DaoFactory.getInstance().getProvinciasDao();
		this.provincias.addAll(provDao.selectAll());

		MunicipiosDao munDao = DaoFactory.getInstance().getMunicipiosDao();
		this.municipios.addAll(munDao.selectAll());
	}

	public List<Provincia> getProvincias() {
		return provincias;
	}

	public List<Municipio> getMunicipios() {
		return municipios;
	}

}
