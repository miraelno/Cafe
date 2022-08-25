package com.solvd.cafe.dataGenerator;

import com.solvd.cafe.cafeStructure.Branch;
import com.solvd.cafe.cafeStructure.Kitchen;
import com.solvd.cafe.cafeStructure.Table;
import com.solvd.cafe.enums.CityBranch;
import com.solvd.cafe.enums.MenuItemType;
import com.solvd.cafe.menu.Menu;
import com.solvd.cafe.menu.Product;
import com.solvd.cafe.people.Administrator;
import com.solvd.cafe.people.Client;
import com.solvd.cafe.people.Waiter;

import java.util.ArrayList;
import java.util.List;


public abstract class GenerateData {

    public static List<Waiter> WaiterGenerator() {
        List<Waiter> waiters = new ArrayList<>();

        Waiter waiter1 = new Waiter("Dima", "Kolomya", "0361245789", 18000, 2, true);
        Waiter waiter2 = new Waiter("Katya", "Havronska", "036456875", 18000, 5, true);
        Waiter waiter3 = new Waiter("Natalia", "Besida", "0364021578", 15000, 15, false);
        Waiter waiter4 = new Waiter("Maria", "Lavuta", "0632562015", 20000, 21, true);

        waiters.add(waiter1);
        waiters.add(waiter2);
        waiters.add(waiter3);
        waiters.add(waiter4);
        return waiters;
    }

    public static List<Branch> BranchGenerator() {
        List<Table> tables = new ArrayList<>();
        List<Branch> branches = new ArrayList<>();

        // Table table1 = new Table(1, 2);
        //Table table2 = new Table(2, 5);
        // Table table3 = new Table(3, 3);
        // Table table4 = new Table(4, 2);

        tables.add(new Table(1, 2));
        tables.add(new Table(2, 5));
        tables.add(new Table(3, 3));
        tables.add(new Table(4, 2));

        Administrator administrator1 = new Administrator("Elena", "Barusheva", "0254786415",
                20000, 0, "0254864512");
        Administrator administrator2 = new Administrator("Roman", "Hodor", "06231542648",
                22000, 15, "0254864513");

        Branch branch1 = new Branch(1, CityBranch.ODESSA, "Aleksandrovskiy avenue, 27", administrator1,
                new Kitchen(1, 10, true, "Ivan Holovat"), tables);
        Branch branch2 = new Branch(2, CityBranch.DNIPRO, "Kholodnoyarska street, 25", administrator2,
                new Kitchen(2, 3, true, "Olena Havid"), tables);

        branches.add(branch1);
        branches.add(branch2);
        return branches;
    }

    public static Menu MenuGenerator(){
        List<Product> menuList = new ArrayList<>();

        menuList.add(new Product("Coffee", MenuItemType.DRINK, 25));
        menuList.add(new Product("Greek salad", MenuItemType.MAIN_COURSE, 80));
        menuList.add(new Product("Green tea", MenuItemType.DRINK, 15));
        menuList.add(new Product("Lemon pie", MenuItemType.DESSERT, 60));
        menuList.add(new Product("Four cheeses", MenuItemType.PIZZA, 90));
        menuList.add(new Product("Scrambled eggs", MenuItemType.MAIN_COURSE, 40));
        menuList.add(new Product("Black tea", MenuItemType.DRINK, 15));
        menuList.add(new Product("Borsch", MenuItemType.MAIN_COURSE, 50));
        menuList.add(new Product("Potatoes with cutlet", MenuItemType.MAIN_COURSE, 52));
        menuList.add(new Product("Margarita pizza", MenuItemType.PIZZA, 70));
        menuList.add(new Product("Meat pizza", MenuItemType.PIZZA, 120));
        return new Menu(menuList);
    }

    public static List<Client> ClientsGenerator(){
        List<Client> clients = new ArrayList<>();

        clients.add(new Client("Ivan","Poroh","2012354861",1,false));
        clients.add(new Client("Svitlana","Zarah","201221544861",2,false));
        clients.add(new Client("Maryna","Bayda","20123540215",3,true));
        clients.add(new Client("Katerina","Zara","2222354861",4,true));
        clients.add(new Client("Pavlo","Lahun","201235482014",5,false));

        return clients;
    }
}
