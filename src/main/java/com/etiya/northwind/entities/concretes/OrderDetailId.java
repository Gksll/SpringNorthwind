package com.etiya.northwind.entities.concretes;

import lombok.Data;

import java.io.Serializable;

@Data
public class OrderDetailId implements Serializable {

    private int orderId;

    private int productId;
}
