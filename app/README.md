# Frontend

## Página inicial
![listagem](https://raw.githubusercontent.com/sinayra/surittec/master/images/inicio.png)

O arquivo __App.js__ renderiza o menu e a página que está atualmente selecionada. Inicialmente a página exibe todos os clientes cadastrados, exibindo opções para editar ou excluir.

### Editar
![editar](https://raw.githubusercontent.com/sinayra/surittec/master/images/editar.png)

Ao clicar em editar, na linha correspondente aparecem caixas de textos. A operação só é realizada quando o usuário pressiona o botão **Salvar**

### Excluir
![excluir](https://raw.githubusercontent.com/sinayra/surittec/master/images/excluir.png)

Ao clicar em excluir, a linha correspondente é excluída e a página realiza uma nova consulta para buscar os clientes que ainda estão cadastrados.

## Página de adição
![Campos disponíveis](https://raw.githubusercontent.com/sinayra/surittec/master/images/add2.png)

Os campos disponíveis para adicionar um novo cliente são nome e cpf.

![Formulário preenchido](https://raw.githubusercontent.com/sinayra/surittec/master/images/add1.png)
Os dados são salvos somente quando o usuário pressiona o botão de **Enviar**. Assim que um cliente é cadastrado, os campos do formulários se limpam para que seja possível uma nova adição.

![Tabela atualizada](https://raw.githubusercontent.com/sinayra/surittec/master/images/add3.png)
Ao voltar para a página inicial, a página carrega novamente os dados de todos os clientes.
