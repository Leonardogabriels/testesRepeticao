import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String nome, sexo, estadoCivil;
        int idade;
        Double salario;

        do{
            System.out.println("informe seu nome: ");
            nome = scanner.nextLine();
           
            if (nome.length() <=3){
            System.out.println("Nome invalido ! digite um nome com mais de três caracteres.");
         }
        }while(nome.length() <=3 && nome.toLowerCase().equals(nome));
             System.out.println("Bem-vindo " + nome);

        do{
            System.out.println("informe sua idade: ");
            idade = scanner.nextInt();

            if (idade <0 || idade > 150){
            System.out.println("idade invalidade informe outra idade");
            }
        
        scanner.nextLine();
        } while(idade < 0 || idade > 150);
        System.out.println("idade: " + idade);

        do{
            System.out.println("informe seus salario: ");
            salario = scanner.nextDouble();

            if(salario <= 0){
            System.out.println("salario igual ou inferior a zero. informe um salario valido.");
            }

        }while(salario <0);
            System.out.println("Salario: " + salario);
        
        do{
            System.out.println("Informe seu sexo, (M) para masculino, (F) para feminino. ");
            sexo = scanner.next();

        if (!(sexo.equalsIgnoreCase("M") ||sexo.equalsIgnoreCase("F"))){
                 System.out.println("Letra invalida, informe outra letra.");
        }

        }while(!(sexo.equalsIgnoreCase("M") || sexo.equalsIgnoreCase("F")));
           
            if(sexo.equalsIgnoreCase("M"))
                 System.out.println("Sexo masculino");

            else
                System.out.println("Sexo Feminino");
        
        do{
            System.out.println("Informe seu estado cívil: informe (S)Solteiro, (C)Casado, (V)Viuvo ou (D)Divorciado: ");
            estadoCivil = scanner.next();

            if(!(estadoCivil.equalsIgnoreCase("S") || estadoCivil.equalsIgnoreCase("C") || estadoCivil.equalsIgnoreCase("V") || estadoCivil.equalsIgnoreCase("D"))){
                System.out.println("Letra informada é invalida. Informe outra letra. ");
            }

        }while (!(estadoCivil.equalsIgnoreCase("S") || estadoCivil.equalsIgnoreCase("C") || estadoCivil.equalsIgnoreCase("V") || estadoCivil.equalsIgnoreCase("D")));
            if(estadoCivil.equalsIgnoreCase("S")){
                System.out.println("Estado cívil: Solteiro");
            }
            else if(estadoCivil.equalsIgnoreCase("C")){
                System.out.println("Estado cívil: Casado");
            }
            else if(estadoCivil.equalsIgnoreCase("V")){
                System.out.println("Estado cívil: Viuvo");
            }
            else
                 System.out.println("Estado cívil: Divorciado");
            
            scanner.close();
            
    

        
    }
}
