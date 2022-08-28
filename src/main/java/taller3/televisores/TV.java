package taller3.televisores;

public class TV {
	private Marca marca;
	private int canal = 1;
	 private int precio = 500;
	private boolean estado;
	private int volumen = 1;
	private Control control;
	static int numTV;
	
	public TV(Marca marca, boolean estado){
		this.marca = marca;
		this.estado = estado;
	}
	
	public Marca getMarca() {
		return this.marca;
	}
	public Control getControl() {
		return this.control;
	}
	public int getPrecio() {
		return this.precio;
	}
	public int getVolumen() {
		return this.volumen;
	}
	public int getCanal() {
		return this.canal;
	}
	
	public void setMarca(Marca marca) {
		this.marca = marca;
	}
	public void setControl(Control control) {
		this.control = control;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	public void setVolumen(int volumen) {
		this.volumen = volumen;
	}
	public void setCanal(int canal) {
		this.canal = canal;
	}
	
	public void turnOn() {
		this.estado = true;
	}
	public void turnOff() {
		this.estado = false;
	}
	
	public boolean getEstado() {
		return this.estado;
	}
	
	public void canalUp() {
		if( this.estado==true && this.canal<120) {
			this.canal++;
		}
	}
	public void canalDown() {
		if( this.estado==true && this.canal>1) {
			this.canal--;
		}
	}
	public void volumenUp() {
		if( this.estado==true && this.volumen<7) {
			this.canal++;
		}
	}
	public void volumenDown() {
		if( this.estado==true && this.volumen>0) {
			this.canal--;
		}
	}
	
	public static void setNumTV(int eVal) {
		numTV = eVal;
	}
	public static int getNumTV() {
		return numTV;
	}
}
