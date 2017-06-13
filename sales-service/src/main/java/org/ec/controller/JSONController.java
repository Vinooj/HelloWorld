
// JSONController.java --
//
// JSONController.java is part of ElectricCommander.
//
// Copyright (c) 2005-2017 Electric Cloud, Inc.
// All rights reserved.
//

package org.ec.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/data")
public class JSONController
{

    //~ Methods ----------------------------------------------------------------

    @RequestMapping(
        value    = "/1",
        method   = RequestMethod.GET,
        produces = "application/json;charset=UTF-8"
    )
    @ResponseBody String getSalesData()
    {
        String jsonStr = "{ \"Title\": \"Sales Dashboard\", \"DateCreated\": \"05/20/2017\", \"metrics\": [ { \"type\" : \"revenue\", \"total\": \"32245\" }, { \"type\": \"issues\", \"number\": \"212 555-1234\" }, { \"type\": \"twitterFollowers\", \"number\": \"245\" } ] }";

        return jsonStr;
    }

    /*@RequestMapping(
     *  value  = "/dataJson", method = RequestMethod.GET ) @ResponseBody public
     * List<SalesData> getSalesData2() { List<SalesData> saleList = new
     * ArrayList(); Random          random   = new Random();
     *
     * for (int i = 0; i < 10; i++) {     SalesData sale = new SalesData();
     *
     *   sale.setCompletedTasks(random.nextInt(10));
     * sale.setDailySales(random.nextInt(100));     saleList.add(sale); }
     *
     * return saleList;}*/
}
