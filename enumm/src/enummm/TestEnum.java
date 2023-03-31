package enummm;

public class TestEnum {

	public static void main(String[] args) {
		DayofWeek today=DayofWeek.SATURDAY;
		System.out.println("today is"+ today.getName());
		//this would output:today is saturday
		
		switch(today) {
		case MONDAY:
			System.out.println("Work hard");
			break;
		case TUESDAY:
			System.out.println("Work little more");
			break;
		case WEDNESDAY:
			System.out.println("Work work little more");
			break;
		case THURSDAY:
			System.out.println("work work more,WEEKEND IS AROUND");
			break;
		case FRIDAY:
			System.out.println("jeah weekend has arrived,party hard");
			break;
		case SATURDAY:
			System.out.println("enjoy morning coffee and go for shopping");
			break;
		case SUNDAY:
			System.out.println("do all cleaning works.....SNOOOOOOOZZZZ");
			break;
			}
	}

}
