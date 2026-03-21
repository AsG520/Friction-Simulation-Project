# Friction-Simulation-Project

Features in Simulation
- Simulates two moving boxes on separate floors.
- Applies physics formulas such as gravity, normal force, and friction.
- You can distinguish between static and kinetic friction.
- Has animation with the use of Java Timer.
- Boxes slow down over time due to friction and bounce off screen edges.

Physics Concepts in Simulation
- Gravity Force (Fg) = m * g.
- Normal Force (Fn) = m * g.
- Static Friction (Fs) = μs * Fn.
- Kinetic Friction (Fk) = μk * Fn.
- Net Horizontal Force (Fnetx) = Fapp - Fk.
- Net Vertical Force (Fnety) = Fn - Fg.
- Net Force (Fnet) = Fapp - Ff.

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
2) Make sure the image files are in the same directory, or else boxes won't appear in the following window.
3) Compile the program: "javac FrictionBox.java".
4) Run the program: "java FrictionBox".

Video Details for Simulation

If you want the full explanation, I highly recommend watching my video, where I explain everything, including the code, physics, and the history behind friction :D.

Video Link of Simulating Friction in Java (YouTube) - https://youtu.be/_NHbPYDnwoY?si=o_jonQvRN190B4mU



