#include <stdio.h>

float celsiusToFahrenheit(float c);
float fahrenheitToCelsius(float f);

int main() {

    float c, f;

    printf("Enter temperature in Celsius: ");
    fflush(stdout);
    scanf("%f", &c);

    printf("Enter temperature in Fahrenheit: ");
    fflush(stdout);
    scanf("%f", &f);

    float convertedF = celsiusToFahrenheit(c);
    float convertedC = fahrenheitToCelsius(f);

    printf("%.2f Celsius = %.2f Fahrenheit\n", c, convertedF);
    fflush(stdout);
    printf("%.2f Fahrenheit = %.2f Celsius\n", f, convertedC);
    fflush(stdout);
    return 0;
}



float celsiusToFahrenheit(float c) {
    return (c * 9.0 / 5.0) + 32.0;
}

float fahrenheitToCelsius(float f) {
    return (f - 32.0) * 5.0 / 9.0;
}
