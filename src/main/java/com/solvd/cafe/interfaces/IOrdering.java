package com.solvd.cafe.interfaces;

import com.solvd.cafe.cafeStructure.Table;
import com.solvd.cafe.people.Waiter;

import java.util.ArrayList;


public interface IOrdering {
     void takeOrder(Table table, Waiter waiter, ArrayList menuItems);
}
