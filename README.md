# Jankenpon Game

Jankenpon (also known as Rock-Paper-Scissors) is a classic game played between two people where each player simultaneously forms one of three hand shapes representing rock, paper, or scissors. The outcome of the game is determined by the combination of the two shapes formed, with rock beating scissors, scissors beating paper, and paper beating rock.

This implementation of Jankenpon is built in plain Java and uses Maven for dependency management. It includes unit tests to ensure that the code functions correctly and is robust.

To play the game, the user is prompted to enter their choice of hand shape (rock, paper, or scissors) and the computer generates a random choice as the opponent. The outcome of the game is displayed, and the user can choose to play again or exit the game.

Jankenpon is a simple and fun game that can be played almost anywhere with just two people and no equipment needed. This implementation adds an extra layer of complexity by using Java, Maven, and unit testing to ensure the code is reliable and functional.

## Usage

```
# clone the project
git clone https://github.com/vpanarello/jankenpon.git
cd jankenpon

# execute the unit tests using Maven commandline
mvn test

# run the application
mvn compile exec:java -Dexec.mainClass="com.tyntec.jankenpon.Game"
```

## Contributing

Pull requests are welcome. For major changes, please open an issue first
to discuss what you would like to change.

Please make sure to update tests as appropriate.

## License

[MIT](https://choosealicense.com/licenses/mit/)