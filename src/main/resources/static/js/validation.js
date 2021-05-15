/**
 * 
 */
 
 function validaFormCadastro(){
   let errors = [];
   
   let cliente, valorInvestido, dataInicio, dataFim, nomeAnuncio
   
   cliente = document.getElementByName("cliente").value
   valorInvestido = document.getElementByName("investimentoDiario").value
   dataInicio = document.getElementByName("dataInicio").value
   dataFim = document.getElementByName("dataFim").value
   nomeAnuncio = document.getElementByName("nomeAnuncio").value
   
   if(cliente == ""){
     errors.push("O campo clientes está vazio")
   }
   if(valorInvestido == "" || valorInvestido < 0){
      errors.push("O campo valor Investido está vazio ou com valores negativos")
   }
   if(dataFim == "" || dataInicio == ""){
     errors.push("Os campos de data inicio e fim precisam ser preenchidos")
   }
   
   if(errors.length > 0){
   preventDefault();
     Alert("Há erros no formulário por favor corrija")
     Alert(errors)
   } else {
   return true
   }
   
 }