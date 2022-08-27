package taller3.televisores;

public class Control {
	private TV tv; 
	
	void turnOn() {
		tv.turnOn();
	}
	void turnOff() {
		tv.turnOff();
	}
	void canalUp() {
		tv.canalUp();
	}
	void canalDown() {
		tv.canalDown();
	}
	void volumenUp() {
		tv.volumenUp();
	}
	void volumenDown() {
		tv.volumenDown();
	}
	void enlazar(TV televisor) {
		this.tv = televisor;
		televisor.setControl(this);
	}
	void setCanal(int canal) {
		tv.setCanal(canal);
	}
	TV getTV() {
		return this.tv;
	}
	void setTV(TV tv) {
		this.tv = tv;
	}
}
