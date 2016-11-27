public class Truck extends Car {
	int seatNum;

	int getSeatNum() {
		return seatNum;
	}

	void upSpeed(int value) {
		speed += value;
		if (speed > 140) {
			speed = 140;
		}
	}
}
