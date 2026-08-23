#include <iostream>
using namespace std;

int main() {

    int a;

    cout << "Enter the amount: ";
    cin >> a;

    int op;

    cout << "Enter the type of notes (100, 50, 20, 10): ";
    cin >> op;

    switch (op) {

        case 100:
            cout << a / 100 << endl;
            break;

        case 50:
            cout << a / 50 << endl;
            break;

        case 20:
            cout << a / 20 << endl;
            break;

        case 10:
            cout << a / 10 << endl;
            break;

        default:
            cout << "You entered wrong note type";
            break;
    }

    return 0;
}