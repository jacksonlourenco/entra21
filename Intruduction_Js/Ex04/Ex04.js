//Faça uma pesquisa de satisfação utilizando confirm(). Pergunte ao usuário se ele está 
//satisfeito com o serviço ou produto. Com base na resposta, exiba uma mensagem de 
//agradecimento com alert() ou peça feedback adicional com prompt()

if(confirm("Você está satisfeito com o nosso serviço?")) {
    alert("Obrigado pelo seu feedback! Estamos felizes em saber que você está satisfeito.");
} else {
    alert("Lamentamos que você não esteja satisfeito. Agradecemos por nos informar.");
    const feedback = prompt("Por favor, nos diga como podemos melhorar:");
    alert("Agradecemos pelo seu feedback! Sua opinião é muito importante para nós.");
}