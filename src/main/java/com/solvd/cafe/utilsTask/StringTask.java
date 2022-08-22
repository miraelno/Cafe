package com.solvd.cafe.utilsTask;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;


public abstract class StringTask {
    private static final Logger taskLogger = LogManager.getLogger(StringTask.class);
    private static final File textFile = new File("src/main/java/com/solvd/cafe/utilsTask/text.txt");

    public static void readText(){
        String text = null;
        try {
            text = FileUtils.readFileToString(textFile, StandardCharsets.UTF_8);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        taskLogger.info("The text contains word 'Scotsman' " + StringUtils.countMatches(text, "Scotsman")+" times.");
    }
}
