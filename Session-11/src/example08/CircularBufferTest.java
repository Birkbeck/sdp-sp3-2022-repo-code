package example08;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CircularBufferTest {
	public static void main(String[] args) {
		// create new thread pool with two threads
		ExecutorService application = Executors.newFixedThreadPool(2);

		// create CircularBuffer to store ints
		Buffer sharedLocation = new CircularBuffer();

		try // try to start producer and consumer
		{
			application.execute(new Producer(sharedLocation));
			application.execute(new Consumer(sharedLocation));
		} // end try
		catch (Exception exception) {
			exception.printStackTrace();
		} // end catch

		application.shutdown();
	} // end main
} // end class CircularBufferTest
