# 🔒 Password Strength Checker
## 🎯 Intro:
A Java-based program that validates password strength by checking various security criteria. This project helps users create strong passwords by evaluating multiple factors including length, character types, and common patterns.

## 🛠️ Tech Stack:
* Java
* Scanner class for user input
* Command line interface

## 💫 Features:
* Length verification:
* Minimum 8 characters
* Maximum 32 characters
* Character type requirements:
* Uppercase letters
* Lowercase letters
* Numbers
* Special characters
* Pattern checking:
* No repeated sequences
* No common words
* No keyboard patterns
* Security scoring:
* Different weights for each criterion
* Overall strength rating

## 📝 Process:
Created this project to help users generate secure passwords that meet modern security standards. The development focused on:
* Implementing comprehensive validation rules
* Creating clear error messages
* Balancing security with usability
* Providing helpful feedback

## 📚 Learnings:
* Enhanced string manipulation skills
* Improved regex pattern matching
* Better input validation techniques
* Deeper understanding of password security
* Experience with modular code design

## ⭐ Improvement Ideas:
* Add password generation feature
* Include password strength meter
* Implement GUI interface
* Add password history checking
* Include common password database
* Support multiple languages

## 🚀 Running the Project:
1. Clone the repository
2. Navigate to project directory
3. Compile: `javac PasswordStrengthChecker.java`
4. Run: `java PasswordStrengthChecker`
5. Follow the prompts

## 🖼️ Sample Output:
```bash
Welcome to Password Strength Checker
Enter a password to validate: Password123$
Checking password strength...
Password123$ is a strong password.
Strength score: 10/10
```