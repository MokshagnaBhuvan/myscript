console.log('hello world');

let age = 18
console.log(age);

const name = "Mokshagna Bhuvan";
console.log(name);

console.log(typeof age)

console.log(typeof name)

let flag = true
console.log(typeof flag)

console.log(Number.MAX_VALUE)

let a
a = 0xfff
if (a == 4095) {
    console.log("true");
}

console.log(String.length)

let first_userName = "white7"
let last_userName = "minato"
let username = first_userName + last_userName
console.log(username)
console.log(first_userName, last_userName);

x = age + first_userName;
console.log(typeof x, x)

x = x - 2;
console.log(typeof x, x)

console.log(Boolean(x));
console.log(Boolean(7));

console.log(Boolean(0)); //0, undefined, NaN, empty strings returns false

let bool1 = true
let bool2 = true
const result = bool1 + bool2
console.log(result, typeof result)
