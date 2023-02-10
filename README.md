# Implementação do problema do produtor e consumidor em Java.

A sincronização entre processos concorrentes é quando um recurso compartilhado não se encontra pronto para ser utilizado pelos processos. 

Nesse caso, o processo que deseja acessar o recurso deverá ser colocado no estado de espera, até o recurso ficar pronto para o processamento. 

Este tipo de sincronização é chamado sincronização condicional.

Exemplos desse tipo de sincronização aparecem em qualquer operação onde existam processo gerando informações (Processo produtores) utilizadas por outros processo (Processo consumidores). 

Um exemplo clássico é a comunicação entre dois processos através de operações de gravação e leitura em um buffer. 

Nessa comunicação, um processo grava dados em um buffer, enquanto outro lê, concorrentemente, os dados do buffer. 

Os processos envolvidos devem estar sincronizados, de forma que um processo não tente gravar dados em um buffer cheio ou ler de um buffer vazio.

O programa implementa um Buffer de tamanho TamBuf, controlado por um contador Cont. Sempre que a variável Cont for igual a 0, significa que o Buffer está vazio e o processo Consumidor deve permanecer aguardando até que se grave um dado. 

Da mesma forma, quando a variável Cont for igual a tamanhoBuffer, significa que o buffer está cheio e o processo Produtor deve aguardar a leitura de um dado.
