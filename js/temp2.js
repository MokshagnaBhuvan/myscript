


// let laptop2 = {
//     ram: 8,
//     cpu:'i7',                                     //Object methods
//     GraphicsCard: '3060 rtx',
//     Company: 'Lenovo Legion',
//     compare: function(laptop){
//         if (this.ram > laptop.ram){
//             return `${this.Company} is better than ${laptop.Company}`;
//         }
//         if (this.ram === laptop.ram) {
//             return `${this.Comapny} have same ram compare with ${laptop.Company}`
//         }
//         else{
//             return `${laptop.Company} is better than ${this.Company}`
//             }

//      }
//     }
// // let comparison = laptop1.compare(laptop2);
// // console.log(comparison);


// let values = [1, 2, 4, 5, 6, 7]; //Array methods
// console.log(values.length);
// values.push(3)
// console.log(values.length);
// console.log(values);
// values.pop();
// console.log(values);
// console.log(values[4]);

// values.shift();
// console.log(values);

// if (values.length === 5) {
//     values[5] = 'moksha';
//     console.log(values);
// }
// while (values[0] != 'moksha') {
//     values.shift();
// }
// console.log(values);
// values.unshift('bhuavn');
// console.log(values);
// values.splice(2, 0, 'bhuvan');
// console.log(values);

// let array = new Array();
// array.push(1)
// array.push(2)
// array.push(3)
// array.push(4)
// array.push(5)
// array.push(6)
// console.log(array);
// array.splice(2, 1, 'moksha');
// console.log(array);

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

// for (let n of array) {
//     if (n === 'moksha') {
//         let [name] = n;
//         console.log(name);
//     };

// } 

// let statement = "Hello This is Mokshagna Bhuvan".split(' ')  //Array destructing
// console.log(statement);
// let [a,z,c,...d] = statement;
// console.log(d);

// let marks = [40,38,36,40,42];

// marks = marks.filter(n => n < 40)
//      .map(n => n + (40-n) )

// marks.forEach(n => console.log(n));


// let info = new Set();
// info.add('moksha');
// info.add('bhuvan');
// info.add('bhuvan');
// info.add(19);
// info.add(22041);

// info.forEach((n, n1) => {
//     console.log(n)
//    console.log(info.has('moksha'))
// }
// );

// let info = new Map();

// info.set("Name" , 'Moksha');
// info.set("Age" , 19);
// info.set("RollNo" , 22041);
// console.log(info);


// info.forEach((a,b) => {console.log(a, ":" ,b)});

// let num
// function fact(num){
//     if(num === 0){
//         return 1;
//     }
//     else{
//         return fact(num - 1) * num;
//     }
// }
// console.log(fact(11));


// var createCounter = function(n) {
//     let num = 0
//     return function() {
//         let result = n + num;
//         num++;
//         return result;
//     };
// };


//  const counter = createCounter(10)
//   counter() // 10
//   counter() // 11
//   counter() // 12

#include <iostream>
#include <vector>
using namespace std;

class Solution {
public:
    vector<int> nthUglyNumber(int n) {
        vector<int> arr;
        int size = 0;
        for (int i = 1; i < 100; i++) {
            if ((i % 2 == 0) || (i % 3 == 0) || (i % 5 == 0)) {
                while (size < 10) {
                    for (int j = 0; j < size; j++) {
                        arr.push_back(i);
                        size++;
                    }
                }
            }
        }
        return arr;
    }
};

int main() {
    Solution solution;
    vector<int> result = solution.nthUglyNumber(10);
    for (int num : result) {
        cout << num << " ";
    }
    cout << endl;
    return 0;
}
 