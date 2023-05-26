# Desafio Plataforma de Ensino

# Formação Desenvolvedor Moderno
## Módulo: Programação Moderna
### Capítulo: Herança e polimorfismo

<p> Você foi contratada(o) para criar um sistema de plataforma de ensino. Para isto você deve criar um programa para ler os dados das aulas de um curso, e em seguida mostrar a duração total do curso, que é a soma das durações de cada aula.</p>

<p> Cada aula pode ser um conteúdo em vídeo, ou então uma tarefa. Os dados de cada aula são:
Vídeo: título, url e duração em segundos
Tarefa: título, descrição e quantidade de questões </p>

<p> A duração (em segundos) de uma aula vídeo é a
própria duração do vídeo, e a duração de uma aula
tarefa é de cinco minutos por questão (exemplo: se a
tarefa possui 3 questões, então a duração da tarefa é
15 minutos).</p>
<p> Você deve representar os dados conforme modelo ao
lado. O método duration() na classe Lesson é um
método abstrato que retorna a duração da aula.</p>

<img src="https://github.com/vivianezzt/desafio_plataforma_de_ensino/blob/main/src/img/paltaforma_de_ensino.png">

<p> Você deve criar uma única lista do tipo
List<Lesson> para armazenar todas aulas. A
chamada do método duration() deve ser polimórfica.</p>

<img src="https://github.com/vivianezzt/desafio_plataforma_de_ensino/blob/main/src/img/pataforma.png">


### CRITÉRIOS DE AVALIAÇÃO (TODOS DEVEM ESTAR CORRETOS):
<ul>
	<li>Nomes de classes, atributos, métodos e argumentos respeitando o projeto, bem como as 			convenções
de nome para Java (classe com primeira letra maiúscula, e padrão "camel case" para atributos, variáveis
e métodos.</li>
	<li>Implementação correta da classe abstrata e das heranças com sobreposição do método 	abstrato.</li>
	<li>Programa principal contento apenas uma lista do tipo List<Lesson> para armazenar todas aulas.</li>
	<li>Comportamento do programa e resultado dos cálculos corretos.</li>
</ul>

<h3> CRÉDITOS &copy;</h3>
<h4> Este desafio foi proposto pelo Prof. <a href="https://www.instagram.com/devsuperior.ig/">Nélio Alves</a> no Módulo - Programação Moderna (JAVA)
</h4><a href="https://devsuperior.com.br/evento-sds">DEVSUPERIOR - Faça parte você támbem</a>
