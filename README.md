#### API FFCatalog  

Está é uma API REST criada usando o SpringBoot utilizando a linguagem java. Este curso é baseado nas aulas do curso da FullCycle e este projeto foi desenvolvido para meu desenvolvimento pessoal na linguagem java.

Este projeto foi desenvolvido, utilzando o Docker para tornar o desenvolvimento eficiente e previsível e o DDD(Domain Driven Desgin) que é um conjunto de princípios para projeto de software.

### DDD (Domain Driven Desgin)

É uma abordagem para desenvolvimento de sistemas de software complexos, em que:
- O foco está no domínio do sistema;
- Desenvolvedores e especialistas no negócio devem explorar esse domínio de forma colaborativa;
- Como resultado, eles devem se comunicar usando uma linguagem ubíqua, mas dentro de um contexto.

Segue o link mais informações:

Referência: https://engsoftmoderna.info/artigos/ddd.html

### Rodando a aplicação

Para executar o projeto basta apenas executar o comando:

```
    docker-compose up --build --force-recreate --no-deps
```

Ao executar o comando o projeto pode ser acessado em:

http://localhost:8080/

Acessando o terminal do container
OBS: para acessar o container é necessário o id do container, para isso podemos executar o comando docker ps

```
    docker exec -i -t container_id /bin/bash
```

### Rodando tests dentro do container
Ao acessar o container podemos executar os tests da aplicação usando o gradlew com os seguintes comandos:

```
./gradlew test
```

```
./gradlew clean test --info
```

Rodando um teste Específico

```
gradle -Dtest.single=CategoryTests test
```

### Visualização dos teste
Dentro da pasta build podemos acessar abrir o arquivo index.html dentro do navegador para visualizar os testes.