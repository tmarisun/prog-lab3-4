package org.example;

import org.example.experiments.*;
import org.example.mineral.*;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class Scene {

    Mineral minerals [] = new Mineral[3];
    {
        minerals[0] = new MoonStone();
        minerals[1] = new Cork();
        minerals[2] = new SugarPiece();

    }

    private String want() throws RuntimeException{

        boolean flag = false;
        Scanner sc = new Scanner(System.in);
        String s = "";
        int cnt = 0;
        while(!flag) {
            if(cnt > 10){
                throw new DebilException("You are debil!");
            }
            try {
                s = sc.nextLine();
                if (!s.equals("yes") && !s.equals("no")) {
                    throw new Exception();
                }
                flag = true;
            } catch (NoSuchElementException e) {
                System.out.println("Exiting...");
                System.exit(0);
            }
            catch (Exception e) {
                cnt++;
                System.out.println("You entered an incorrect response, please try again:(");
            }

        }
        return s;
    }

    private String who() {
        System.out.println("Enter the name of the experimenter (There are two options Znaika and NeZnaika)");

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        while(!(s.equalsIgnoreCase("NeZnaika") || s.equalsIgnoreCase("Znaika"))) {
            s = sc.nextLine();
            System.out.println("There is no such experimenter, please check the correctness of the entered name.");
        }
        return s;
    }

    public void start() throws NuclearDangerException {
        for (int i = 0; i < 3; i++) {
            if(i != 0) System.out.println();

            System.out.println("Would you like to experiment with " + minerals[i].name + "?");


            String describe = minerals[i].toString();
            System.out.println(describe);

            System.out.println();
            System.out.println("To answer, enter yes or no.");
            String want = want();
            System.out.println();
            if (want.equalsIgnoreCase("no")) continue;

            String who = who();
            Experementer exp;
            System.out.println();

            if (who.equalsIgnoreCase("NeZnaika")) exp = new NeZnaika();
            else exp = new Znaika();


            try {

                ExperimentResult ans = new ExperimentResult(
                        exp.burnTest(minerals[i]),
                        exp.sinkTest(minerals[i]),
                        exp.energyTest(minerals[i]),
                        exp.decomposeTest(minerals[i]),
                        exp.tempTest(minerals[i])
                );

                String s = ans.toString();
                System.out.print(s);

                if (who.equalsIgnoreCase("NeZnaika")){
                    System.out.println("NeZnaika blew up the house! Save yourself!");
                    System.out.println();
                }
                else {
                    for (int j = 0; j < 3; j++) {
                        if (ans.cmp()[j] == Components.Uranium) {
                            if (ans.tempTest() >= 60) {
                                throw new NuclearDangerException("Be careful, there is a risk of exposure." +
                                        "In order to avoid exposure, the experiment was discontinued.");
                            }
                        }
                    }
                }
            } catch (NoDecomposeException e) {
                System.out.println(e.getMessage());
            }

        }
    }

}