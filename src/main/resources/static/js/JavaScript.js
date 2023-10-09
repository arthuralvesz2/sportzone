//!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
//Função para verificar se o cpf do usuario é valido!
//!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!

function validarCPF(cpf) {
    cpf = cpf.replace(/\D/g, ''); // Remove caracteres não numéricos
    if (cpf.length !== 11 || /^(.)\1+$/.test(cpf)) {
        return false;
    }

    let soma = 0;
    for (let i = 0; i < 9; i++) {
        soma += parseInt(cpf.charAt(i)) * (10 - i);
    }
    let resto = 11 - (soma % 11);
    let digito1 = resto === 10 || resto === 11 ? 0 : resto;

    soma = 0;
    for (let i = 0; i < 10; i++) {
        soma += parseInt(cpf.charAt(i)) * (11 - i);
    }
    resto = 11 - (soma % 11);
    let digito2 = resto === 10 || resto === 11 ? 0 : resto;

    return cpf.charAt(9) == digito1 && cpf.charAt(10) == digito2;
}

function validarFormulario() {
    const cpfInput = document.getElementById('cpf');
    const cpf = cpfInput.value;

    if (!validarCPF(cpf)) {
        alert('CPF inválido! Por favor, insira um CPF válido.');
        cpfInput.focus();
        return false;
    }

    return true;
}

//!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
//Pra deixar o cpf com o formato certo!
//!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!

function formatarCPF(cpf) {
    const input = document.getElementById('cpf');
    let value = input.value.replace(/\D/g, ''); // Remove caracteres não numéricos

    if (value.length >= 3) {
        value = value.slice(0, 3) + '.' + value.slice(3);
    }
    if (value.length >= 7) {
        value = value.slice(0, 7) + '.' + value.slice(7);
    }
    if (value.length >= 11) {
        value = value.slice(0, 11) + '-' + value.slice(11);
    }

    input.value = value;


}

//!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
//Verificar se as senhas são iguais!
//!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!

function verificarSenhas() {
    const senha1 = document.getElementById('senha').value;
    const senha2 = document.getElementById('senha2').value;
    const mensagemSenha = document.getElementById('mensagemSenha');

    if (senha1 === senha2) {
        mensagemSenha.textContent = '';
    } else {
        mensagemSenha.textContent = 'As senhas não coincidem. Por favor, verifique.';
    }
}

//!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
//Adicionar automaticamente as / do campo de data de nascimento!
//!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!

function formatarData() {
    const input = document.getElementById('datanasc');
    let value = input.value.replace(/\D/g, ''); // Remove caracteres não numéricos

    if (value.length > 2) {
        value = value.slice(0, 2) + '/' + value.slice(2);
    }
    if (value.length > 5) {
        value = value.slice(0, 5) + '/' + value.slice(5, 9);
    }

    input.value = value;

}

//!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
//deixar o campo telefone com o formato certo!
//!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!

function formatarTelefone() {
    const telefoneInput = document.getElementById('tele');
    let telefone = telefoneInput.value.replace(/\D/g, ''); // Remove caracteres não numéricos

    // Formata o telefone no formato "(00) 00000-0000"
    if (telefone.length >= 2) {
        telefone = `(${telefone.slice(0, 2)}) ${telefone.slice(2)}`;
    }
    if (telefone.length >= 10) {
        telefone = telefone.slice(0, 10) + '-' + telefone.slice(10);
    }


    telefoneInput.value = telefone;
}

//!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
//Mensagem após concluir o formulário!
//!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!

function formconcluido() { alert("Mensagem enviada!"); }