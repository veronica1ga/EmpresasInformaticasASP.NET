package es.cifpcm.forvagosgonzalezv.web.bean;

import java.io.Serializable;
import java.util.Date;
import java.text.SimpleDateFormat;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;

import org.primefaces.PrimeFaces;
import org.primefaces.event.SelectEvent;

@Named(value = "hotelFechaBean")
@RequestScoped
public class HotelFechaBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public HotelFechaBean() {
		// TODO Auto-generated constructor stub
	}

	private Date dateEntrada;
	private Date dateSalida;

	@Inject
	MasterDataBean masterDataBean;

	@PostConstruct
	public void init() {

	}

	public Date getDateEntrada() {
		return dateEntrada;
	}

	public void setDateEntrada(Date dateEntrada) {
		this.dateEntrada = dateEntrada;
	}

	public Date getDateSalida() {
		return dateSalida;
	}

	public void setDateSalida(Date dateSalida) {
		this.dateSalida = dateSalida;
	}

	public void onDateSelect(SelectEvent event) {
		FacesContext facesContext = FacesContext.getCurrentInstance();
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		facesContext.addMessage(null,
				new FacesMessage(FacesMessage.SEVERITY_INFO, "Date Selected", format.format(event.getObject())));
	}

	public void click() {
		PrimeFaces.current().ajax().update("form:display");
		PrimeFaces.current().executeScript("PF('dlg').show()");
	}
}
