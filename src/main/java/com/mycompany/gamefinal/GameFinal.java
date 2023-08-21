/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.gamefinal;

import Home.Main;
import MainPackage.DatabaseConnection;
import com.sun.jdi.connect.spi.Connection;

/**
 *
 * @author User
 */
public class GameFinal {

    public static void main(String[] args) {
        new Main().setVisible(true);
        Connection con = null;
        con = DatabaseConnection.connect();
    }
}
