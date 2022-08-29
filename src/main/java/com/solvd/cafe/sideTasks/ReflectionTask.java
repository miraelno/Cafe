package com.solvd.cafe.sideTasks;

import com.solvd.cafe.Main;
import com.solvd.cafe.people.Provider;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.lang.reflect.Field;

public abstract class ReflectionTask {

    public static void main(String[] args) {
        Logger mainLogger = LogManager.getLogger(Main.class);
        Provider provider = new Provider();
        provider.setNameCompany("Kolosok");
        mainLogger.info(provider.getNameCompany());
        String name = null;
        try {
            Field field = provider.getClass().getDeclaredField("nameCompany");
            field.setAccessible(true);
            field.set(provider, (String) "after reflection");
            name = (String) field.get(provider);
        } catch (NoSuchFieldException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
        mainLogger.info(name);
    }
}


