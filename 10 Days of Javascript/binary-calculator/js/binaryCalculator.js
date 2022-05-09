/**
 * @author Nelson Migliarini
 */
let currentNumber = '';
let firstNumber = '';
let secondNumber = '';
let operation = '';
let result = '';

function addCero() {
  if (currentNumber) {
    addNumber('0');
  }
}

function addOne() {
  addNumber('1');
}

function addSum() {
  addOperation('+');
}

function addSub() {
  addOperation('-');
}

function addMul() {
  addOperation('*');
}

function addDiv() {
  addOperation('/');
}

function clean() {
  cleanOperation();
  firstNumber = '';
  currentNumber = '';
  updateResponse();
}

function resolve() {
  if (secondNumber) {
    let firstValue = parseInt(firstNumber, 2);
    let secondValue = parseInt(secondNumber, 2);
    firstNumber = resolveOperation(firstValue, secondValue).toString(2);
    cleanOperation();
    updateResponse();
  }
}

function resolveOperation(firstValue, secondValue) {
  let response;
  switch (operation) {
    case '+':
      response = firstValue + secondValue;
      break;
    case '-':
      response = firstValue - secondValue;
      break;
    case '*':
      response = firstValue * secondValue;
      break;
    case '/':
      response = firstValue / secondValue;
      break;
    default:
      break;
  }
  return response;
}

function cleanOperation() {
  currentNumber = firstNumber;
  secondNumber = '';
  operation = '';
}

function addNumber(value) {
  currentNumber += value;
  if (!operation) {
    firstNumber = currentNumber;
  } else {
    secondNumber = currentNumber;
  }
  updateResponse();
}

function addOperation(value) {
  if (firstNumber && !secondNumber) {
    operation = value;
    currentNumber = '';
    updateResponse();
  }
}

function updateResponse() {
  document.getElementById('res').innerHTML = firstNumber + operation + secondNumber;
}
