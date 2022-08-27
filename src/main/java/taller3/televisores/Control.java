package taller3.televisores;

public class Control {
	private TV tv; 
	
	public void turnOn() {
		tv.turnOn();
	}
	public void turnOff() {
		tv.turnOff();
	}
	public void canalUp() {
		tv.canalUp();
	}
	public void canalDown() {
		tv.canalDown();
	}
	public void volumenUp() {
		tv.volumenUp();
	}
	public void volumenDown() {
		tv.volumenDown();
	}
	public void enlazar(TV televisor) {
		this.tv = televisor;
		televisor.setControl(this);
	}
	public void setCanal(int canal) {
		tv.setCanal(canal);
	}
	public TV getTV() {
		return this.tv;
	}
	public void setTV(TV tv) {
		this.tv = tv;
	}
}
