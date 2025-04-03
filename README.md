|Alunos|
<p>Arthur Zocal Ribeiro da Silva</p>
<p>Felipe Zocal Medes</p>  

## Projeto Task Manager

### Single Responsibility Principle
<p>  Princípio que estabelece que uma classe deve ter apenas uma única razão para se transformar, isto é, deve ter uma única responsabilidade individual e, consequentemente, uma única razão para se transformar.</p>

<p>Este princípio é utilizado ao longo do projeto na criação das Classes Tarefa, TaskManager e TaskPrinter, uma vez que são segmentadas com base na única função que devem desempenhar. A Classe que simboliza a Entidade Tarefa oferece a fundação para a criação de objetos dessa entidade e os métodos fundamentais para sua manipulação, além do método de impressão de um objeto específico com seus atributos ilustrados e o método de modificar o status de conclusão de cada tarefa registrada. Além disso, a classe TaskPrinter é encarregada de mostrar a impressão das Tarefas ao usuário através do console, possuindo métodos que realizam essa função. Neste contexto, apenas o método printTasks() tem a função única de imprimir um conjunto de Tarefas. 
</p>

<p>Por outro lado, a Classe TaskManager é encarregada apenas de métodos relacionados ao controle e gestão da Classe Task. Ela inclui os métodos addNewTask(), que adiciona novas Tarefas a um agrupamento, getAllTasks(), que retorna um conjunto de Tarefas ao local onde o método foi anteriormente chamado, e filterTaskByPriority(), que retorna um conjunto de Tarefas ao local onde o método foi previamente chamado, mas filtrando quais tarefas podem ser apresentadas para o usuário.</p>

### Open/Closed Principle
<p>Esse principio determina que uma classe, módulo ou função deve ser flexível para expansão, mas inalterável para alterações. Isso implica que o código deve possibilitar a inclusão de novas funcionalidades sem a necessidade de modificar o código já existente, minimizando as chances de erros e simplificando a manutenção.
</p>

<p>Este princípio é implementado no projeto através das Classes Tarefa, TaskManager e TaskPrinter, bem como das Interfaces MarkTaskInterface, PrintTaskInterface e TasksPrinterInterface. Portanto, as Classes e Interfaces estão completamente finalizadas no estágio atual do projeto, implementando os princípios do princípio e estando disponíveis para futuras expansões por outras classes, prevenindo assim conflitos em futuras alterações.</p>

### Liskov Substitution Principle

<p>O princípio estabelece que uma subclasse deve ser substituída pela sua classe principal sem comprometer o funcionamento adequado do programa. Isso implica que, quando se utiliza herança, a subclasse deve preservar as propriedades esperadas da superclasse, sem modificar suas normas fundamentais.</p>

<p>Este princípio é aplicado na Classe Tarefa, que implementa os métodos markTaskAsDone() e print das Interfaces MarkTaskInterface e PrintTaskInterface, respectivamente, seguindo as diretrizes previamente estabelecidas pelo Princípio de Liskov, sem a necessidade de alterar o código na substituição desses procedimentos. Da mesma forma, a Classe TaskPrinter aplica o mesmo conceito na execução do método printTasks(), da Interface TasksPrinterInterface, seguindo as mesmas diretrizes e possibilitando a troca de métodos sem a ocorrência de erros imprevistos.
</p>

### Interface Segregation Principle

<p>Este princípio determina que nenhuma classe deve ser compelida a recorrer a métodos que não emprega. Dito de outra forma, é preferível possuir várias interfaces específicas para cada necessidade do que uma interface única e caótica. Ele previne que classes sejam compelidas a implementar métodos que não são essenciais para seu funcionamento, favorecendo um código mais consistente e de fácil manutenção. Para uma aplicação eficaz, é aconselhável segmentar interfaces extensas em interfaces menores e mais especializadas, assegurando que cada classe implemente somente o que realmente necessita. Isso aprimora a adaptabilidade do sistema e diminui o vínculo entre os componentes.</p>

<p>Isso acontece na implementação da Inteface MarkTaskInterface, que conta apenas com o método markTaskAsDone(), que é usado pela Classe Task sem a necessidade de utilizar funcionalidades supérfluas. Este princípio é igualmente utilizado na Interface PrintTaskInterface, que inclui o método print(), uma funcionalidade incluída na Entidade Task. Assim também acontece na Interface TasksPrinterInterface, apenas com o método printTasks(), fornecido pela ClasseTaskPrinter, sem a exigência de possuir funcionalidades não utilizadas.</p>

### Dependence Inversion Principle

<p>O princípio determina que módulos de alto nível não devem ser dependentes de módulos de nível inferior, ambos devem ser dependentes de abstrações.  Ademais, as abstrações não precisam de detalhes, enquanto os detalhes devem se basear em abstrações.
 
 Este conceito incentiva a separação entre os elementos do sistema, tornando o código mais adaptável e simples de manter.  Ao invés de uma classe depender diretamente de outra classe tangível, ela deve estar atrelada a uma interface ou classe abstrata, possibilitando a substituição de implementações específicas sem alterar o código que as emprega.</p>

<p>Este princípio é utilizado na interação entre a Classe Main e a Classe TaskManager. Com o objetivo de invertir as dependências de ambas as classes, uma Interface é criada como uma ponte entre elas, permitindo a utilização do polimorfismo para determinar a Classe que será empregada.  Portanto, a classe Main não se vincula à Classe TaskManager, mas pode continuar a utilizar as funcionalidades essenciais desta, sem o perigo de conflitos surgirem quando o código sofrer futuras alterações.</p>
