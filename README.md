# antlr3-gradle-java21-example

An example ANTLR3 project, using Gradle (Kotlin DSL) and Java 21 for modern developer experience.

## Meta-Information

- Project name: `antlr3-gradle-java21-example`.
- Source package: `org.javabujin.example`.
- Gradle version: `8.10.2`.
- Java version: `21`.
- ANTLR version: `3.5.3`.
- StringTemplate version: `3.2.1`.

- The base project was generated using VSCode and the Gradle extension `vscjava.vscode-gradle`, version 3.16.2024102102.

## Useful Commands

### General Gradle Commands

- `./gradlew clean` - Clean the project.
- `./gradlew build` - Build the project.
- `./gradlew run` - Run the project.
- `./gradlew test` - Run the tests.

### ANTLR Commands

- `./gradlew generateGrammarSource` - Generate the ANTLR sources.
- `./gradle generateTestGrammarSource` - Generate the ANTLR test sources.
- `./gradlew generateSourceSetGrammarSource` - Generate the ANTLR source set sources.

## Notes

- ANTLR 3 grammars are placed in the `app/src/main/antlr` directory.

- New rules for building and using ANTLR 3 was added to the `app/build.gradle.kts` file.
  - The generated sources in the `build` directory is copied to the `app/src/main/java/${mainAntlrGeneratedSourcesPath}` directory.
  - Then, the original generated sources are deleted from the `build` directory.
  - An additional clean up rule is added to the `clean` task to remove the generated sources from the `app/src/main/java/${mainAntlrGeneratedSourcesPath}` directory (remove the whole directory).

- StringTemplate was added to the project dependencies as using it with Java 21 somehow causes trouble (i.e. the language server recognizes experimental StringTemplate of Java 21 instead of the ANTLR3 version).
  - If you are not using StringTemplate, you can remove it from the dependencies.
  - Otherwise, you can try adding `import org.antlr.stringtemplate.StringTemplate;` to the header of your generated parsers (using `@header`).
