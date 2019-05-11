/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools;

import getdata.Checkmail;

/**
 *
 * @author admin
 */
public class Test {
    public static void main(String[] args) {
        Checkmail check = new Checkmail();
        System.out.println(check.checkLoginAdmin("admin","123456"));
    }
}
