const numbers = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10];

let result = 0;

for(let i = 0; i < numbers.length; i++) {
  if(numbers[i] % 2 === 0) {
    result += numbers[i] * 2;
  }
}

console.log(result);

//Very familiar code that is in the imperative style
//This code fails on SLAP - we are diving into two or three levels of details
//in here.

//From the complexity point of view this is quite complex.
//But, we often confuse the word familiar with the word simple.
// familer may not be simple. Familar is just that, we are comfortable with it

