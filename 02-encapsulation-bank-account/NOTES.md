# Bank Account — Encapsulation Notes

## What Is Encapsulation?

Encapsulation groups an object's data and related behaviour inside a class and controls access to that data.

In this project, BankAccount keeps its balance private and exposes public methods for permitted operations.

## Private Fields

```java
private double balance;
```

Main cannot directly read or assign this field. Code inside BankAccount can access it.

This prevents callers from bypassing the account's transaction rules.

## Getter

```java
public double getBalance() {
    return balance;
}
```

A getter allows callers to read a value through a method.

We do not provide a balance setter. Balance changes should happen through validated deposits and withdrawals.

## Controlled Changes Through Methods

```java
public void deposit(double amount) {
    if (amount <= 0) {
        System.out.println("Deposit amount must be greater than zero.");
        return;
    }

    balance += amount;
    System.out.println("Deposit successful.");
}
```

The method checks the amount before updating the balance. Zero and negative deposits are rejected, leaving the balance unchanged.

## Meaning of return in a void Method

`return;` exits the current method without returning a value.

When deposit rejects an amount, control returns to the caller in Main. It does not end the whole program.

## Key Idea

Making a field private is one part of encapsulation. The public methods must also enforce the rules for accessing and changing that data.

## Controlled Withdrawals

The public `withdraw(double amount)` method checks two rules before changing the private balance:

1. The amount must be greater than zero.
2. The amount must not exceed the available balance.

If either check fails, `return;` exits the method and leaves the balance unchanged.

When both checks pass:

```java
balance -= amount;
```

This means:

```java
balance = balance - amount;
```

Withdrawing the entire balance is allowed and leaves zero.

Main requests the operation, while BankAccount controls whether it is permitted. This is encapsulation: callers use the account's public methods without directly changing its private data.