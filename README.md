
# 💻 Resumo da aula de Git e GitHub

## O que é versionamento de código? 🤔

Controlam as versões de um arquivo ao longo do tempo.

- Registra o histórico de atualizações de um arquivo;
- Gerencia quais foram as alterações, a data, autor, etc.;
- Organização, controle e segurança;

## VCS Centralizado(CVCS)
Ex: CVS, Subversion

Que tem o servidor que terá todos os arquivos de versão, conectados ao servidor.

## 👎 Desvantagem do CVCS
Se ele ficar fora do ar, não consegue salvar ou colaborar alguma alteração, pode projetos se forem corrompido ao ser salvo, para resolver alguns problemas vinculados a isso, surgiu o Sistema de Controle de Versão Distribuido(DVCS).

## VCS Distribuído(DVCS)

Cada repositório, cada banco de versões é duplicado localmente.

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

## O que é GitHub? 🤔
Plataforma de hospedagem de código para controle de versionamento com o git, e colaboração.
- Comunidade ativa;
- Utilizado mundialmente;
- Mascote "Octocat";

## 📜 Historico
2008- Desenvolvido por Chris Wanstrath, J. Hyett, Tom Preston-Werner e Scott Chacon.
2018- Vítima de um dos maiores ataques de DDoS(ataque distribuido de negação de serviço,sobrecarga do sistema); Comprado pela Microsoft Coporation por US$ 7,5 bilhões.

## Diferença de Git e GitHub

 Git o que controla o banco de versões e github o servidor que vai esta hospedando o código no repositório remoto.

## Criando e Clonando Repositórios

Existem duas formas de obter um repositório Git na sua máquina:

- Transformando um diretório local que não está sob controle de versão, num repositório Git;
- Clonando um repositório Git existente.

[Markdom](https://docs.github.com/pt/get-started/writing-on-github/getting-started-with-writing-and-formatting-on-github/quickstart-for-writing-on-github): linguagem de marcação simples.


