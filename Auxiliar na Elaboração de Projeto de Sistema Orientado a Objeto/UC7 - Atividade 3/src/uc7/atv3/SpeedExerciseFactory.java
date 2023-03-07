/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uc7.atv3;

/**
 *
 * @author ludmi
 */
class SpeedExerciseFactory implements ExerciseFactory {
  @Override
  public Exercise createExercise() {
    return new SpeedExercise();
  }
}
