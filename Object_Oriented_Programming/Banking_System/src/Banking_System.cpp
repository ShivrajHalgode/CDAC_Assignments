//============================================================================
// Name        : Banking_System.cpp
// Author      : Shivraj
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
using namespace std;

class BankAccount {
private:
    int accountNumber;
    string accountHolderName;
    double balance;

public:
    // Setter Methods
    void setAccountNumber(int accNo) {
        accountNumber = accNo;
    }

    void setAccountHolderName(string name) {
        accountHolderName = name;
    }

    void setBalance(double bal) {
        balance = bal;
    }

    // Getter Methods
    int getAccountNumber() {
        return accountNumber;
    }

    string getAccountHolderName() {
        return accountHolderName;
    }

    double getBalance() {
        return balance;
    }

    // Deposit Method
    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            cout << "Amount Deposited Successfully!\n";
        } else {
            cout << "Invalid Deposit Amount!\n";
        }
    }

    // Withdraw Method
    void withdraw(double amount) {
        if (amount > balance) {
            cout << "Insufficient Balance!\n";
        } else if (amount <= 0) {
            cout << "Invalid Withdrawal Amount!\n";
        } else {
            balance -= amount;
            cout << "Amount Withdrawn Successfully!\n";
        }
    }

    // Display Method
    void displayAccountDetails() {
        cout << "\nAccount Details:";
        cout << "\nAccount Number: " << accountNumber;
        cout << "\nAccount Holder Name: " << accountHolderName;
        cout << "\nBalance: " << balance << endl;
    }
};

int main() {
    BankAccount account;
    int choice;
    int accNo;
    string name;
    double bal, amount;

    // Initial account setup
    cout << "Enter Account Number: ";
    cin >> accNo;
    cout << "Enter Account Holder Name: ";
    cin >> name;
    cout << "Enter Initial Balance: ";
    cin >> bal;

    account.setAccountNumber(accNo);
    account.setAccountHolderName(name);
    account.setBalance(bal);

    do {
        cout << "\n===== BANK MENU =====";
        cout << "\n1. Deposit Money";
        cout << "\n2. Withdraw Money";
        cout << "\n3. Display Account Details";
        cout << "\n4. Exit";
        cout << "\nEnter your choice: ";
        cin >> choice;

        switch (choice) {

        case 1:
            cout << "Enter amount to deposit: ";
            cin >> amount;
            account.deposit(amount);
            break;

        case 2:
            cout << "Enter amount to withdraw: ";
            cin >> amount;
            account.withdraw(amount);
            break;

        case 3:
            account.displayAccountDetails();
            break;

        case 4:
            cout << "Exiting Program...\n";
            break;

        default:
            cout << "Invalid Choice!\n";
        }

    } while (choice != 4);

    return 0;
}
