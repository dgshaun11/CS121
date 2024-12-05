package weekTwelve;
import java.io.FileNotFoundException;
import java.net.SocketOption;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Menu {
    Scanner scn = new Scanner(System.in);
    Pokedex pokedex = new Pokedex();

    public void displayMenu() {
        while (true) {
            System.out.println("********* MENU *********");
            System.out.println("Please make a selection: ");
            System.out.println("1) Add a Pokemon");
            System.out.println("2) Remove a Pokemon");
            System.out.println("3) Display Pokemon Info");
            System.out.println("4) Display All Pokemon Info");
            System.out.println("5) Exit");
            String input = scn.nextLine();
            if (input.equals("1")) {
                createPokemon();
            }

            if (input.equals("2")) {
                deletePokemon();
            }

            if (input.equals("3")) {
                displayPokemon();
            }

            if (input.equals("4")) {
                displayAllPokemon();
            }

            if (input.equals("5")) {
                break;
            }
        }
    }

    public void createPokemon(){
        String input ="";
        do{
            System.out.println("(1) Enter Pokemon details manually.");
            System.out.println("(2) Select Pokemon from a file");
            System.out.println("(3) Quit");
            int choice = Integer.parseInt(scn.nextLine());
            if (choice == 1){
                System.out.println("Enter Pokemon's name");
                String name = scn.nextLine();
                System.out.println("Enter Pokemon's HP");
                int hp = scn.nextInt();
                scn.nextLine();
                Pokemon pokemon = new Pokemon(name, hp);
                addMoveToPokemon(pokemon);
                pokedex.addPokemon(pokemon);
                System.out.println(pokemon.toString() + " Successfully added.");

            }
            else if (choice == 2){
                FileRead fileRead = new FileRead();
                ArrayList<String[]> pokemonData = new ArrayList<>();
                try{
                    pokemonData = fileRead.readPokemonData("CharacterStatsFile.txt");
                    if (pokemonData == null){
                        System.out.println("No Pokemon data available in file.");
                        return;
                    }
                    for (int i = 0; i < pokemonData.size(); i++){
                        System.out.println(i+1 + Arrays.toString(pokemonData.get(i)));
                    }
                    System.out.println("Select a Pokemon based on number.");
                    int fileChoice = scn.nextInt();
                    scn.nextLine();
                    if (fileChoice > 0 && fileChoice< pokemonData.size()+1){
                        String[] pokemonChoice = pokemonData.get(fileChoice-1);
                        String pokemonName = pokemonChoice[0];
                        int pokemonHP = Integer.parseInt(pokemonChoice[1]);
                        String pokemonMove = pokemonChoice[2];
                        int pokemonPower = Integer.parseInt(pokemonChoice[3]);
                        int pokemonSpeed = Integer.parseInt(pokemonChoice[4]);
                        Pokemon newPokemon = new Pokemon(pokemonName, pokemonHP);
                        Move move = new Move(pokemonMove, pokemonPower, pokemonSpeed);
                        newPokemon.addMove(move);
                        pokedex.addPokemon(newPokemon);
                        System.out.println("New pokemon succesfully added.");

                    }
                    else {
                        System.out.println("Invalid input.");
                    }

                } catch (FileNotFoundException e) {
                    throw new RuntimeException(e);
                }
            }
            else if (choice == 3){
                input = "q";
            }
            else {
                System.out.println("Invalid choice");
            }
        }while(!input.equals("q"));
    }
    private void addMoveToPokemon(Pokemon pokemon){
        String input = "";
        do{
            System.out.println("Enter a move name or enter 'q' to quit.");
            input = scn.nextLine();
            String moveName = input;
            System.out.println("Enter " + moveName +"'s power.");
            int movePower = scn.nextInt();
            scn.nextLine();
            System.out.println("Enter " + moveName + "'s speed.");
            int moveSpeed = scn.nextInt();
            scn.nextLine();
            Move move = new Move(moveName, movePower, moveSpeed);
            pokemon.addMove(move);
            break;
        } while(!input.equals("q"));
    }

    public void deletePokemon() {
        System.out.println("Enter name of Pokemon you want to delete: ");
        String name = scn.nextLine();
        Pokemon pokemon = pokedex.getPokemon(name);
        if (pokedex.getAllPokemon().contains(pokemon)) {
            pokedex.removePokemon(pokedex.getPokemon(name));
        }

        else {
            System.out.println("Pokemon not found.");
        }


    }

    public void displayPokemon() {
        System.out.println("Enter name of Pokemon to display info: ");
        String name = scn.nextLine();
        Pokemon pokemon = pokedex.getPokemon(name);

        if (pokedex.getAllPokemon().contains(pokemon)) {
            System.out.println(pokemon.toString());
        }

        else {
            System.out.println("Pokemon not found.");
        }

    }

    public void displayAllPokemon() {
        if (pokedex.getAllPokemon().size() == 0){
            System.out.println("There are no pokemon in the pokedex.");
        }
        for (Pokemon pokemon : pokedex.getAllPokemon()) {
            System.out.println(pokemon.toString());
            if (pokemon.getMoveArrayList().size() == 0){
                System.out.println("There are no moves for this pokemon.");
            }
            else {
                System.out.println(pokemon.getMoveArrayList());
            }
        }
    }
}
