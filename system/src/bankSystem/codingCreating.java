package bankSystem;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class codingCreating {
    public  int generation(){
        int numberAccount;
        Random random = new Random();// cria um gerador de numeros
        return numberAccount = 10000 + random.nextInt(90000);
       //random.nextInt(90000) => gera de 0 até 89999;
        // somando 10000, garante que o numero final esteja entre 10000 e 99999(5 dígitos);
        // isso evita numeros pequenos como 00123, que não seriam realistas num banco
    }

    public boolean birth(String dateText){

        //DateTimeFormatter.ofPattern("dd/MM/yyyy"): define o formato da data
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        //try-catch? É um bloco de código usado para "tentar" executar algo que pode dar erro,
         //e "capturar" esse erro caso aconteça.
        try {
                //LocalDate.parse(dateText, formatter): converte a String para LocalDate.
                LocalDate.parse(dateText, formatter);
                return true;
            } catch (Exception e) {
                return false;

            }




    }


}
