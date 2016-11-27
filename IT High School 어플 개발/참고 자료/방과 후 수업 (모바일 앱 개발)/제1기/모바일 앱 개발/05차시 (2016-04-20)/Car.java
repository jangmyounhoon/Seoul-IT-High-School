public class Car {
	String color;
	int speed = 0;

	String getColor() {
		return color;
	}

	int getSpeed() {
		return speed;
	}

	void upSpeed(int value) {
		speed += value;
		if (speed > 200) {
			speed = 200;
		}
	}

	void downSpeed(int value) {
		speed -= value;
		if (speed < 0) {
			speed = 0;
		}
	}
}
