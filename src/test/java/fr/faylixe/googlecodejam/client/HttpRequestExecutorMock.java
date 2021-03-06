package fr.faylixe.googlecodejam.client;

import fr.faylixe.googlecodejam.client.executor.HttpRequestExecutor;
import fr.faylixe.googlecodejam.client.executor.Request;

/**
 * Test case for the {@link HttpRequestExecutor} class.
 * 
 * @author fv
 */
public final class HttpRequestExecutorMock {

	/**
	 * Creates and returns a valid {@link HttpRequestExecutor}
	 * instance that could be used for test. Such instance is not
	 * logged to any google services.
	 * 
	 * @return Created instance.
	 */
	public static HttpRequestExecutor getTestExecutor() {
		return HttpRequestExecutor.create(Request.DEFAULT_HOSTNAME);
	}

}
