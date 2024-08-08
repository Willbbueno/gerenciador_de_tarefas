/*

App gerenciamento de tarefas

Requisitos:

- Adicionar uma nova tarefa

- Remover uma tarefa

- Listar as tarefas

- Marcar uma tarefa como concluída

- Filtrar tarefas por status (concluídas, não concluídas)

- Ordenar tarefas por prioridade (baixa, média, alta)

- Buscar tarefas por nome

- Atualizar a prioridade de uma tarefa

- Remover todas as tarefas

- Salvar as tarefas em um arquivo

- Ler as tarefas de um arquivo

- Estruturar a lista de tarefas usando uma estrutura de dados adequada (como lista, map, set, etc.)

- Implementar testes unitários para as funções

- Implementar a função de salvar e ler as tarefas de um arquivo

- Implementar a função de salvar e ler as tarefas de um arquivo usando JSON

- Implementar a função de salvar e ler as tarefas de um arquivo usando XML

- Implementar a função de salvar e ler as tarefas de um arquivo usando um formato binário

- Implementar a função de salvar e ler as tarefas de um arquivo usando um formato de texto

- Implementar a função de salvar e ler as tarefas de um arquivo usando um formato de dados binário



*/


class GerenciadorDeTarefas() {
        
    // Adicionar tarefa    
    private val listaDeTarefas: MutableList<Any> = mutableListOf()
    
    fun menuPrincipal(){

        println("Bem vindo ao Gerenciador de Tarefas!")
        println("Escolha uma opção:")
        println("1 - Adicionar tarefa")
        println("2 - Mostrar tarefas")
        println("0 - Sair")
        lerEntradaUsuario()
    }

    fun lerEntradaUsuario(){
        val entrada: String =  readLine() ?: ""
        when(entrada){
            "1" -> adicionarTarefa()    
            "2" -> mostrarTarefas()
            "0" -> if (entrada == "0") {
                return
            } else {
                println("Opção inválida!")
                menuPrincipal()
            }
        }

    // Adiciona tarefa
    }
fun adicionarTarefa() {
    while (true) {
        println("Adicione uma tarefa: ")
        val entrada: String = readLine() ?: ""
        listaDeTarefas.add(entrada)
        println("Tarefa adicionada com sucesso!")

        println("Digite 'sim' para adicionar uma nova tarefa ou qualquer tecla para voltar ao menu principal.")
        val novaTarefaOuSair: String = readLine()?.toLowerCase() ?: ""

        if (novaTarefaOuSair == "sim") {
            continue
        } else {
            menuPrincipal()
            break
        }
    }
}
   
    // Mostra tarefa

    fun mostrarTarefas() {
        if (listaDeTarefas.isEmpty()) {
            println("Nenhuma tarefa encontrada.")
            
        } else {
            
        println("Tarefas: $listaDeTarefas ")
        }
    }


}

fun main () {

    
    val gerenciador = GerenciadorDeTarefas()
    
    gerenciador.menuPrincipal()




}


