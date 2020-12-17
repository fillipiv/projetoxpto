function validaLogin(){
    let userTxt = localStorage.getItem("userLogged")

    if(!userTxt){
        window.location = "index.html"
    }

    // Bloco que transforma o JSON para Objeto
    let user = JSON.parse(userTxt)
    //document.getElementById("dadosUser").innerHTML = user.name + " : " + user.email
    document.getElementById("dadosUser").innerHTML = `<b>${user.nome} </b> : (${user.email})`
    document.getElementById("imgUser").innerHTML = `<img src= ${user.linkfoto}>`
    buscarParceiros()    
}

function logout(){
    localStorage.removeItem("userLogged")
    window.location = "index.html"
}

function buscarParceiros() {
    //let id = document.getElementById("userId").value
    let user = document.getElementById("selUser")
    let id = user[user.selectedIndex].value

    fetch("http://localhost:8080/agente/top10/" + id)
        .then( res => tratarReposta(res))
}

function tratarReposta(res){
    if(res.status == "valido"){
        res.json().then(res => exibirDados(res))
    }else{
        document.getElementById("dadosParceiro").innerHTML = "Usuario não encontrado"
    }
}

function exibirDados(dados){
    let parceiro = dados.parceiros
    let tabela = "<table> <tr> <th>Id_Anuncio</th> <th>Descrição</th> <th>Valor</th> </tr>"

    if(parceiro.length == 0) {
        document.getElementById("dadosParceiro").innerHTML = "Este usuario não possui anuncios"
    }else{
        
        for(let i=0; i < parceiro.length; i++) {
            tabela = tabela + `<tr> <td>${parceiro[i].idParceiro}</td> <td>${parceiro[i].descricao}</td> <td>${parceiro[i].valor}</td> </tr>`
        }

        tabela = tabela + "</table>"
        document.getElementById("dadosParceiro").innerHTML = tabela
        
    }
         
}

function buscarParceiros() {
    fetch("http://localhost:8080/agente/listaagente")
        .then(res => res.json())
        .then(res => exibirParceiros(res))

}

function exibirParceiros(lista){
    let opcoes=''
    for(let i=0; i < lista.length; i++){
        opcoes = opcoes + `<option value = ${lista[i].idAgente}> ${lista[i].nomeAgente} </option>`
    
    }
    
    document.getElementById("parceiros").innerHTML = opcoes
}