# Peppermint Mod ![candy cane](https://cdn.emojidex.com/emoji/seal/candy_cane.png "candy cane")

This is a Minecraft Forge Mod written in Java using the Forge MDK. All of the assets and code here are written by me but largely copied from online tutorials. Huge shout out to [Kaupenjoe on YouTube](https://www.youtube.com/channel/UCbzPhyLcO8VP25dZ7kaUyAw) as well as his samples saved in [GitHub](https://github.com/Tutorials-By-Kaupenjoe). Seriously, thank you.

I set this entire repo up using Visual Studio Code, so anything you see in here works for me on my machine. If you use Eclipse or IntelliJ then things might work a little differently for you.

## Using this Repo

It is a Gradle project and everything is created through the `./gradlew` gradle wrapper script. All of this was set up by the folks who created the Forge modding development kit. To see a list of all available gradle tasks you can run `./gradlew tasks` to see the tasks and to get help on a specific task you can run `./gradlew help --task <task-name>`. Here are some of the most important ones.

### Setting Up The Repo

In order for you to be able to run the local instance of your mod and test it out, you will need to run one of these commands at least once (depending on the IDE that you are using):

```bash
# For visual studio code
./gradlew genVSCodeRuns
# For intellij
./gradlew genIntellijRuns
# For eclipse
./gradlew genEclipseRuns
```

There are some other commands to run if you are not using Visual Studio Code. I did run `./gradlew eclipse` once because even if you do not use Eclipse, you might still need to do that.

### Testing The Mod

To launch a local instance of Minecraft with your mod fully loaded (assuming it actually builds) you will need to run:

```bash
./gradlew runClient
```

This will allow you to play Minecraft and verify that your mod does what you expect. You do not need to run `./gradlew build` in between doing `runClient`. Gradle will rebuild your mod every time you run the `runClient` command.

### Building The Mod

To build the mod and use it on a server somewhere, run:

```
./gradlew build
```

and your mod will compile to a `.jar` file located in `/build/libs/peppermintmod-#.#.#-#.#.jar` where the `#` represent the version string in the [build.gradle](./build.gradle) on what is now line 7.

### Downloading the Latest MDK Version

If you know that there is a newer version of the MDK available, you can run:

```bash
./download-mdk.sh <version>
```

where the `<version>` is the MDK version you wish to download.
