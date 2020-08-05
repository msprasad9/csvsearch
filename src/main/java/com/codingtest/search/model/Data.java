package com.codingtest.search.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Data {
    private String region;

    private String country;

    private String itemType;

    private String salesChannel;

    private String orderPriority;

    private String orderDate;

    private String orderId;

    private String shipDate;

    private String unitsSold;

    private String unitPrice;

    private String unitCost;

    private String totalRevenue;

    private String totalCost;

    private String totalProfit;
}
