/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.simplecalculator.model;

/**
 *
 * @author Dimon
 */
public enum Operation {
    div(0), mul(1), add(2), sub(3);

    private final int id;
    Operation(int id) { this.id = id; }
    public int getValue() { return id; }
}




