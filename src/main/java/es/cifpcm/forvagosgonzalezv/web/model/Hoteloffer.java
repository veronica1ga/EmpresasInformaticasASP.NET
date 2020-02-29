/**
 * 
 */
package es.cifpcm.forvagosgonzalezv.web.model;

import java.math.BigDecimal;

/**
 * @author vero_
 *
 */
public class Hoteloffer {
	private int hotelId;

	private String hotelPicture;
	private String name;
	private int idMunicipio;
	private BigDecimal price;

	public Hoteloffer(String name, BigDecimal price, String hotelPicture, int idMunicipio) {
		// TODO Auto-generated constructor stub
		super();
		this.name = name;
		this.price = price;
		this.hotelPicture = hotelPicture;
		this.idMunicipio=idMunicipio;

	}

	public Hoteloffer() {
		// TODO Auto-generated constructor stub
	}

	public int getHotelId() {
		return hotelId;
	}

	public void setHotelId(int hotelId) {
		this.hotelId = hotelId;
	}

	public String getHotelPicture() {
		return hotelPicture;
	}

	public void setHotelPicture(String hotelPicture) {
		this.hotelPicture = hotelPicture;
	}

	public int getIdMunicipio() {
		return idMunicipio;
	}

	public void setIdMunicipio(int idMunicipio) {
		this.idMunicipio = idMunicipio;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}
}
