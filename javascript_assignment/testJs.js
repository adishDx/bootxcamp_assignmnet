
// Question 1.----->
// var amount = prompt("Enter The Amount ");
// var interest = prompt("Enter the Interest");
// var years = prompt("Enter the No. Of years");
// alert("Simple Interest : "+(Number(amount)*Number(interest)*Number(years)));


//Question 2.------>
// var str1 = prompt("Enter String1");
// str1 = str1.toLocaleLowerCase();
// if(str1 == str1.split("").reverse().join(""))
//     alert("String is palindrome.");
// else
//     alert("String is not palindrome.");



//Question 3.------->
// var radius = Number(prompt("Enter The Radius"));
// alert("Area Of Circle : "+(3.14*radius*radius));



//Question 4.------>
// var obj = {};
// obj.a = 5;
// obj.b = 6;
// obj.c = 10;
// var objCopy = JSON.parse(JSON.stringify(obj));
// console.log(obj);
// console.log(objCopy);


//Question 5.------->

//a.
// var emp = [];
// emp[0] = {'name':'Adish','age':23,'salary':6000,'dob':(new Date(1996,0,3))};
// emp[1] = {'name':'Ashish','age':23,'salary':500,'dob':(new Date(1995,3,5))};
// emp[2] = {'name':'Nitish','age':22,'salary':7000,'dob':(new Date(1995,8,3))};
// emp[3] = {'name':'Ayush','age':23,'salary':900,'dob':(new Date(1995,8,11))};
// console.log(emp);

//b.
// let count = 0;
// var c = [];
// for(let i = 0; i < emp.length;i++)
// {
//     if(emp[i].salary > 5000)
//         c[count++] = emp[i];
// }
// console.log(c);


//d.
// count = 0;
// for(let i = 0; i < emp.length;i++)
// {
//     if(emp[i].salary < 1000 && emp[i].age > 20)
//     {
//         console.log(emp[i]);
//         emp[i].salary = emp[i].salary * 5 ;
//     }
// }
// console.log(emp);