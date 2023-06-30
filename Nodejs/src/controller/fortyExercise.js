function sumTwoNumber(req, res) {
  const { firstNumber, secondNumber } = req.params;
  let result = firstNumber + secondNumber;
  res.send(result);
}

function isPrimeNumber(req, res) {
  const { number } = req.params;
  if (number < 2) {
    return false;
  }
  let squareRoot = Math.sqrt(number);
  for (let i = 2; i <= squareRoot; i++) {
    if (n % i == 0) {
      res.send(number + " is not prime number");
      break;
    }
  }
  res.send(number + " is prime number");
}

function findMaxNumber(req, res) {
  const { numberArrays } = req.body;
  let max = numberArrays[0];
  numberArrays.forEach((element) => {
    if (max < element) {
      max = element;
    }
  });
  res.send("Max number is ", max);
}

function reverseString(req, res) {
  const { text } = req.params;
  let reverseText = "";
  for (let i = text.length - 1; i >= 0; i--) {
    reverseText += text[i];
  }
  res.send(reverseText);
}

function palindrome(req, res) {
  const { text } = req.params;
  for (let i = 0; i < text.length; i++) {
    if (text[i] !== text[text.length - i - 1]) {
      res.send(text + " is not a palindrome");
      break;
    }
  }
  res.send(text + " is a palindrome");
}

function factorial(req, res) {
  const { number } = req.params;
  let result;
  for (let i = 1; i <= number; i++) {
    result *= i;
  }
  res.send(result);
}

function getEvenNumberFromArray(req, res) {
  const { arraysNumber } = req.body;
  for (let i = 0; i < arraysNumber.length; i++) {
    if (arraysNumber[i] % 2 !== 0) arraysNumber.splice(i, 1);
  }
  res.send(arraysNumber);
}

function sortAnArray(req, res) {
  const { listNumber } = req.body;

  for (let i = 0; i < listNumber.length; i++) {
    for (let j = i + 1; j < listNumber.length - 1; j++) {
      if (listNumber[i] > listNumber[j]) {
        let temp = listNumber[i];
        listNumber[j] = listNumber[i];
        listNumber[i] = temp;
      }
    }
  }
  res.send(listNumber);
}

module.exports = {
  findMaxNumber,
  getEvenNumberFromArray,
  isPrimeNumber,
  palindrome,
  reverseString,
  sortAnArray,
  sumTwoNumber,
  factorial,
}