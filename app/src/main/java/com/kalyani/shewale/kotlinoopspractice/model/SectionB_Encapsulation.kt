package com.kalyani.shewale.kotlinoopspractice.model

import android.util.Log

private const val TAG = "SectionB"

// 4. BankAccount
class BankAccount(private var balance: Double = 0.0) {

    fun deposit(amount: Double) {
        if (amount > 0) {
            balance += amount
            Log.d(TAG, "Deposited ₹$amount. Balance: ₹$balance")
        } else {
            Log.d(TAG, "Invalid deposit amount")
        }
    }

    fun withdraw(amount: Double) {
        if (amount <= 0) {
            Log.d(TAG, "Invalid withdrawal amount")
        } else if (amount > balance) {
            Log.d(TAG, "Insufficient balance! Current balance: ₹$balance")
        } else {
            balance -= amount
            Log.d(TAG, "Withdrew ₹$amount. Balance: ₹$balance")
        }
    }

    fun getBalance(): Double = balance
}

// 5. Employee
class Employee(private var salary: Double) {

    fun setSalary(newSalary: Double) {
        if (newSalary > 0) {
            salary = newSalary
            Log.d(TAG, "Salary updated to ₹$salary")
        } else {
            Log.d(TAG, "Invalid salary! Must be greater than 0")
        }
    }

    fun getSalary(): Double = salary
}

fun runSectionB() {
    Log.d(TAG, "---- BankAccount ----")
    val acc = BankAccount(1000.0)
    acc.deposit(500.0)
    acc.withdraw(300.0)
    acc.withdraw(5000.0)
    Log.d(TAG, "Final Balance: ₹${acc.getBalance()}")

    Log.d(TAG, "---- Employee ----")
    val emp = Employee(30000.0)
    Log.d(TAG, "Initial Salary: ₹${emp.getSalary()}")
    emp.setSalary(45000.0)
    emp.setSalary(-100.0)
    Log.d(TAG, "Final Salary: ₹${emp.getSalary()}")
}