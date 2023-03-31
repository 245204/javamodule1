package enummm;

public enum DayofWeek {

	MONDAY("Monday"),
	TUESDAY("Tuesday"),
	WEDNESDAY("Wednesday"),
	THURSDAY("Thursday"),
	FRIDAY("Friday"),
	SATURDAY("Saturday"),
	SUNDAY("Sunday");
	
private final String name;

private DayofWeek(String name) {
	this.name = name;
}

public String getName() {
	return name;
}
}

