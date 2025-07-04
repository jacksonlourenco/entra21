if (confirm("Você deseja pedir uma pizza?")) {
    const sabor = prompt("Qual é o seu sabor de pizza favorito?");
    if (sabor) {
        alert(`Pedido confirmado! Sua pizza de sabor ${sabor} será preparada.`);
    } else {
        alert("Nenhum sabor selecionado. Pedido cancelado.");
    }
} else {
    alert("Pedido de pizza cancelado.");
}