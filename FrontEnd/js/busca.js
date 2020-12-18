function buscaTransacao(){
    let userTxt = localStorage.getItem("buscaLogged")

    let id = JSON.parse(userTxt)

    document.getElementById("nomeParceiro").innerHTML = `<p>${id.nomeAgente}</p>`;
    
    alert(nomeParceiro)

}

/* function buscarDados() {
 
    fetch("http://localhost:8080/agente/listaagentes")
        .then(res => res.json())
        .then(res => exibirDados(res))
}

function exibirDados(dados){
    let nome=''
    let volume=''
        
        nome = nome + `${dados.nomeAgente}`
        volume = volume + `${dados.volumeTransacional}`
        
        document.getElementById("dadosParceiro").innerHTML = nome + volume


} */