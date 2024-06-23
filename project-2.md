# Projects related to DOM

# Solution Code

## project 2: BMI Calculator


```javascript


//Wrapped the code in a DOMContentLoaded event listener to ensure 
//the DOM is fully loaded before the script runs.
document.addEventListener("DOMContentLoaded", () => {
    const form = document.querySelector("#bmi-form");

    form.addEventListener("submit", function(e) {
        e.preventDefault();

        const height = parseInt(document.querySelector(".height").value);
        const weight = parseInt(document.querySelector(".weight").value);
        const results = document.querySelector('#results');

        if (isNaN(height) || height <= 0) {
            results.innerHTML = ` <span style="font-size: 18px;"> Please give a valid height.</span>`;
        } else if (isNaN(weight) || weight <= 0) {
            results.innerHTML = `<span style="font-size: 18px;"> Please give a valid weight.</span>`;
        } else {
            const bmi = (weight / ((height / 100) ** 2)).toFixed(2);
            let bmiCategory = '';

            if (bmi < 18.6) {
                bmiCategory = 'Under Weight';
            } else if (bmi >= 18.6 && bmi <= 24.9) {
                bmiCategory = 'Normal Weight';
            } else {
                bmiCategory = 'Over Weight';
            }

            // Display the result with BMI and BMI category
            results.innerHTML = ` <span Your BMI is style="font-size: 18px;">${bmi} You are ${bmiCategory}.</span>.`;
        }
    });
});


```
