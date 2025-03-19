# 🧮 Uncertainty Calculator

## 📌 Project Overview  
Uncertainty Calculator is a mobile application designed for **physics experiments** to compute **measurement uncertainties**.  
It supports **Type A uncertainty**, **Type B uncertainty**, and their **combined uncertainty** using standard propagation formulas.  
Users can input, edit, and delete measurement data while the app automatically computes the total uncertainty \( u_c \).

## 🚀 Features  
- **📥 Data Input**
  - Enter multiple measurement values (Type A uncertainty).
  - Input Type B uncertainty (typically instrument error).
- **🔢 Data Management**
  - Modify existing data entries.
  - Delete specific data points or the most recent entry.
  - **Triple-click to clear all data.**
- **📊 Uncertainty Calculation**
  - Computes **combined uncertainty** using:
    \[
    u_c(x) = \sqrt{u_A^2 + u_B^2}
    \]
  - Displays key computed values:
    - \( u_A \) (Type A uncertainty)
    - \( u_c \) (Combined uncertainty)
    - \( \bar{x} \) (Mean value)
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

## 📮 Contact  
Created by [neutrino2306](https://github.com/neutrino2306) – Feel free to reach out! 🚀
