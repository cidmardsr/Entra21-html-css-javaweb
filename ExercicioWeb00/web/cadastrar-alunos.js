function validarFormulario(){
    if(validarCampoNome() == false || validarCampoMatricula == false || validarCampoNota1 == false 
            || validarCampoNota2 == false || validarCampoNota3 == false || validarCampoFrequencia == false){
        event.preventDefault();
    }
}

function validarCampoNome(){
    var nome = document.getElementById("campo-nome").value;
    var qtdCaracteres = nome.length;
    
    apagarElementoSeExistir("span-campo-nome-menor-8");
    
    apagarElementoSeExistir("span-campo-nome-maior-71");
    
    if(qtdCaracteres < 8){
        gerarSpan(
                "span-campo-nome-menor-8",
                "O nome do aluno deve conter ao menos oito caracteres",
                "div-campo-nome"
        );
        
        adicionarClasse("campo-nome", "border-danger");
        apagarClasse("campo-nome", "border-success");
        
        return false;
    }else if(qtdCaracteres > 71){
        gerarSpan(
                "span-campo-nome-maior-71",
                "O nome do aluno não pode exceder 71 caracteres",
                "div-campo-nome"
        );

        adicionarClasse("campo-nome", "border-danger");
        apagarClasse("campo-nome", "border-success");
        
        return false;
                
    }else{
        adicionarClasse("campo-nome", "border-success");
        apagarClasse("campo-nome", "border-danger");
        return true;
    }
}

function validarCampoMatricula(){
    apagarElementoSeExistir("span-campo-codigo-da-matricula-menor-0");
    var codigoDaMatricula = document.getElementById("campo-codigo-da-matricula").value;
    
    if(codigoDaMatricula < 0){
        gerarSpan(
                "span-campo-codigo-da-matricula-menor-0",
                "O código da matrícula do aluno deve ser positivo",
                "div-campo-codigo-da-matricula"
    );
    
    adicionarClasse("campo-codigo-da-matricula", "border-dager");
    apagarClasse("campo-codigo-da-matricula", "border-success");
    
    return false;
    
    }else{
        adicionarClasse("campo-codigo-da-matricula", "border-success");
        apagarClasse("campo-codigo-da-matricula", "border-danger");
        
    return true;
    }
}

function validarNota1(){
    apagarElementoSeExistir("span-campo-nota1-menor-0");
    apagarElementoSeExistir("span-campo-nota1-maior-10");
    var nota1 = parseFloat(document.getElementById("campo-nota-1").value);
    
    if(nota1 < 0){
        gerarSpan(
                "span-campo-nota1-menor-0",
                "A nota do aluno deve ser positiva",
                "div-campo-nota-1");
                
        adicionarClasse("campo-nota-1", "border-danger");
        apagarClasse("campo-nota-1", "border-success");
        
        return false;
                
    }else if(nota1 > 10){
        gerarSpan(
                "span-campo-nota1-maior-10",
                "A nota do aluno não pode ser maior que 10",
                "div-campo-nota-1");
                
        adicionarClasse("campo-nota-1", "border-danger");
        apagarClasse("campo-nota-1", "border-success");
        
        return false;
        
    }else{
        adicionarClasse("campo-nota-1", "border-success");
        apagarClasse("campo-nota-1", "border-danger");
        
        return true;
    }
            
}

function validarNota2(){
    apagarElementoSeExistir("span-campo-nota2-menor-0");
    apagarElementoSeExistir("span-campo-nota2-maior-10");
    var nota2 = parseFloat(document.getElementById("campo-nota-2").value);
    
    if(nota2 < 0){
        gerarSpan(
                "span-campo-nota2-menor-0",
                "A nota do aluno deve ser positiva",
                "div-campo-nota-2");
                
        adicionarClasse("campo-nota-2", "border-danger");
        apagarClasse("campo-nota-2", "border-success");
        
        return false;
    }else if(nota2 > 10){
        gerarSpan(
                "campo-nota2-maior-10",
                "A nota do aluno não pode ser maior que 10",
                "div-campo-nota-2");
                
        adicionarClasse("campo-nota-2", "border-danger");
        apagarClasse("campo-nota-2", "border-success");
        
        return false;
    }else{
        adicionarClasse("campo-nota-2", "border-success");
        apagarClasse("campo-nota-2", "border-danger");
        
        return true;
    }
}

function validarNota3(){
    apagarElementoSeExistir("campo-nota3-menor-0");
    apagarElementoSeExistir("campo-nota3-maior-10");
    var nota3 = parseFloat(document.getElementById("campo-nota-3").value);
    
    if(nota3 < 0){
        gerarSpan(
                "campo-nota3-menor-0",
                "A nota do aluno deve ser positiva",
                "div-campo-nota-3");
                
        adicionarClasse("campo-nota-3", "border-danger");
        apagarClasse("campo-nota-3", "border-success");
        
        return false;
    }else if(nota3 > 10){
        gerarSpan(
                "campo-nota3-maior-10",
                "A nota do aluno não pode ser maior que 10",
                "div-campo-nota-3");
                
        adicionarClasse("campo-nota-3", "border-danger");
        apagarClasse("campo-nota-3", "border-success");
        
        return false;
        
    }else{
        adicionarClasse("campo-nota-3", "border-success");
        apagarClasse("campo-nota-3", "border-danger");
        
        return true;
    }
}

function validarFrequencia(){
    apagarElementoSeExistir("campo-frequencia-menor-0");
    apagarElementoSeExistir("campo-frequencia-maior-100");
    var frequencia = parseByte(document.getElementById("campo-frequencia").value);
    
    if(frequencia < 0){
        gerarSpan(
                "span-campo-frequencia-menor-0",
                "A frequencia do aluno não pode ser negativa",
                "div-campo-frequencia");
                
        adicionarClasse("campo-frequencia", "border-danger");
        apagarClasse("campo-frequencia", "border-success");
        
        return false;
        
    }else if(frequencia > 100){
        gerarSpan(
                "span-campo-frequencia-maior-100",
                "A frequência do aluno não pode ser maior que 100",
                "div-campo-frequencia");
                
        adicionarClasse("campo-frequencia", "border-danger");
        apagarClasse("campo-frequencia", "border-success");
        
        return false;
        
    }else{
        adicionarClasse("campo-frequencia", "border-success");
        apagarClasse("campo-frequencia", "border-success");
        
        return true;
        
    }
}

function apagarClasse(id, classeCor){
    document.getElementById(id).classList.remove(classeCor);
}

function adicionarClasse(id, classeCor){
    document.getElementById(id).classList.add(classeCor);
}

function apagarElementoSeExistir(id){
    if(documento.contains(document.getElementById(id))){
        document.getElementById(id).remove();
    }
}

function gerarSpan(id, texto, idPai){
    var span = document.createElement("span");
    span.id = id;
    span.textContent = texto;
    span.classList.add("text-dager");
    span.classList.add("font-weight-bold");
    document.getElementById(idPai).appendChild(span);
}