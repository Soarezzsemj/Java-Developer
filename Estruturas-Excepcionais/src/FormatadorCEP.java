public class FormatadorCEP {

public static void main(String[] args) {

    try{
    String cepFormatado = formatarCep("23765064");
    } catch(CepInvalidoException e){
        e.printStackTrace();
        System.out.println("CEP invalido, deve conter 8 digitos");
    }
}

static String formatarCep(String cep) throws CepInvalidoException{
        if(cep.length() != 8)
          throw new CepInvalidoException();
        
          //simulando um cep formatado
          return "23.765-064";
    }
}


