const isEven = number => number % 2 === 0;
const double = number => number * 2;
const sum = (op1, op2) => op1 + op2;

const numbers = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10];

const result = numbers.filter(isEven)
  .map(double)
  .reduce(sum);

console.log(result);

//The code does not require us to parse into the lambdas or arrow functions.
//The names of the function represent abstraction and convey the intent
//quickly.

//The parts are easier to test part from the whole.
