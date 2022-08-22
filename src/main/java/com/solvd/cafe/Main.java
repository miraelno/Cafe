package com.solvd.cafe;


import com.solvd.cafe.dataGenerator.GenerateData;
import com.solvd.cafe.order.Menu;
import com.solvd.cafe.order.Product;
import com.solvd.cafe.services.OrderManagement;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;


public class Main {
    public static void main(String[] args) {
        Logger mainLogger = LogManager.getLogger(Main.class);

/*      List<Branch> branches = GenerateData.BranchGenerator();
        Administrator admin1 = branches.get(0).getAdministrator();
        mainLogger.info(admin1.getFirstName());*/

        //StringTask.readText();
        Menu menu = GenerateData.MenuGenerator();
        mainLogger.info(menu);
        mainLogger.info(menu.filter("DRINK"));
    }
}
