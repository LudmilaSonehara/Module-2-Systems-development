/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uc7.atv3;

/**
 *
 * @author ludmi
 */
public class UC7ATV3 {

    public static void main(String[] args) {
    Gym resistanceGym = new Gym(new ResistanceExerciseFactory());
    resistanceGym.workout();

    Gym speedGym = new Gym(new SpeedExerciseFactory());
    speedGym.workout();
    }
}
