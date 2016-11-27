public class Exam09 {
	public static void main(String[] args) {
		SportsCar sportsCar = new SportsCar();
		sportsCar.upSpeed(350);
		System.out.println("스포츠 카의 현재 속도는 " +
			sportsCar.getSpeed() + "km입니다.");

		Truck truck = new Truck();
		truck.upSpeed(350);
		System.out.println("트럭의 현재 속도는 " +
			truck.getSpeed() + "km입니다.");
	}
}
