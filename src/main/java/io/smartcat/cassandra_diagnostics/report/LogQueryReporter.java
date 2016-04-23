package io.smartcat.cassandra_diagnostics.report;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * A SLF4J based {@link QueryReporter} implementation.
 * This reporter is using {@link Logger} to print query reports to a log at {@code INFO} level.
 */
public class LogQueryReporter implements QueryReporter {

	private static final Logger logger = LoggerFactory.getLogger(LogQueryReporter.class);
	
	private static final String LOG_TEMPLATE = "QueryReport [startTime={}, executionTime={}, clientAddress={}, statement={}]";
	
	@Override
	public void report(QueryReport queryReport) {
		logger.info(LOG_TEMPLATE, queryReport.startTime, queryReport.executionTime, queryReport.clientAddress, queryReport.statement);		
	}

}
