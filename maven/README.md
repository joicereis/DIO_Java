Neste diretório contém meu projeto maven.

COMANDOS:
- Criar de um projeto maven via linha de comando:
mvn archetype:generate -DgroupId=one.digitalinnovation -DartifactId=quick-start-maven -Darchetype=maven-archetype-quickstart -DinteractiveMode=false

É possível criar projetos com diferentes tipos de acrchetypes. Para isso, pesquise por 'maven archetype list' ou acesse os modeos disponíveis no site do Apache https://maven.apache.org/archetypes/maven-archetype-webapp/
https://mvnrepository.com/
https://gist.github.com/zbigniewTomczak/4235871

- Compilar de classes em um projeto maven
mvn compile

- Testar a aplicação
mnv test

- Empacotar o software criando o arquivo .jar
mnv package

- Limpar o diretório de trabalho - excluir a pasta target
mvn clean

