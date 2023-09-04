import models.Pessoa;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        painelInicial(scanner);
    }





        public static void painelInicial(Scanner scanner){

            System.out.println("Digite 1 para sessão do cliente");
            System.out.println("Digite 2 para sessão do evento");
            System.out.println("Digite 0 para sair");
            painelEscolha(scanner);

        }

        public static void painelEscolha(Scanner scanner){
            int opcao;
            do{
                opcao = scanner.nextInt();
                if(opcao == 1){
                    painelPessoa(scanner);

                }else if(opcao == 2){
                    System.out.println("Em desenvolvimento");
                    return;
                }
            }while(opcao != 0);

            System.out.println("Finish");
            System.exit(11);





        }

        //teste


        public static void painelPessoa(Scanner scanner){
            int opcao;
            do{
                System.out.println("1 - Cadastrar Pessoa");
                System.out.println("2 - Exibir Pessoas");
                System.out.println("0 - Para sair");
                opcao = scanner.nextInt();
                System.out.println("Opção: "+opcao);

                if (opcao == 1){
                    cadastraPessoa(scanner);

                } else if (opcao == 2) {
                    retornaPessoas().forEach(System.out::println);


                }
                else if(opcao == 0){
                    System.out.println("Finalizando....");
                    painelInicial(scanner);
                }

                else {
                    System.out.println("opção inválida");
                }



            }while(opcao != 0);







        }

        public static void cadastraPessoa(Scanner scanner){
            System.out.println("Digite seu nome: ");
            String nome = scanner.next();
            System.out.println("Digite seu e-mail");
            String email = scanner.next();
            Pessoa pessoa = new Pessoa();
            pessoa.setNome(nome);
            pessoa.setEmail(email);
            Pessoa.getPessoas().add(pessoa);
            System.out.println("Pessoa cadastrada com sucesso : "+"\n"+pessoa);

        }

        public static List<Pessoa> retornaPessoas(){
            return Pessoa.getPessoas();
        }
    }

