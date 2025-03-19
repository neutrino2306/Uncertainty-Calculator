# 🧮 Uncertainty Calculator

Uncertainty Calculator is a mobile application designed for **physics experiments** to compute **measurement uncertainties**.  
It supports **Type A uncertainty, Type B uncertainty, and their combined uncertainty**, following standard propagation formulas.  
Users can input measurement data, specify Type B uncertainty, and the app will automatically compute **Type A uncertainty, Combined uncertainty, and the Mean value**.

## 🚀 Features  
- **📥 Data Input**
  - Enter multiple measurement values (used for Type A uncertainty calculation).
  - Input **Type B uncertainty** (typically instrument error).
- **🔢 Data Management**
  - Modify existing data entries.
  - Delete specific data points or the most recent entry.
  - **Triple-click to clear all data.**
- **📊 Uncertainty Calculation**
  - Computes **Type A uncertainty** $u_A$ based on statistical analysis of input data.
  - Uses the formula:
    $$
    u_A = \frac{s}{\sqrt{n}}
    $$
    where $s$ is the standard deviation of the measurements and $n$ is the number of samples.
  - Computes **Combined Uncertainty** $u_c$ using:
    $$
    u_c = \sqrt{u_A^2 + u_B^2}
    $$
  - Displays key computed values:
    - $u_A$ (Type A uncertainty)
    - $u_c$ (Combined uncertainty)
    - $\bar{x}$ (Mean value)
- **🎨 User-Friendly Interface**
  - Intuitive UI for easy data entry and modifications.
  - Distinct buttons for adding, editing, and clearing data.

## 🛠️ Tech Stack  
- **Platform:** Android  
- **Languages:** Java
- **UI Framework:** Android XML  
- **Math Libraries:** Custom implementation for statistical calculations  

## 📦 Installation & Setup  

### 1️⃣ Clone the Repository  
```bash
git clone git@github.com:neutrino2306/Uncertainty-Calculator.git
cd Uncertainty-Calculator
```
### 2️⃣ Run the Application  
_(Modify based on how your app runs)_

#### If using Android Studio:
1. Open the project in **Android Studio**.
2. Build and run the application on an emulator or physical device.

## 📮 Contact  
Created by [neutrino2306](https://github.com/neutrino2306) – Feel free to reach out! 🚀
