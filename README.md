# Friction-Simulation-Project

Overview of Project
This Java Swing program simulates two boxes under friction, calculating gravity, normal force, static and kinetic friction. It checks if applied force causes motion, then uses a timer to update velocity and position, making boxes move, slow down, and bounce off screen edges.

Features
- Simulates two moving boxes on separate floors.
- Applies physics formulas such as gravity, normal force, and friction.
- You can distinguish between static and kinetic friction.
- Has animation with the use of Java Timer.
- Boxes slow down over time due to friction and bounce off screen edges.

Physics Concepts Used
- Gravity Force (Fg) = m * g.
- Normal Force (Fn) = m * g.
- Static Friction (Fs) = μs * Fn.
- Kinetic Friction (Fk) = μk * Fn.
- Net Horizontal Force (Fnetx) = Fapp - Fk.
- Net Vertical Force (Fnety) = Fn - Fg.
- Net Force (Fnet) = Fapp - Ff.

This program demonstrations whether the applied force is strong enough to overcome static friction, just how we push objects in the real world. If it is, the boxes begin to move and kinetic friction takes place.

How It Works 
- The program initializes variables like mass, gravity, velocities, and friction coefficients.
- It calculates all forces acting on the boxes (assuming no air resistance).
- It checks if the applied force can overcome static friction.
- If motion occurs, a timer updates velocity and position continuously.
- Friction slows the boxes down over time.
- When boxes hit the edge of the screen, they bounce back creating what is known as collisions.

Requirements
- Java (JDK 8 or higher).
- IDE (e.g., VS Code, Eclipse, or IntelliJ).
- Image files:
  1) box.png
  2) box2.png

How to Run 
1) Copy the code into a Java file named "FrictionBox.java".
2) Make sure the image files aare in the same directory, or else boxes won't appear in the following window.
3) Compile the program: "javac FrictionBox.java".
4) Run the program: "java FrictionBox".

Inspiration
I made this project because I wanted to learn the physics behide moving objects and the factors that friction play to slow down a moving object with some sort of force acting on it. The curiosity of being in my physics class, also bought me wondering how does friction function this way. As a result, I took the knowledge about coding that I know and the physics which I learned in my physics class and made this simulation.

Conclusion
This project was not very difficult and did not involve any complex or advance physics calculations or coding skills. However, I still enjoyed making this project becasue it helped reinforce important basic concepts like friction, force, and motion. Understanding and mastering these fundamentals is necessary before moving on to more advanced physics or programming projects.
