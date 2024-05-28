
# 💻 Resumo da aula de Git e GitHub

## O que é versionamento de código? 🤔

Controlam as versões de um arquivo ao longo do tempo.

- Registra o histórico de atualizações de um arquivo;
- Gerencia quais foram as alterações, a data, autor, etc.;
- Organização, controle e segurança;

## VCS Centralizado(CVCS)
Ex: CVS, Subversion

Que tem o servidor que terá todos os arquivos de versão, conectados ao servidor.
<div align = "center"> 
    <img src = "https://github.com/Joicylara/Santander-Bootcamp-2024/assets/99670716/4800ef2b-a2bb-480f-8895-97be4bddba63" width = "500px" />
</div>

## 👎 Desvantagem do CVCS
Se ele ficar fora do ar, não consegue salvar ou colaborar alguma alteração, pode projetos se forem corrompido ao ser salvo, para resolver alguns problemas vinculados a isso, surgiu o Sistema de Controle de Versão Distribuido(DVCS).

## VCS Distribuído(DVCS)

Cada repositório, cada banco de versões é duplicado localmente.

<div align = "center"> 
    <img src = "https://github.com/Joicylara/Santander-Bootcamp-2024/assets/99670716/b0f5dc17-7ac2-41f6-a963-05149af49638" width = "500px" />
</div>

## 👍 Vantagens do DVCS

- Clona, o que possibilita o backup;
- Possibilita também um fluxo de trabalho flexível;
- Possibilidade de trabalhar sem conexão à rede;
Ex: Git e Mercurio

## Problemas sem o versionamento:
- Armazenamento;
- conflito de versão;
- busca;
## O que é Git? 🤔
É um sistema de controle de versão distribuido.

- Gratuito e Open Source;
- Ramificações(branching) e fusões(merging) eficientes;
- Leve e rápido;

## 📜 História do Git

2002- O projeto do núcleo(Kernel) do Linux, que é open source, começa a utilizar o BitKeeper, um DVCS proprietário;

2005- Após conflitos com a comunidade, o BitKeeper rescinde a licença gratuita. O que leva a Linux Torvalds, o criador do Linux, e sua equipe a desenvolverem sua própria ferramenta, o Git;

## Fluxo básico do git
    git clone: clona o repositório para um outro já existente.
    git commit: salvar
    git pull: pega as alterações remota p/ o local.
    git push: mandar as alterações local p/ o remoto.
    git remote add origin URL - serve para conectar o repositório local com o remoto.
    git status - estado do repositório
    touch -  comando do terminal p/ criar um arquivo vazio
    Untracked files - arquivo não rastreado
    gitkeep -  reconhece o arquivo vazio
    git log - histórico de commit

## O que é GitHub? 🤔
Plataforma de hospedagem de código para controle de versionamento com o git, e colaboração.
- Comunidade ativa;
- Utilizado mundialmente;
- Mascote "Octocat";

## 📜 Historico
2008- Desenvolvido por Chris Wanstrath, J. Hyett, Tom Preston-Werner e Scott Chacon.
2018- Vítima de um dos maiores ataques de DDoS(ataque distribuido de negação de serviço,sobrecarga do sistema); Comprado pela Microsoft Coporation por US$ 7,5 bilhões.

## Diferença de Git :x: GitHub

 Git o que controla o banco de versões e github o servidor que vai esta hospedando o código no repositório remoto.
 
<div align = "center"> 
    <img src = "https://github.com/Joicylara/Santander-Bootcamp-2024/assets/99670716/1db9a9b7-fe27-4cf4-bd85-de9ff0a1b125" width = "500px" />
</div>

## Criando e Clonando Repositórios

Existem duas formas de obter um repositório Git na sua máquina:

- Transformando um diretório local que não está sob controle de versão, num repositório Git;
- Clonando um repositório Git existente.

[Markdom](https://docs.github.com/pt/get-started/writing-on-github/getting-started-with-writing-and-formatting-on-github/quickstart-for-writing-on-github): linguagem de marcação simples.


## :leftwards_arrow_with_hook: Desfazendo alterações no repositório local

    git -rf .git: remover  o versionamento na pasta
    git restore nome-do-arquivo: restaurar algum arquivo da "arvore"
    git commit --amend -m "msg" : altera a mensagem do ultimo commit
    para sair daquela tela - esc + : +wq
    git reset --soft hash do commit : reseta o commit
    git reset --mixed hash do commit, diferente do soft que volta para a preparação de commitar, o mixed volta para ser adicionado, ou seja, um arquivo sem ser rastreado
    git reset --hard código hash do commit : deixa somente o commit selecionado
    git reflog : histórico mais detalhado
    

## :deciduous_tree: Trabalhando com branches
De maneira simplista, uma branch(em tradução, "ramo"), é uma ramificação do seu projeto. Testar novas funcionalidades sem afetar outras do projeto.
- É um ponteiro móvel para um commit no histórico do repositório;
- Quando você cria um nova branch a partir de outra existente, a nova se incia apontando para o mesmo commit da branch que estava quando foi criada.

        git merge: para juntar as branches
        git branch: listar as branches
        git branch -v: mostrar os ultimo commit de cada branch
        git branch -d nome-da-branch: deletar a branch
        git fetch origin main pega os arquivos do remoto.
        git diff nome-da-branches quer ver a diferença.
        git diff main origin/main
        git merge origin/main
  
Quando você quer baixar os arquivos remoto sem mesclar com a sua branch local, usar o *git fetch origin main*, para verificar o arquivo, comparar a diferença usar o *git diff* e o nome das branches, e se depois quiser junta na sua branch local, é só mesclar, usando o *git merge*.

Clonar um repositório que tem varias branches, porém vc só quer uma determinada branch

    git clone URL do repositório --branch nome-da-branch-que-deseja-clonar --single-branch

 Quando precisa criar uma nova branch mas não quer que a modificação vá junto, pra isso usar o *git stash*, que arquiva o arquivo
 
    git stash list: lista as modificações arquivadas

para desarquivar é usado *git stash pop* se quiser trazer a alteração e excluir a alteração mais recente ou *git stash apply* se quiser manter a alteração e trazer a que estava arquivada.
