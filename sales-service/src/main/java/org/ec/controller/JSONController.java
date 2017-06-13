
// JSONController.java --
//
// JSONController.java is part of ElectricCommander.
//
// Copyright (c) 2005-2017 Electric Cloud, Inc.
// All rights reserved.
//

package org.ec.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.ec.domain.SalesData;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/service")
public class JSONController
{

    //~ Methods ----------------------------------------------------------------

    @RequestMapping(
        value  = "/data",
        method = RequestMethod.GET
    )
    @ResponseBody public List<SalesData> getSalesData()
    {
        List<SalesData> saleList = new ArrayList();
        Random          random   = new Random();

        for (int i = 0; i < 10; i++) {
            SalesData sale = new SalesData();

            sale.setCompletedTasks(random.nextInt(10));
            sale.setDailySales(random.nextInt(100));
            saleList.add(sale);
        }

        return saleList;
    }
}
