package testlambdas;

public class LambdaSwitchCase {
	static double calculate(String operator, double x, double y) {
		return switch (operator) {
		case "+" -> x + y;
		case "-" -> x - y;
		case "*" -> x * y;
		case "/" -> {
			if (y == 0) {
				throw new IllegalArgumentException("Cant divide");
			}
			yield x / y;
		}
		default -> throw new IllegalArgumentException("Unknown operator");

		};
	}

public static void main(String[] args) {
	LambdaSwitchCase lsc =new LambdaSwitchCase();
	lsc.calculate("+", 4, 0);
	lsc.calculate("/", 4, 2);
	lsc.calculate("_", 4, 9);
	lsc.calculate("*", 4, 7);
}
}