const numbers = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10];

const result = numbers.filter(function(e) { return e % 2 == 0; })
  .map(function(e) { return e * 2; })
  .reduce(function(total, e) { return total + e; });

console.log(result);

//Functional is not as familier to a lot of people as imperative style is
//But, in general function is less complex than imperative style

//Functional style code is declarative which favors SLAP a lot more than
//imperative style

//Each line of code does one thing and nicely flows into the next stage
//The code reads like the problem statement

//give the numbers,
//get all the even numbers
//double them
//total

//But still, this code is not the best in terms of ease of understand, we can
//do better. We should reduce the noise.
