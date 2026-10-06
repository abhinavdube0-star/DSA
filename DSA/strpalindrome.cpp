#include <iostream>
using namespace std;

int getlength(char a[]) {
    int count = 0;

    for (int i = 0; a[i] != '\0'; i++) {
        count++;
    }

    return count;
}

bool palindrome(char a[], int n) {

    int s = 0;
    int e = n - 1;

    while (s < e) {

        if (a[s] != a[e]) {
            return false;
        }

        s++;
        e--;
    }

    return true;
}

int main() {

    char name[20];

    cout << "Enter your name: ";
    cin >> name;

    int len = getlength(name);

    if (palindrome(name, len)) {
        cout << "Yes, this is a palindrome" << endl;
    }
    else {
        cout << "No, this is not a palindrome" << endl;
    }

    return 0;
}