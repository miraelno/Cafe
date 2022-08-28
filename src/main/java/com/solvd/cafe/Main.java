package com.solvd.cafe;


import com.solvd.cafe.services.MainMenu;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class Main {
    public static void main(String[] args) {
        Logger mainLogger = LogManager.getLogger(Main.class);

        MainMenu.mainMenu();
    }
}
