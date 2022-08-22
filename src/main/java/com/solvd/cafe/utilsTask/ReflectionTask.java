package com.solvd.cafe.utilsTask;

import com.solvd.cafe.Main;
import com.solvd.cafe.dataGenerator.GenerateData;
import com.solvd.cafe.order.Menu;
import com.solvd.cafe.order.Product;
import com.solvd.cafe.people.Person;
import com.solvd.cafe.people.Provider;
import com.solvd.cafe.services.OrderManagement;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.lang.reflect.Field;
import java.util.List;

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


