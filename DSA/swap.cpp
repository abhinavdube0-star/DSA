#include <iostream>
using namespace std;

void printarray(int arr[], int n) {

    for (int i = 0; i < n; i++) {
        cout << arr[i] << " ";
    }

    cout << endl;
}

void swapArray(int arr[], int size) {

    for (int i = 0; i < size; i += 2) {

        if (i + 1 < size) {
            swap(arr[i], arr[i + 1]);
        }
    }
}

int main() {

    int even[8] = {5, 4, 3, 2, 1, 7, 5, 3};
    int odd[5] = {1, 3, 5, 7, 9};

    swapArray(even, 8);
    printarray(even, 8);

    cout << endl;

    swapArray(odd, 5);
    printarray(odd, 5);

    return 0;
}