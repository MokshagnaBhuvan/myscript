let name = "Mokshagna Bhuvan";
let username = "White7minato";

result1 = typeof name;

result2 = typeof username;

if (result1 === result2) {
    console.log("true");
}                           //if-else loop
else
    console.log("false");

let age = 18;

result3 = typeof age;

result4 = (result1 === result3) ? "true" : "false";  //tenary operator
console.log(result4);


let day = "Monday";

switch (day.toLowerCase()) {
    case 'monday':
    case 'tuesday':
    case "wednesday":
        console.log("No lab today");
        break;
    case 'thursday':
        console.log("Yes we do hav lab today");
        break;
    case 'friday':
        console.log("No lab today");
        break;
    default:
        console.log("Holiday");
}

console.log(`SO me ${name} with the username ${username}`); //template literal


let i = 4;
while (i > 3 && i < 5) {
    console.log("yes it is");
    i++;
}


for (let a = 1; a <= 100; a++) {
   let result = (a%2 === 0) ? "even" : "odd";
    console.log(a,result);


}

let b = 123456;
let rem = 0;
while (b !== 0) {
    rem = b % 10;
    console.log(rem);
    b = parseInt(b / 10);
}

