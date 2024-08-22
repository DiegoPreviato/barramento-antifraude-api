# barramento-antifraude-api

Esse projeto tem como objetivo ser um barramento para chamadas à um servidor local que contém os seguintes endpoints:
1. /credit/transaction
2. /credit/advice
3. /debit/transaction
4. /debit/advice

Os endpoints transaction são sincronos e tem um timeout definido em 2 segundos, caso ultrapasse esse tempo de processamento um status 200 será retornado com o status padrão 'DENIED'
Caso um bad request ocorra um status 200 será retornado com o status padrão 'DENIED-1'

Os endpoints de advice processam de maneira assincrona, assim que iniciado o processamento um código 202 - Accept é retornado para o chamados

a. Existem exemplos de try catch manipulando o código http e o body de resposta
b. Exite gravação de log info e erro
c. O projeto utiliza lombook para gerar os gets, sets e constructors automaticamente
d. Projeto futuro é gravar as requisições em um banco de dados