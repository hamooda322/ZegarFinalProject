import java.util.*;

class Main {

  static double multiply(double first, double second) {
    return first * second;
  }

  static double divide(double first, double second) {
    return first / second;
  }

  static double add(double first, double second) {
    return first + second;
  }

  static double subtract(double first, double second) {
    return first - second;
  }

  static double sqRoot(double number) {
    return Math.sqrt(number);
  }

  static double exponentialNum(double first, double second) {
    return Math.pow(first, second);
  }

  static void prompt() {
    System.out.println("\nEnter either multiply (M), divide (D), add (A), subtract (S), square root (R), exponential (E), or (Q) to quit:");
  }
  public static void main(String[] args) {
    Vector<String> history = new Vector<String>();
    int currFavorite = 0;
    boolean favorite = false;
    double result = 0;
    
    System.out.println("Welcome To My Virtual Calculator!");

    prompt();

    Scanner inputScanner = new Scanner(System.in);
    char input = inputScanner.next().charAt(0);
    
    while (input != 'Q' && input != 'q') {
      if (input == 'M' || input == 'm') {
        System.out.print("\nEnter two numbers to multiply:");
        if (history.size() != 0) {
          System.out.print(" If you would like to use previous result enter Y or any other key otherwise.");
        }
        System.out.print("\n");
        double first = 0;
        if (history.size() != 0) {
          input = inputScanner.next().charAt(0);
          if (input == 'Y' || input == 'y') {
            System.out.print("You chose Y, enter a second number:");
            first = result;
          }
          else {
            System.out.print("You did not choose Y. Enter two numbers:");
            first = inputScanner.nextDouble();
          }
        }
        else {
          first = inputScanner.nextDouble();
        }
        double second = inputScanner.nextDouble();
        result = multiply(first, second);
        String resultString = first + " * " + second + " = " + result;
        history.add(resultString);
        System.out.print("Result: ");
        System.out.println(result);
      }
      else if (input == 'D' || input == 'd') {
         System.out.print("\nEnter two numbers to divide:");
        if (history.size() != 0) {
          System.out.print(" If you would like to use previous result enter Y or any other key otherwise.");
        }
        System.out.print("\n");
        double first = 0;
        if (history.size() != 0) {
          input = inputScanner.next().charAt(0);
          if (input == 'Y' || input == 'y') {
            System.out.print("You chose Y, enter a second number:");
            first = result;
          }
          else {
            System.out.print("You did not choose Y. Enter two numbers:");
            first = inputScanner.nextDouble();
          }
        }
        else {
          first = inputScanner.nextDouble();
        }
        double second = inputScanner.nextDouble();
        result = divide(first, second);
        String resultString = first + " / " + second + " = " + result;
        history.add(resultString);
        System.out.print("Result: ");
        System.out.println(result);
      }
      else if (input == 'A' || input == 'a') {
         System.out.print("\nEnter two numbers to add:");
        if (history.size() != 0) {
          System.out.print(" If you would like to use previous result enter Y or any other key otherwise.");
        }
        System.out.print("\n");
        double first = 0;
        if (history.size() != 0) {
          input = inputScanner.next().charAt(0);
          if (input == 'Y' || input == 'y') {
            System.out.print("You chose Y, enter a second number:");
            first = result;
          }
          else {
            System.out.print("You did not choose Y. Enter two numbers:");
            first = inputScanner.nextDouble();
          }
        }
        else {
          first = inputScanner.nextDouble();
        }
        double second = inputScanner.nextDouble();
        result = add(first, second);
        String resultString = first + " + " + second + " = " + result;
        history.add(resultString);
        System.out.print("Result: ");
        System.out.println(result);
      }
      else if (input == 'S' || input == 's') {
         System.out.print("\nEnter two numbers to subtract:");
        if (history.size() != 0) {
          System.out.print(" If you would like to use previous result enter Y or any other key otherwise.");
        }
        System.out.print("\n");
        double first = 0;
        if (history.size() != 0) {
          input = inputScanner.next().charAt(0);
          if (input == 'Y' || input == 'y') {
            System.out.print("You chose Y, enter a second number:");
            first = result;
          }
          else {
            System.out.print("You did not choose Y. Enter two numbers:");
            first = inputScanner.nextDouble();
          }
        }
        else {
          first = inputScanner.nextDouble();
        }
        double second = inputScanner.nextDouble();
        result = subtract(first, second);
        String resultString = first + " - " + second + " = " + result;
        history.add(resultString);
        System.out.print("Result: ");
        System.out.println(result);
      }
      else if (input == 'R' || input == 'r') {
         System.out.print("\nEnter a number to find its root:");
        if (history.size() != 0) {
          System.out.print(" If you would like to use previous result enter Y or any other key otherwise.");
        }
        System.out.print("\n");
        double number = 0;
        if (history.size() != 0) {
          input = inputScanner.next().charAt(0);
          if (input == 'Y' || input == 'y') {
            number = result;
            System.out.println("You chose Y. Computing results root...");
          }
          else {
            System.out.println("You did not choose Y. Enter a new to compute its root.");
            number = inputScanner.nextDouble();
          }
        }
        else {
          number = inputScanner.nextDouble();
        }
        result = sqRoot(number);
        String resultString = "sqrt(" + number + ") = " + result;
        history.add(resultString);
        System.out.print("Result: ");
        System.out.println(result);
      }
      else if (input == 'E' || input == 'e') {
         System.out.print("\nEnter a number and a power:");
        if (history.size() != 0) {
          System.out.print(" If you would like to use previous result enter Y or any other key otherwise.");
        }
        System.out.print("\n");
        double first = 0;
        if (history.size() != 0) {
          input = inputScanner.next().charAt(0);
          if (input == 'Y' || input == 'y') {
            System.out.print("You chose Y, enter the power:");
            first = result;
          }
          else {
            System.out.print("You did not choose Y. Enter a number and a power:");
            first = inputScanner.nextDouble();
          }
        }
        else {
          first = inputScanner.nextDouble();
        }
        double second = inputScanner.nextDouble();
        result = exponentialNum(first, second);
        String resultString = first + "^" + second + " = " + result;
        history.add(resultString);
        System.out.print("Result: ");
        System.out.println(result);
      }
      else {
        System.out.println("\nInvalid character for operation. Enter a new character.");
      }

      System.out.println("\nHistory:");
      for (int all = 0; all < history.size(); ++all) {
        System.out.println(history.get(all));
      }

      
      if (favorite == true) {
        System.out.println("\nWould you like to change favorite equation in history? Enter Y for yes or any other character for no");
        input = inputScanner.next().charAt(0);
        if (input == 'Y' || input == 'y') {
          System.out.println("Enter favorite equation in history. Choose according to row. For example, if there is only one equation, that is at row number 1");
          currFavorite = inputScanner.nextInt();
        }
        if (currFavorite <= history.size() && currFavorite > 0) {
          System.out.print("\nFavorite Equation in History: ");
          System.out.println(history.get(currFavorite - 1));
        }
        else {
          System.out.print("\nFavorite Equation in History: ");
          System.out.println(history.get(0));
        }
      }
      else {
        System.out.println("\nEnter favorite equation in history. Choose according to row. For example, if there is only one equation, that is at row number 1");
        currFavorite = inputScanner.nextInt();
        favorite = true;
        if (currFavorite <= history.size() && currFavorite > 0) {
          System.out.print("\nFavorite Equation in History: ");
          System.out.println(history.get(currFavorite - 1));
        }
        else {
          System.out.println("\nFavorite Equation in History: ");
          System.out.println(history.get(0));
        }
      }  
      
      prompt();
      
      input = inputScanner.next().charAt(0);
    }
    inputScanner.close();
    System.out.println("\nThank You For Using My Virtual Calculator!\nGoodbye!");
  }
}