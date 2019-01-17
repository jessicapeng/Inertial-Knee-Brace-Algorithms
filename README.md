# Inertial-Knee-Brace-Algorithms

Engineering a Knee Brace with Inertial Based Controllers Approach to Knee Injury and ACL Tear Prevention through Knee Abduction Evaluations and Warnings

# Background Information. 
The ACL is a ligament that runs diagonally across the knee, connecting the femur to the tibia. An estimated 250,000-300,000 ACL ruptures are reported every year in America. Knee abduction movement over 25.3 Nm is a common risk factor for ACL tears. In this movement, the knee shifts away from the midline of the body. Knee abduction movements are commonly found in exercises like squatting, lunging, jumping, landing, leg dips, gait, and running. Currently, there is no easily accessible method for athletes to understand their risk of ACL injury. 

# Introduction.
This project aims to allow athletes to understand their risk of ACL injury by means of a knee brace. This brace has accelerometers, a type of inertial sensor, that track acceleration in three axes. By relating the acceleration to knee abduction with Newton’s Second Law of Rotation with a software program, the amount of knee abduction can be shown, and thus the risk of ACL injury can be identified. Because the amount of knee abduction that is considered safe and unsafe is known, athletes will be able to understand when their motions translated to unsafe knee abduction, which shows them their risk of tearing their ACL. By understanding the risk of tearing their ACL, athletes can implement preventative techniques into their training. 

# Design Constraints.
1. The knee brace cannot disrupt the normal motions of the athlete. 2. Sensors cannot be large in size. 3. Sensors and boards must be wearable devices. 4. Sensor or board must have memory capacity. Design. The accelerometers must be placed in spots where they can measure acceleration that translates to knee abduction. The final design contains only two sensors that are placed on either side of the knee at the midpoint. This final design allows for two readings of knee abduction, and does not provide excess data that cannot be translated to knee abduction as the initial design did. It also prevents the knee brace from unnecessarily interfering with the athlete’s motions.

# Methods.
In order to calculate torque and knee abduction, two Java classes were written. The first class is the TorqueCalculator, which takes in weight, length of leg, and radius of the leg of the athlete and calculates the mass moment of inertia based on the Parallel Axis Theorem. In order to calculate angular acceleration, a method is called from this class to the Java class ReadingFiles, which returns the tangential acceleration by running an algorithm through the acceleration data files. Finally, one last calculation is made with Newton’s Second Law of Rotation to determine whether the torque over 25.3 Nm to test for knee abduction.

# Results. 
From the torque measured throughout motions including mimicked knee abduction, squats, jumps, and lunges, the program consistently produces accurate results. Overall, the data corresponded with the observations that were made in a standard physical therapy test, proving that this program has the ability to accurately translate acceleration to knee abduction during controlled exercises, and the risk of ACL tears can be shown.

# Conclusion.

Throughout this project, a knee brace that uses accelerometers to track acceleration throughout exercise was developed. Then a software program translating acceleration to torque was designed by integrating physics into algorithms. This program has the ability to accurately determine the amount of knee abduction from the acceleration in a controlled environment. This program can effectively show athletes their risk of ACL injury. By identifying this risk, athletes will be able to implement preventative measures into their training, and further reduce the possibility of the ACL injury. In addition, this program has the potential to predict other knee issues that are indicated by knee abduction, including patellofemoral pain. 

# Further Research.
1. Reduce potential error by using a geometrical figure that more accurately represents the shape of the limb from the knee to the ankle. 2. Using two centers of mass to more accurately represent the motion of torque. 3. Implementation of this knee brace into gameplay.
