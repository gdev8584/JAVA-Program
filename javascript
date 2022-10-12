// Write code in js to find out most frequent item of an array. And also try to find out which numbers 
// are prime and which are even, also find out 
// vowels and consonants from the same array// input is [2,6,8,3,5,7,a,b,e,u,y,z,i,o,8,8]

const a = [2,6,8,3,5,7,'a','b','e','u','y','z','i','o',8,8]
 
let mf = 1;
let m = 0;
for(let i=0;i<a.length;i++){
     for (var j=i; j<a.length; j++)
        {
                if (a[i] == a[j])
                 m++;
                if (mf<m)
                {
                  mf=m; 
                  item = a[i];
                }
        }
        m=0;
}
console.log(item)
// even no...........................................
const arr1 = a.filter((item)=>{
    return (item%2==0)
})
console.log("even no")
console.log(arr1)
// odd no...........................................
console.log("odd no")
const arr2 = a.filter((item)=>{
    return (item%2==1)
})
console.log(arr2);
// vowel find...............................................
console.log("vowels")
let a1 = [];
const vowel = ['a','e','i','o','u']
for(let i=0;i<a.length;i++){
   if(vowel.includes(a[i])){
       a1.push(a[i])
    }
}
console.log(a1);
// consonents....................................................
let a2 = [];
console.log("consonents")
for(let i=0;i<a.length;i++){
   if(vowel.includes(a[i])){
    }else{
        if(typeof a[i]=="string"){
            a2.push(a[i])
        }
    }
    
}
console.log(a2);
