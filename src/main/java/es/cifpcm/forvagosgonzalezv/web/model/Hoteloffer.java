package es.cifpcm.forvagosgonzalezv.web.model;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.*;

/**
 * The persistent class for the hoteloffer database table.
 * 
 */
@Entity
@Table(name = "hoteloffer")
@NamedQuery(name = "Hoteloffer.findAll", query = "SELECT h FROM Hoteloffer h")
public class Hoteloffer implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "hotel_id")
	private int hotelId;

	@Column(name = "hotel_picture")
	private String hotelPicture;

	@Column(name = "id_municipio")
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

	public int getHotelId() {
		return this.hotelId;
	}

	public void setHotelId(int hotelId) {
		this.hotelId = hotelId;
	}

	public String getHotelPicture() {
		return this.hotelPicture;
	}

	public void setHotelPicture(String hotelPicture) {
		this.hotelPicture = hotelPicture;
	}

	public int getIdMunicipio() {
		return this.idMunicipio;
	}

	public void setIdMunicipio(int idMunicipio) {
		this.idMunicipio = idMunicipio;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getPrice() {
		return this.price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

}