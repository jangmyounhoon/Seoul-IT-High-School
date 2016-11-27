public class SportsCar extends Car {
	int seatNum;

	int getSeatNum() {
		return seatNum;
	}

	void upSpeed(int value) {
		speed += value;
		if (speed > 300) {
			speed = 300;
		}
	}
}
