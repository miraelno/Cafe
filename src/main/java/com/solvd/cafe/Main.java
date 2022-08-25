package com.solvd.cafe;


import com.solvd.cafe.cafeStructure.Branch;
import com.solvd.cafe.cafeStructure.Table;
import com.solvd.cafe.dataGenerator.GenerateData;
import com.solvd.cafe.menu.Menu;
import com.solvd.cafe.people.Administrator;
import com.solvd.cafe.services.MainMenu;
import com.solvd.cafe.services.OrderManagement;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;


public class Main {
    public static void main(String[] args) {
        Logger mainLogger = LogManager.getLogger(Main.class);

        MainMenu.mainMenu();
    }
}
