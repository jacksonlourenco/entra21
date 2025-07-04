const num1 = prompt("Digite o primeiro número inteiro:");
const num2 = prompt("Digite o segundo número inteiro:");

if(num1 % num2 == 0){   
    alert(`O número ${num1}` + " é divisível por " + num2);
} else {
    alert("O número " + num1 + " não é divisível por " + num2);
}