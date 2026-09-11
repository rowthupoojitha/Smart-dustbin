# Smart Dustbin using Java

A simple **Smart Dustbin simulation** developed using Java.

The program simulates a smart dustbin that monitors its fill level and provides a status or warning based on the percentage of waste inside the dustbin.

## 📌 Overview

A smart dustbin can use sensors to determine how full the dustbin is.

This Java project simulates that functionality by taking the dustbin fill level as input from the user.

The program then displays the current status of the dustbin.

## 📂 Project Structure

```text
java-smart-dustbin/
├── .gitignore
├── SmartDustbin.java
└── README.md
```

## ⚙️ Working Principle

The user enters the dustbin fill level as a percentage.

The program checks the percentage and displays the appropriate status.

```text
Fill Level        Status
--------------------------------
0% - 29%          LOW
30% - 69%         HALF FILLED
70% - 89%         NEARLY FULL
90% - 100%        FULL
```

## 💻 Program

The Java program uses conditional statements to simulate the smart dustbin.

```java
if (capacity >= 90) {
    // Dustbin is full
}
else if (capacity >= 70) {
    // Dustbin is nearly full
}
else if (capacity >= 30) {
    // Dustbin is half filled
}
else {
    // Dustbin has enough space
}
```

## ▶️ How to Run

### Step 1: Check Java

```bash
java --version
```

### Step 2: Check Java Compiler

```bash
javac --version
```

### Step 3: Compile the Program

```bash
javac SmartDustbin.java
```

### Step 4: Run the Program

```bash
java SmartDustbin
```

## 📊 Sample Output

### Low Fill Level

```text
=================================
       SMART DUSTBIN SYSTEM
=================================
Enter dustbin capacity (%): 20

Dustbin Fill Level: 20%
Status: LOW
Dustbin has enough space.
```

### Half Filled

```text
=================================
       SMART DUSTBIN SYSTEM
=================================
Enter dustbin capacity (%): 50

Dustbin Fill Level: 50%
Status: HALF FILLED
Dustbin is working normally.
```

### Nearly Full

```text
=================================
       SMART DUSTBIN SYSTEM
=================================
Enter dustbin capacity (%): 75

Dustbin Fill Level: 75%
Status: NEARLY FULL
Warning: Dustbin needs attention soon.
```

### Full

```text
=================================
       SMART DUSTBIN SYSTEM
=================================
Enter dustbin capacity (%): 95

Dustbin Fill Level: 95%
Status: FULL
Alert: Dustbin is almost full!
Action: Please empty the dustbin.
```

## 🧠 Concepts Used

* Java
* Scanner
* User input
* Variables
* If-else statements
* Conditional logic
* Comparison operators
* Input validation
* Basic simulation

## ⏱️ Complexity

**Time Complexity:** `O(1)`

**Space Complexity:** `O(1)`

The program performs a fixed number of comparisons regardless of the input.

## 🌱 Real-World Smart Dustbin

A real smart dustbin can be developed using:

* Ultrasonic sensor
* Arduino or ESP32
* Servo motor
* Buzzer
* LED indicators
* Microcontroller
* IoT connectivity

An ultrasonic sensor can measure the distance between the sensor and the waste. The microcontroller can then calculate the approximate fill level.

## 🚀 Future Improvements

This Java simulation can be extended into a more advanced project:

* Automatic lid opening simulation
* Waste-level monitoring
* Multiple dustbins
* Alert system
* Sensor integration using Arduino
* IoT-based monitoring
* Mobile application
* Automatic notification when the bin is full

## 🛠️ Technologies

* Java
* Git
* GitHub

## 👨‍💻 Author

**Your Name**

GitHub: `https://github.com/your-username`

---

⭐ If you found this project useful, consider giving the repository a star!

```
```