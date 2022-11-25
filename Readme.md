# Sistema para gestão de tarefas.
- Desenvolvido utilizando JPA e JSF.
- Utiliza PrimeFaces para a construção das paginas
- Banco de dados PostgreSQL configurado com docker compose.
—
Para o desenvolvimento do projeto primeiramente tive de me habituar com as tecnologias que iria trabalhar, assim nos primeiros dias do desafio foquei em estudar a construção de aplicações com JSF e sua integração com as ferramentas de persistência como o hibernate. Me deparei com um problema em encontrar materiais para estudo, visto que muitos deles eram antigos e defasados e não demonstravam muita coerência entre si, também enfrentei muitas dificuldades com problemas na hora de gerenciar as versões das bibliotecas e drivers.

Quando conseguir resolver os problemas com as versões das bibliotecas construí primeiramente um pequeno projeto apenas com JSF sem persistência de dados apenas para entender melhor o processo de construção das paginas bem como a injeção de dados por meio dos manegedBeans. Após construir algumas telas com armazenamento de dados em session comecei a trabalhar no projeto de fato, construí uma tela para listagem e outra para catalogo, linkei o banco de dados, fiz a entidade tarefa e comecei a criar os métodos para leitura e inserção no banco de dados.

Depois de estabelecer a comunicação entre as camadas da MVC encontrei algum problema o qual não consegui resolver. Portanto o projeto continua incompleto.