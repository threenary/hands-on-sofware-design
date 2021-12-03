const numbers = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10];

const result = numbers.filter(e => e % 2 == 0)
  .map(e => e * 2)
  .reduce((total, e) => total + e);

console.log(result);

//A lot less noise than the previous version

//But, still requires some effort to read, we can do better
