# Beresheet

## Crash Reasons

The Beresheet spaceship was supposed to land on the moon on April 11th, 2019. Unfortunately, Beresheet has crashed on the lunar surface. There were multiple causes for that crash.

Mainly, Beresheet was built with cheap parts and technologies to save money and time. Missions of this kind usually don't cost much when comparing to big missions in the past. They're supposed to be built fast and cheap and they have low success rates from the start. This fact was the cause of several problems.

- The star tracker's cameras stopped working, which made it very difficult to maneuver in space.

- The main computer of Beresheet kept resetting randomly. That was probably a result of insufficient radiation protection.

- There was no hard storage for program extensions so they had to be loaded to the RAM with each computer reset.

As the spaceship approached the moon surface, 1 of the 2 Inertial Measurement Units (IMU) stopped working. The team decided to try to activate it even though they had 1 IMU still running.

That action caused the acceleration data to briefly stop arriving to the computer and it resulted in navigation error and full reset. The reset did not take long but the uppermentions program extensions was programmed to be loaded every 1 minute. That resulted in 5 resets until the extensions were loaded.

The resets caused the main (bottom) engine to stop. When the computer tried to start the engine again, but it needed to get power from 2 different souces. Because of the resets only 1 power source worked and the engine never started and Beresheet couldn't slow down and lost altitude very fast.

All these reasons leaded to the sad crashing of Beresheet. Let's hope it won't happen again in Bereshit 2 - 2024.

## Simulation Exaplined
The simulations process is built with 3 classes:

**[Bereshit](src/Beresheet.java)** - The main class with the computations and all related variables. We use a loop to update the parameters consistently until we reach the target. The angle is updated with the PID class.

**[Moon](src/Moon.java)** - This class represents the moon and its gravitational parameters.

**[PID](src/PID.java)** - This class represents the PID controller in which we compute the angle multiple times in order to reach as close as we can to the target.

## Instructions
### Changes we made
* We added a PID class and used it in Beresheet class to calculate error and angle.
* We created an algorithm to calculate NN with the PID error.
* We created a table design to show data and fuel left.
* We logged all the output data and calculated the fuel percentage.

### How to run?
    java -jar bin/Beresheet.jar
    
## Report
The report/log can be found in [log.txt](log.txt).

A new log is created each time you run the simulator.
