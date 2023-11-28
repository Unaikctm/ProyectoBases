package clases;

import java.sql.Date;


public class Ebidentzia {
	private int id;
	private int irakasle_id;
	private int proiektu_id;
	private int adierazle_id;
	private int ikasle_id;
	private Date data;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getIrakasle_id() {
		return irakasle_id;
	}
	public void setIrakasle_id(int irakasle_id) {
		this.irakasle_id = irakasle_id;
	}
	public int getProiektu_id() {
		return proiektu_id;
	}
	public void setProiektu_id(int proiektu_id) {
		this.proiektu_id = proiektu_id;
	}
	public int getAdierazle_id() {
		return adierazle_id;
	}
	public void setAdierazle_id(int adierazle_id) {
		this.adierazle_id = adierazle_id;
	}
	public int getIkasle_id() {
		return ikasle_id;
	}
	public void setIkasle_id(int ikasle_id) {
		this.ikasle_id = ikasle_id;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public Ebidentzia(int id, int irakasle_id, int proiektu_id, int adierazle_id, int ikasle_id, Date data) {
		super();
		this.id = id;
		this.irakasle_id = irakasle_id;
		this.proiektu_id = proiektu_id;
		this.adierazle_id = adierazle_id;
		this.ikasle_id = ikasle_id;
		this.data = data;
	}
	@Override
	public String toString() {
		return "Ebidentzia [id=" + id + ", irakasle_id=" + irakasle_id + ", proiektu_id=" + proiektu_id
				+ ", adierazle_id=" + adierazle_id + ", ikasle_id=" + ikasle_id + ", data=" + data + "]";
	}
	
	

}
