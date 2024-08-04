// /*let me = {
//     name: 'Mokshagna Bhuvan',
//     age: 18,
//     laptop: {
//         company: 'Asus',
//         Series: 'TUF F15',
//         ram: '16gb',
//     }
// };
// /*console.log(me, typeof me);

// console.log(me.name, me['age']);

// console.log(me.name.toLowerCase());

// console.log(me.laptop.Series.length)

// console.log(me.relation?.name);

// delete me.laptop.ram //deleted the ram property

// console.log(me.laptop);
// */
// /*for (let key in me.laptop) {
//     console.log(key, me.laptop[key]);
// }*/

// /*function morning() {
//     let input1;
//     input1 = prompt('Authorisation please: ');

//     if (input1.toLowerCase() === "wakeup daddy's home") {
//         console.log(`Morning Boss!\nHere are the updates ${me.name}`);
//     }
//     else {
//         console.log("May i know your identity");
//     }
//     //console.log("Wakeup Daddy's home!");

// }
// morning();
// */
// /*function owner(user) {
//     return `Hello ${user}`;
// }
// let user = 'moksha'
// let str = owner(user);
// console.log(str);
// */

// let business = {
//     ownership: 'Mokshagna Bhuvan',
//     est: 2005,
//     location: 'Narasaraopet',

//     greet: function (user) {
//         return (`Hello ${user} this is ${this.ownership}`);

//     }
// };
// let user = 'customer'
// let greeting = business.greet(user);

// console.log(greeting);
// function laptop(ram, cpu, GraphicsCard, Company) {
//     this.ram = ram,
//         this.cpu = cpu,
//         this.GraphicsCard = GraphicsCard,
//         this.Company = Company

//     this.compare = function (lap) {
//         if (this.ram > lap.ram) {
//             return `${this.Company} is better than ${lap.Company}`;
//         }
//         if (this.ram === lap.ram) {
//             return `${this.Comapny} have same ram compare with ${lap.Company}`
//         }
//         else {
//             return `${lap.Company} is better than ${this.Company}`
//         }

//     }
// }
// let laptop1 = new laptop(16, 'i7', '3060 rtx ti', 'Asus tuf f15') //constructor methods
// console.log(laptop1);
// let laptop2 = new laptop(8, 'i7', '3060 rtx', 'HP')
// console.log(laptop2);
// let comparison = laptop1.compare(laptop2)
// console.log(comparison);

// // let laptop1 = { //Object methods
// //     ram: 16,
// //     cpu: 'i7',
// //     GraphicsCard: '3060 rtx ti',
// //     Company: 'Asus Tuf F15',
// //     compare: function(laptop){
// //         if (this.ram > laptop.ram){
// //             return `${this.Company} is better than ${laptop.Company}`;
// //         }
// //         if (this.ram === laptop.ram) {
// //             return `${this.Company} have same ram compare with ${laptop.Company}`
// //         }
// //         else{
// //             return `${laptop.Company} is better than ${this.Company}`
// //         }

// //         }
// //     }


// // let laptop2 = {
// //     ram: 8,
// //     cpu:'i7',                                     //Object methods
// //     GraphicsCard: '3060 rtx',
// //     Company: 'Lenovo Legion',
// //     compare: function(laptop){
// //         if (this.ram > laptop.ram){
// //             return `${this.Company} is better than ${laptop.Company}`;
// //         }
// //         if (this.ram === laptop.ram) {
// //             return `${this.Comapny} have same ram compare with ${laptop.Company}`
// //         }
// //         else{
// //             return `${laptop.Company} is better than ${this.Company}`
// //             }

// //      }
// //     }
// // let comparison = laptop1.compare(laptop2);
// // console.log(comparison);


let values = [1, 2, 4, 5, 6, 7]; //Array methods
console.log(values.length);
values.push(3)
console.log(values.length);
console.log(values);
values.pop();
console.log(values);
console.log(values[4]);

values.shift();
console.log(values);

if (values.length === 5) {
    values[5] = 'moksha';
    console.log(values);
}
while (values[0] != 'moksha') {
    values.shift();
}
console.log(values);
values.unshift('bhuavn');
console.log(values);
values.splice(2, 0, 'bhuvan');
console.log(values);

let array = new Array();
array.push(1)
array.push(2)
array.push(3)
array.push(4)
array.push(5)
array.push(6)
console.log(array);
array.splice(2, 1, 'moksha');
console.log(array);

// array[99] = 10
// let b = 11
// console.log(array);
// for (let n of array) {
//     if (n === 'undefined') {
//         n = b;
//         b++
//     }
//     console.log(n);
// }

for (let n of array) {
    if (n === 'moksha') {
        let [name] = n;
        console.log(name);
    };

} 

let statement = "Hello This is Mokshagna Bhuvan".split(' ')  //Array destructing
console.log(statement);
let [a,b,c,...d] = statement;
console.log(d);

array.forEach((n) =>{
    console.log(n);
})