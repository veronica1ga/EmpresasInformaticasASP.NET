/**
 * 
 */
package es.cifpcm.forvagosgonzalezv.web.bean;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import javax.validation.constraints.Size;

import es.cifpcm.forvagosgonzalezv.web.data.HotelDao;
import es.cifpcm.forvagosgonzalezv.web.data.HotelDaoImpl;
import es.cifpcm.forvagosgonzalezv.web.model.Hoteloffer;

/**
 * @author Veronica Gonzalez
 *
 */
@Named(value = "hotelBean")
@SessionScoped
public class HotelBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String name;
	private BigDecimal price;
	private int idMunicipio;
	private Integer hotelId;
	/**
	 * 
	 */
	public HotelBean() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}



	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}



	/**
	 * @return the price
	 */
	public BigDecimal getPrice() {
		return price;
	}



	/**
	 * @param price the price to set
	 */
	public void setPrice(BigDecimal price) {
		this.price = price;
	}



	/**
	 * @return the idMunicipio
	 */
	public int getIdMunicipio() {
		return idMunicipio;
	}



	/**
	 * @param idMunicipio the idMunicipio to set
	 */
	public void setIdMunicipio(int idMunicipio) {
		this.idMunicipio = idMunicipio;
	}



	/**
	 * @return the hotelId
	 */
	public Integer getHotelId() {
		return hotelId;
	}



	/**
	 * @param hotelId the hotelId to set
	 */
	public void setHotelId(Integer hotelId) {
		this.hotelId = hotelId;
	}



	public List<Hoteloffer> getHotelList() {
    	HotelDao listaHotel = new HotelDaoImpl();
        List<Hoteloffer> HotelList=new ArrayList<Hoteloffer>();
        try{
        	HotelList=listaHotel.selectAll();
        }
        catch(Exception e){
            //logger.error("ERROR: {}",e.getMessage());
        }
        return HotelList;

    }
	
	
	
	public String save() {
    	HotelDao hotelDevuelto = new HotelDaoImpl();
        Hoteloffer datos = new Hoteloffer();
		datos.setName(name);
        datos.setPrice(price);
        datos.setIdMunicipio(idMunicipio);
        try {
            datos = hotelDevuelto.insert(datos);
            this.name = datos.getName();
            this.price = datos.getPrice();
            this.idMunicipio=datos.getIdMunicipio();
            this.hotelId=datos.getHotelId();
            return "read";
        } catch (Exception e) {
            //logger.error("ERROR: {}", e.getMessage());
        	return "../error";
        }
    }

}
