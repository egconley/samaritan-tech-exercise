# Samaritan Pokedex Android Technical Exercise

[link to assignment](https://gist.github.com/ragar90/40c1f2fb4a67812d7097e5ad19d6c5e0)

## Exercise Description
Create an app that simulates a mini pokedex using [The open Pokemon API](https://pokeapi.co/)

## Requirements and Development Goals
- [X] 1. Hard code a list of 7 pokemon those will be your starter pokemon team, feel free to use any pokemon.
- [X] 2. Render the list of 7 pokemon in a `RecyclerView` and use `ConstraintLayout` to display the ui of each pokemon.
- [X] 3. **Bonus Feature:** Implement a filter search bar on top of the pokemon list to filter your pokemon team by name
- [X] 4. When a pokemon is clicked it should show the detail view of the selected pokemon.
   * Use `ConstraintLayout` to render the detail data of that pokemon
   * **Bonus Feature:** Use `CoordinatorLayout` and `CollapseAppBarLayout` to create a parallax effect when scrolling
- [X] 5. Connect Pokedex Client App to [The open Pokemon API](https://pokeapi.co/) using Retro fit
   * Generate a list of 7 random different numbers between 1-151. These numbers corresponds to `pokemon_numbers`
   * Fetch the pokemon using those `pokemon_numbers` to call the endpoint `https://pokeapi.co/api/v2/pokemon/{pokemon_number}/`

- [X] 6. **Bonus Feature:** Implement a menu with two options.
   * Generate new Random Team: Generate a new Team of 7 different pokemons, fetch their data and render them in the list replacing the old team of pokemon
   * Show Notification:  When this option is selected it should show a notifcation with an image and a `Hello Pokemon` message
