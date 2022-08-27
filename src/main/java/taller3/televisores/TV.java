package taller3.televisores;

public class TV {
	private Marca marca;
	private int canal = 1;
	 private int precio = 500;
	private boolean estado;
	private int volumen = 1;
	private Control control;
	static int numTV;
	
	TV(Marca marca, boolean estado){
		this.marca = marca;
		this.estado = estado;
	}
	
	Marca getMarca() {
		return this.marca;
	}
	Control getControl() {
		return this.control;
	}
	int getPrecio() {
		return this.precio;
	}
	int getVolumen() {
		return this.volumen;
	}
	int getCanal() {
		return this.canal;
	}
	
	void setMarca(Marca marca) {
		this.marca = marca;
	}
	void setControl(Control control) {
		this.control = control;
	}
	void setPrecio(int precio) {
		this.precio = precio;
	}
	void setVolumen(int volumen) {
		this.volumen = volumen;
	}
	void setCanal(int canal) {
		this.canal = canal;
	}
	
	void turnOn() {
		this.estado = true;
	}
	void turnOff() {
		this.estado = false;
	}
	
	boolean getEstado() {
		return this.estado;
	}
	
	void canalUp() {
		if( getEstado()==true && getCanal()<=120) {
			this.canal++;
		}
	}
	void canalDown() {
		if( getEstado()==true && getCanal()>=1) {
			this.canal--;
		}
	}
	void volumenUp() {
		if( getEstado()==true && getCanal()<=7) {
			this.canal++;
		}
	}
	void volumenDown() {
		if( getEstado()==true && getCanal()>=0) {
			this.canal--;
		}
	}
}
