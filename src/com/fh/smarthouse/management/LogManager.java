package com.fh.smarthouse.management;

import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class LogManager {
	private static Logger logger;

	static {
		try {
			logger = Logger.getLogger("SmartHouseLogger");
			String logFilePath = "C:\\Users\\bhava\\Desktop\\logs\\SmartHouseLog.log";
			File logDir = new File("C:\\Users\\bhava\\Desktop\\logs");
			if (!logDir.exists() && !logDir.mkdirs()) {
				logDir.mkdirs();
			} else {
				System.out.println("Directory already exists");
			}
			FileHandler fileHandler = new FileHandler(logFilePath, true);
			fileHandler.setFormatter(new SimpleFormatter());
			logger.addHandler(fileHandler);
			logger.setUseParentHandlers(false);
            logger.info("Logger initialized successfully.");

		} catch (IOException e) {
			System.err.println("Failed to initialize logger: " + e.getMessage());
		}
	}

	// Provide a public method to retrieve the logger instance

	public static Logger getLogger() {
		return logger;
	}

}
