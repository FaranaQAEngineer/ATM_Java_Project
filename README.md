# 💳 ATM Java Project

This is a simple yet functional Java-based **ATM Simulator** that mimics the basic operations of a real ATM.

---

## 🔧 What Can It Do?

This project supports:

✅ Secure PIN login (3 tries max)  
✅ Deposit money into your account  
✅ Withdraw money with a balance check  
✅ Check current account balance  
✅ Repeats transactions until the user decides to exit  
✅ Handles invalid inputs with friendly messages

---

## 🚀 How to Run It

1. Open this project in your favorite Java IDE  
   (✅ IntelliJ IDEA, ✅ Eclipse, ✅ VS Code)
2. Run the `ATM.java` file
3. Enter PIN when prompted — **Default PIN: `123`**
4. Choose your operation:
   - `1` → Check Balance
   - `2` → Deposit
   - `3` → Withdraw
5. After each transaction, choose to continue or exit

---

## ✨ Key Features 

🔒 **PIN Verification**  
- Users have up to **3 chances** to enter the correct PIN.  
- After 3 failed attempts, the account gets **blocked**.

💰 **Deposit & Withdraw**  
- Minimum ₹100 is required to deposit or withdraw.  
- Prevents withdrawing more than the available balance.

🔁 **Transaction Loop**  
- After each transaction, users are asked:  
  _“Do you want to continue?”_  
- This makes the experience feel like a real ATM session.

🛡️ **Input Validation**  
- Handles invalid PINs and wrong choices and continues to prompt until a valid input is entered.

---

## 🖥️ Sample Output

Enter Your ATM PIN Number
123
PIN is correct..

Please enter your choice:

Balance Check

Deposit

Withdrawal

Enter the amount to Deposit
500
Rs.500 Amount is Deposited successfully
Your Account current balance is Rs 500.0

Do you want to continue? Say Yes or No


## 👩‍💻 Author

**FaranaQAEngineer**  
Java Developer | Trainer | Tech Enthusiast| Software Tester

---

## 📁 Project Type

Beginner-friendly Java project — great for learning:
- `if-else` conditions
- `switch` statements
- `methods`
- `loops`
- `input handling using Scanner`

---

## 🏷️ Tags

`#Java` `#ATMProject` `#MiniProject` `#JavaBeginners` `#ConsoleApplication` `#BankingSimulation` `#JavaPractice` `#OOP` `#ScannerClass` `#SimpleJavaProject`

---
