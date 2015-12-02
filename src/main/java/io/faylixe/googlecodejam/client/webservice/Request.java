package io.faylixe.googlecodejam.client.webservice;

/**
 * <p>Simple class that exposes string constant
 * relative to HTTP API for interacting with
 * Code Jam webservice.</p>
 * 
 * @author fv
 */
public final class Request {

	/** API Request for retrieving contest info. **/
	public static final String CONTEST_INFO = "/ContestInfo";

	/** API Request for performing a specified command. **/
	public static final String COMMAND = "/do?cmd=";

	/** Command used for retrieving contest initial values. **/
	public static final String INITIAL_VALUES_COMMAND = "GetInitialValues";
	
	/** Command used for retrieving contest analysis. **/
	public static final String ANALYSIS_COMMAND = "GetContestAnalysis";

	/** Command used for downloading input file. **/
	public static final String DOWNLOAD_COMMAND = "GetInputFile";

	/** The <tt>csrfmiddlewaretoken</tt> parameter. **/
	public static final String CSRF_PARAMETER = "&csrfmiddlewaretoken=";

	/** The <tt>problem</tt> parameter. **/
	public static final String PROBLEM_PARAMETER = "&problem=";

	/** The time parameter. **/
	public static final String TIME_PARAMETER = "&zx=";

	/** The <tt>filename</tt> parameter. **/
	public static final String FILENAME_PARAMETER = "&filename=";

	/** The input identifier parameter. **/
	public static final String INPUT_ID_PARAMETER = "&input_id=";

	/** The <tt>undefined</tt> parameter value. **/
	public static final String UNDEFINED = "undefined";

	/**
	 * Private constructor for avoiding instantiation.
	 */
	private Request() {
		// Do nothing.
	}

}
