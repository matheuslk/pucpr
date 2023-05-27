import java.util.Scanner;

public class App {
  public static void main(String[] args) throws Exception {
    Scanner scan = new Scanner(System.in);

    List list = new List();
    String option = "1";
    while (option.equals("1") || option.equals("2") || option.equals("3")
        || option.equals("4") || option.equals("5") || option.equals("6")
        || option.equals("7")) {

      clearConsole();
      System.out.println("[1] - Inserir nó no início");
      System.out.println("[2] - Inserir nó após um nó específico");
      System.out.println("[3] - Inserir nó no final");
      System.out.println("[4] - Remover nó no início");
      System.out.println("[5] - Remover nó específico");
      System.out.println("[6] - Remover nó no final");
      System.out.println("[7] - Mostrar nós");
      System.out.println("[OBS] - Insira qualquer outra tecla para sair\n");
      System.out.print("Escolha uma opção: ");
      option = scan.next();
      clearConsole();

      if (option.equals("1")) {
        System.out.print("Digite o valor a ser inserido: ");
        int value = scan.nextInt();
        list.setFirst(value);
      }

      else if (option.equals("2")) {
        System.out
            .print("Digite a posição do nó anterior ao que será inserido: ");
        int value = scan.nextInt();
        System.out.print("\n");

        Node previousNode = list.findNodeByIndex(value);

        if (previousNode != null) {
          System.out.print("Digite o valor a ser inserido: ");
          value = scan.nextInt();
          list.setAfter(previousNode, value);
        } else {
          System.out.println("Nó anterior não encontrado.");
        }
      }

      else if (option.equals("3")) {
        System.out.print("Digite o valor a ser inserido: ");
        int value = scan.nextInt();
        list.setLast(value);

      }

      else if (option.equals("4")) {
        list.removeFirst();
      }

      else if (option.equals("5")) {
        System.out.print("Digite a posição do nó que deseja remover: ");
        int value = scan.nextInt();
        System.out.print("\n");

        Node node = list.findNodeByIndex(value);

        if (node != null) {
          list.remove(node);
        } else {
          System.out.println("Nó não encontrado.");
        }
      }

      else if (option.equals("6")) {
        list.removeLast();
      }

      else if (option.equals("7")) {
        System.out.println("Nós da lista:\n");
        list.list();
      }

      else {
        break;
      }

      System.out.print("\n[OBS] - Insira qualquer tecla para continuar: ");
      scan.next();
    }
  }

  private static void clearConsole() throws Exception {
    // Clear console in Windows, Linux and MacOS
    if (System.getProperty("os.name").contains("Windows")) {
      new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
    } else {
      Runtime.getRuntime().exec("clear");
    }
  }
}
