package example09;

// Buffer interface specifies methods called by Producer and Consumer.

public interface Buffer {
	public void set(int value); // place value into Buffer

	public int get(); // return value from Buffer
} // end interface Buffer
