# Encapsulation — Bank Account

A small Java project demonstrating how a class controls access to its data through public methods.

## Features

- Keeps the balance private.
- Initialises each account with a zero balance.
- Provides a getter to read the balance.
- Accepts positive deposits.
- Rejects zero and negative transaction amounts.
- Rejects withdrawals exceeding the balance.
- Allows withdrawal of the entire balance.

## Concepts Covered

- Encapsulation and private fields.
- Public methods as controlled access points.
- Getters without unnecessary setters.
- Validation before changing object state.
- Early returns from void methods.
- Preserving the balance when a transaction is rejected.

Detailed explanations are in [NOTES.md](NOTES.md).

## Files

- `src/BankAccount.java` — stores the balance and enforces transaction rules.
- `src/Main.java` — demonstrates successful and rejected transactions.

## How to Run

With a JDK installed, open a terminal in this project's folder:

```text
javac src/BankAccount.java src/Main.java
java -cp src Main
```

Alternatively, run `Main.main()` in IntelliJ IDEA.

## Demonstration

Starting balance: `0.0`

| Transaction | Resulting balance |
|---|---|
| Deposit 500 | 500.0 |
| Deposit -100 | Rejected; 500.0 |
| Withdraw 200 | 300.0 |
| Withdraw 400 | Rejected; 300.0 |
| Withdraw 0 | Rejected; 300.0 |
| Withdraw -50 | Rejected; 300.0 |
| Withdraw 300 | 0.0 |

## Limitations

The balance exists only during execution. This learning project uses `double`, which can introduce decimal rounding effects.

## Status

Complete — all planned encapsulation examples are implemented.