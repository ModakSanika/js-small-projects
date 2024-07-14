let randomNumber = parseInt(Math.random() * 100 + 1); // generate a random number between 1 and 100
const submit = document.querySelector("#subt"); // get the submit button element
const userInput = document.querySelector("#guessField"); // get the user input field element
const guessSlot = document.querySelector(".guesses"); // get the element to display previous guesses
const remaining = document.querySelector(".lastResult"); // get the element to display remaining guesses
const lowOrHi = document.querySelector(".lowOrHi"); // get the element to display feedback
const startOver = document.querySelector(".resultParas"); // get the container for result paragraphs
const p = document.createElement("p"); // create a paragraph element for the "start new game" button

let prevGuess = []; // array to store previous guesses
let numGuess = 1; // variable to track the number of guesses
let playGame = true; // boolean to track if the game is currently being played

if (playGame) {
  submit.addEventListener("click", function (e) {
    e.preventDefault(); // prevent form submission
    const guess = parseInt(userInput.value); // get the user's guess
    validateGuess(guess); // validate the guess
  });
}

// validate the user's guess
function validateGuess(guess) {
  if (isNaN(guess)) {
    alert("Please enter a valid number");
  } else if (guess < 1) {
    alert("Please enter a number greater than one");
  } else if (guess > 100) {
    alert("Please enter a number less than 100");
  } else {
    prevGuess.push(guess); // add the guess to the previous guesses array
    if (numGuess === 11) {
      displayGuess(guess);
      displayMessage(`Game Over. The number was ${randomNumber}`);
      endGame();
    } else {
      displayGuess(guess); // display the guess
      checkGuess(guess); // check the guess
    }
  }
}

// check if the guess is correct, too low, or too high
function checkGuess(guess) {
  if (guess === randomNumber) {
    displayMessage("You guessed it right!");
    endGame();
  } else if (guess < randomNumber) {
    displayMessage("Number is TOO low");
  } else if (guess > randomNumber) {
    displayMessage("Number is TOO high");
  }
}

// display the user's guess and update the remaining guesses
function displayGuess(guess) {
  userInput.value = ""; // clear the input field
  guessSlot.innerHTML += `${guess} `; // add the guess to the list of previous guesses
  numGuess++; // increment the number of guesses
  remaining.innerHTML = `${11 - numGuess}`; // update the remaining guesses
}

// display a message to the user
function displayMessage(message) {
  lowOrHi.innerHTML = `<h2>${message}</h2>`;
}

// end the game
function endGame() {
  userInput.value = ""; // clear the input field
  userInput.setAttribute("disabled", ""); // disable the input field
  p.classList.add("button"); // add a class to the paragraph element
  p.innerHTML = '<h2 id="newGame">Start New Game</h2>'; // add the "start new game" button
  startOver.appendChild(p); // add the paragraph element to the container
  playGame = false; // set playGame to false to prevent further guesses
  newGame();
}

// start a new game
function newGame() {
  const newGameButton = document.querySelector("#newGame"); // get the "start new game" button
  newGameButton.addEventListener("click", function (e) {
    randomNumber = parseInt(Math.random() * 100 + 1); // generate a new random number
    prevGuess = []; // reset the previous guesses array
    guessSlot.innerHTML = ""; // clear the previous guesses display
    numGuess = 1; // reset the number of guesses
    remaining.innerHTML = "10"; // reset the remaining guesses display
    userInput.removeAttribute("disabled"); // enable the input field
    startOver.removeChild(p); // remove the "start new game" button
    playGame = true; // set playGame to true to allow guesses
  });
}
