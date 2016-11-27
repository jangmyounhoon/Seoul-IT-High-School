interface ClickListener {
	public void print();
}

public class Exam13 {
	public static void main(String[] args) {
		ClickListener listener = new ClickListener() {
			public void print() {
				System.out.println("클릭 리스너입니다.");
			}
		};

		listener.print();
	}
}
