// Exemplo simples de inserção de produtos
const produtos = [
  { nome: "Produto 1", preco: "R$ 49,90" },
  { nome: "Produto 2", preco: "R$ 79,90" },
  { nome: "Produto 3", preco: "R$ 99,90" },
];

const container = document.querySelector(".produtos");

produtos.forEach(produto => {
  const div = document.createElement("div");
  div.className = "produto";
  div.innerHTML = `<h3>${produto.nome}</h3><p>${produto.preco}</p>`;
  container.appendChild(div);
});
