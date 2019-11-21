/* 
 * Copyright 2019 Elísabet Palomino .
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.main;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Elísabet Palomino
 */
public class Main {

    public static final Scanner SCN
            = new Scanner(System.in, "Windows-1252")
                    .useLocale(Locale.ENGLISH).useDelimiter("\\s+");

    public static void main(String[] args) {

        //Constantes
        final int NUM_PERS = 4;
        final int PLANTA_MAX = 10;
        final int PLANTA_MIN = 1;

        //Variables
        int planta = 1;
        int persona = 1;

        //Bucle
        do {
            try {
                //Peticion
                System.out.printf("A que planta (1-10) desea ir la persona %d?..: ", persona);
                planta = SCN.nextInt();

                //Comprobacion de una planta correcta
                if (planta >= PLANTA_MIN && planta <= PLANTA_MAX) {
                    System.out.printf("La persona %d ha elegido la planta %02d%n",
                            persona, planta);

                    //Sumar una persona
                    persona++;
                } else {
                    //Mensaje de error
                    System.out.println("No es una planta válida");
                }

            } catch (Exception e) {
                System.out.println("No es una planta válida");
            } finally {
                SCN.nextLine();
            }
        } while (persona <= NUM_PERS);

    }//main

}//class

