/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.ambidexters;

import java.util.*;

/**
 *
 * @author Islam Mohamed
 */
public class Ambidexters {

    public static void main(String[] args) {
        int r, l, a, mn, mx;
        Scanner scan = new Scanner(System.in);
        l = scan.nextInt();
        r = scan.nextInt();
        a = scan.nextInt();
        if ((l == 0 && a == 0) || (r == 0 && a == 0)) {
            System.out.println(0);
        } else {
            if (l == r) {
                if (a % 2 == 0) {
                    System.out.println(l + r + a);
                } else {
                    System.out.println(l + r + a - 1);
                }
            } else {
                mn = Math.min(l, r);
                mx = Math.max(l, r);
                if (mn + a <= mx) {
                    System.out.println((mn + a) * 2);
                } else {

                    int x = mn + a - mx;
                    if (x % 2 == 0) {
                        System.out.println(mx * 2 + x);
                    } else {
                        System.out.println(mx * 2 + x - 1);
                    }

                }

            }
        }

    }
}
