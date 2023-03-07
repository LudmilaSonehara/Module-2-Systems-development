/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uc7.atv3;

/**
 *
 * @author ludmi
 */
class Gym {
  private ExerciseFactory exerciseFactory;

  Gym(ExerciseFactory exerciseFactory) {
    this.exerciseFactory = exerciseFactory;
  }

  void workout() {
    Exercise exercise = exerciseFactory.createExercise();
    exercise.perform();
  }
}
