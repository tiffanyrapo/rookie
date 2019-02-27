/**var obj1={};
obj1.name="tony";
obj1.age=23;
obj1.color="black";

console.log(obj1);*/

//var class = ['離散數學', '嵌入式系統', '線性代數', '資料結構'];
//2019-01-16
var i;
for (i=1;i<=10;i++)
{
    if (i%2==0){
        console.log('%2:'+i);
        if(i%4==0){
            console.log('%4:'+i*i);
        }
    }
    else if (i%3===0){ //===為嚴格相等 (全等於),若型別不同則會回傳fasle
        console.log('float:'+Float(i));
    }
}

