//accesing the elements of html
const passbox = document.getElementById("passbox");
const passLen = document.getElementById("passLen");
const lowerCase = document.getElementById("lowerCase");
const upperCase = document.getElementById("upperCase");
const number = document.getElementById("number");
const specialChar = document.getElementById("specialChar");
const genbtn = document.getElementById("genbtn");
const showPassLen = document.getElementById("showPassLen");

let passwordLength = 4;
passLen.onclick=()=>{
    showPassLen.innerText = passLen.value;
}

//if generate password is clicked then password will be created
genbtn.onclick=()=>{
    passwordLength=passLen.value;
    showPassLen.innerText = passwordLength;
    let password = genPassword(passwordLength);
    passbox.value = password;
}

//password generating function
const genPassword = (a)=>{
    const allLowerCase = "abcdefghijklmnopqrstuvwxyz";
    const allUpperCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    const allNumbers = "0123456789";
    const allspecialChar = "@#$%^&*";
    
    let createPass = "";
    let allChar ="";
    if(lowerCase.checked){
        allChar+=allLowerCase;
    }
    if(upperCase.checked){
        allChar+=allUpperCase;
    }
    if(number.checked){
        allChar+=allNumbers;
    }
    if(specialChar.checked){
        allChar+=allspecialChar;
    }

    for(let i=0;i<a;i++){
        let rand = Math.floor(Math.random()*allChar.length);
        createPass+=allChar.charAt(rand);
    }
    return createPass;
}