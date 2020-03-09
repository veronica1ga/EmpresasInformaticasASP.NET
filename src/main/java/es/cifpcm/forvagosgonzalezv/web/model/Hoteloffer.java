/**
 * 
 */
package es.cifpcm.forvagosgonzalezv.web.model;

import java.math.BigDecimal;

/**
 * @author Veronica Gonzalez
 *
 */
public class Hoteloffer {
	private int hotelId;

	private String hotelPicture;

	private int idMunicipio;

	private String name;

	private BigDecimal price;

	public Hoteloffer() {
	}

	public Hoteloffer(String name, BigDecimal price, String hotelPicture) {
		// TODO Auto-generated constructor stub
		super();
		this.name = name;
		this.price = price;
		this.hotelPicture = hotelPicture;

	}

	/**
	 * @return the hotelId
	 */
	public int getHotelId() {
		return hotelId;
	}

	/**
	 * @param hotelId the hotelId to set
	 */
	public void setHotelId(int hotelId) {
		this.hotelId = hotelId;
	}

	/**
	 * @return the hotelPicture
	 */
	public String getHotelPicture() {
		return hotelPicture;
	}

	/**
	 * @param hotelPicture the hotelPicture to set
	 */
	public void setHotelPicture(String hotelPicture) {
		this.hotelPicture = hotelPicture;
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

}
