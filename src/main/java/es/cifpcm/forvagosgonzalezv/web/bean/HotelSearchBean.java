package es.cifpcm.forvagosgonzalezv.web.bean;

import java.io.Serializable;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;

import org.primefaces.event.SelectEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import es.cifpcm.forvagosgonzalezv.web.data.DaoFactory;
import es.cifpcm.forvagosgonzalezv.web.data.MunicipiosDao;
import es.cifpcm.forvagosgonzalezv.web.model.Municipio;
import es.cifpcm.forvagosgonzalezv.web.model.Provincia;

/**
 * @author Veronica Gonzalez
 *
 */
@Named(value = "hotelSearchBean")
@RequestScoped
public class HotelSearchBean extends HotelFechaBean {
	private static final long serialVersionUID = 1L;
	private final Logger logger = LoggerFactory.getLogger(HotelSearchBean.class);

	private Short id_provincia;
	private Short id_municipio;

	private List<Municipio> municipio;
	private List<Provincia> provincia;
	
	
	
	@Inject
	MasterDataBean masterDataBean;

	@PostConstruct
	public void init() {
		this.municipio = masterDataBean.getMunicipios();
		this.provincia = masterDataBean.getProvincias();

		
		
		
	}

	/**
	 * Creates a new instance of HotelSearchBean
	 */
	public HotelSearchBean() {

	}

	public Short getId_provincia() {
		return id_provincia;
	}

	public void setId_provincia(Short id_provincia) {
		this.id_provincia = id_provincia;
	}

	public Short getId_municipio() {
		return id_municipio;
	}

	public void setId_municipio(Short id_municipio) {
		this.id_municipio = id_municipio;
	}

	public List<Municipio> getMunicipio() {
		return municipio;
	}

	public void setMunicipio(List<Municipio> municipio) {
		this.municipio = municipio;
	}

	public List<Provincia> getProvincia() {
		return provincia;
	}

	public void setProvincia(List<Provincia> provincia) {
		this.provincia = provincia;
	}
	

	public void onCboProvinciasChange() {
		List<Municipio> municipioFiltro= DaoFactory.getInstance().getMunicipiosDao().cambioProvincia(id_provincia, municipio);
		this.municipio= municipioFiltro;
	}
	
	public String municipiobuscado() {
		MunicipiosDao hotel = DaoFactory.getInstance().getMunicipiosDao();
		if(hotel!=null) {
			return "searchResults";
		}
		else {
			return null;
		}
		
		
	}
}
