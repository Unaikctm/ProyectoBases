package clases;

public class Jarraitu {

	private int irakasle_id;
	private int proiektu_id;
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
	public Jarraitu(int irakasle_id, int proiektu_id) {
		super();
		this.irakasle_id = irakasle_id;
		this.proiektu_id = proiektu_id;
	}
	@Override
	public String toString() {
		return "Jarraitu [irakasle_id=" + irakasle_id + ", proiektu_id=" + proiektu_id + "]";
	}
	
}
