const cep = document.getElementById('cep');
const logradouro = document.getElementById('logradouro');
const bairro = document.getElementById('bairro');
const cidade = document.getElementById('cidade');
const estado = document.getElementById('estado');

function removerLetras(cep) {
    return cep.replace(/\D/g, '');
}

function limparCampos() {
    logradouro.value = '';
    bairro.value = '';
    cidade.value = '';
    estado.value = '';
}

cep.addEventListener('input', () => {
    let cepValue = cep.value;
    cepValue = removerLetras(cepValue);

    if (cepValue.length === 8) {
        limparCampos();
        return;
    }
})

fetch(`https://viacep.com.br/ws/${cep}/json/`)
    .then(response => response.json())
    .then(data => {
        if (data.erro) {
            alert('CEP não encontrado.');
        } else {
            logradouro.value = data.logradouro;
            bairro.value = data.bairro;
            cidade.value = data.localidade;
            estado.value = data.uf;
        }
    })
    .catch(error => {
        console.error('Erro ao buscar CEP:', error);
        alert('Erro ao buscar CEP. Tente novamente mais tarde.');
    });

