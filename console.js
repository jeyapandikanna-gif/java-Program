import { add, sub, mul } from "./calculator.js";

const num1 = document.getElementById("num1");
const num2 = document.getElementById("num2");
const result = document.getElementById("result");

function getValues() {
    return [
        Number(num1.value),
        Number(num2.value)
    ];
}

document.getElementById("addBtn").addEventListener("click", () => {
    const [a, b] = getValues();
    result.textContent = add(a, b);
});

document.getElementById("subBtn").addEventListener("click", () => {
    const [a, b] = getValues();
    result.textContent = sub(a, b);
});

document.getElementById("mulBtn").addEventListener("click", () => {
    const [a, b] = getValues();
    result.textContent = mul(a, b);
});