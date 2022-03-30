
public class Car {
	String name;
	int speed;

	public Car() {    
		name = "아반떼";
		speed = 150;
	}
	
	
	
	
	public Car(String cName) {
		name = cName;
	}
	
	public String getName() {
		return name;
	} 
		
	public Car(String cName, int cSpeed) {
	name = cName;
	speed = cSpeed;
    }         
	
	
	/*-------------------------------------------------*/
	
	
	public String getname() {
		return name;
	}
	
	public int getspeed() {
		return speed;
	}
	
	/*-------------------------------------------------*/
	public void setname(String cName) {
		name = cName;
	}
	
	public void setname(int cSpeed) {
		speed = cSpeed;
	}

	public void setCar(String cName, int cSpeed) {
		name = cName;
		speed = cSpeed; 
	}
	
	
	
	
	public void setSpeedup(int cSpeed) {
		speed += cSpeed;
	}
	
	public void setSpeeddw(int cSpeed) {
		speed -= cSpeed;
	}
	
	
	
	
	
}
