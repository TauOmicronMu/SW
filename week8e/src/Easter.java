
public class Easter {

	private int day;
	private int month;
	private int year;
	
	/**
	* Create a new Easter object.
	* @param day
	* @param month
	* @param year
	*/
	public Easter(int year) {
		this.setYear(year);
		
		/*
		* Anonymous Gregorian Algorithm
		* https://en.wikipedia.org/wiki/Computus#Anonymous_Gregorian_algorithm
		*/
		
		int a = year % 19;
		int b = (int)Math.floor(year/100);
		int c = year % 100;
		int d = (int)Math.floor(b/4);
		int e = b % 4;
		int f = (int)Math.floor((b+8) / 25);
		int g = (int)Math.floor((b -f + 1) / 3);
		int h = (19 * a + b - d - g + 15) % 30;
		int i = (int)Math.floor(c/4);
		int k = c % 4;
		int l = (32 + 2*e + 2*i - h - k) % 7;
		int m = (int)Math.floor( (a + 11 * h + 22 * l) / 451);
		
		this.setMonth((int)Math.floor( (h + l - 7 * m + 114) / 31));
		this.setDay((int)((h + l - 7*m + 114) % 31) +1);
	}
	
	/**
	 * Return the current day
	 * @return The current day
	 */
	public int getDay() {
		return this.day;
	}
	 
	/**
	 * Change the current day
	 * @param day The new day
	 */
	public void setDay(int day) {
		this.day = day;
	}	
	
	/**
	 * Return the current month
	 * @return the current month
	 */
	public int getMonth() {
		return this.month;
	}
	
	/**
	 * Change the current month
	 * @param month The new month
	 */
	public void setMonth(int month) {
		this.month = month;
	}
	 
	/**
	 * Return the current year.
	 * @return The current year
	 */
	public int getYear() {
		return this.year;
	}
	
	/**
	 * Change the current year.
	 * @param year The new year.
	 */
	public void setYear(int year) {
		this.year = year;
	}
}
