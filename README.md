# Zootopia

Una reserva natural nos ha pedido un sistema de gestión para el control de su fauna.

​

## Requisitos:

Un vista principal con un formulario de acceso a la zona de administración (El sistema será gestionado solo por un usuario administrador)
Si un usuario intenta loggearse y no utiliza la palabra clave correcta para acceder al sistema este deberá tener un feedback del sistema
Una vez loggeado el administrador visualizará el dashboard en el cual se debe reflejar la cantidad total de especies que hay actualmente en la reserva
El sistema deberá permitir añadir un nuevo ejemplar
Suprimir un ejemplar
Editar un ejemplar
Se deberá poder visualizar una lista de los ejemplares
La lista deberá tener paginación
Los ejemplares se podrán filtrar según la familía a la que pertenece o bien al país de origen.
​

## Familias mínimas requeridas:

- Félidos(León, Tigre, Leopardo, etc...)
- Cánidos (Zorro,Lobos,Chacales, etc...)
- Reptiles (Cocodrilos,Serpientes,Iguanas, etc...)
- Mustelids (Nútria,Comadrejas,Tejones, etc...)
- Leporidae (Conejos y Liebres)
​

Para el registro de cada ejemplar se deberá introducir los siguientes datos:

- Nombre
- Tipo
- Familia a la que pertece
- Género
- Fecha de ingreso
- Imagen (extra)
​

##Extra:

Cada ejemplar tendrá su foto
​

PD: El sistema de loggeo no utilizará spring security sino que se solicitará la palabra clave almacenada en la tabla users y se comprobará si coincide con la palabra clave almacenada en la store de Vue.

## Prototipo Versión Desktop
<img width="523" alt="desktop" src="https://user-images.githubusercontent.com/116891108/217948858-817bd8ff-624b-4af0-b877-075fd48b9287.png">

## Prototipo Versión Mobile

<img width="215" alt="movil" src="https://user-images.githubusercontent.com/116891108/217948877-30b73e6b-d5e2-469f-8cb8-a065065f8e2d.png">

## Producto final

<img width="944" alt="homeview" src="https://user-images.githubusercontent.com/116891108/217955916-2548827e-67d6-48a2-847b-905f53d7bf7f.png">

<img width="917" alt="dashboardview" src="https://user-images.githubusercontent.com/116891108/217955959-b0a7ce9e-a46c-4a31-a293-ebe7a013dc9b.png">

<img width="871" alt="addview" src="https://user-images.githubusercontent.com/116891108/217955996-aa9b3340-31f4-4db5-9f6e-520db63a2348.png">

![modifyview](https://user-images.githubusercontent.com/116891108/217956071-56c0d472-c1ed-47bd-9702-ef0df490d860.png)



## 📁 Accesos al proyecto
https://github.com/SaulAguinaga/Zootopia

https://jira-jehis.atlassian.net/jira/software/projects/ZOOT/boards/10/backlog
  
https://www.figma.com/file/wmJPn9zDxQ6XfHjsAkIWfw/ZOOPOLIS?node-id=0%3A1&t=P86roEpoN5Ve8tXp-0

# Diagramas

## Diagrama UML
<img width="323" alt="ej diagrama uml" src="https://user-images.githubusercontent.com/116891108/217953161-a96391a3-a243-4f51-a885-bc91c0343da7.png">

## Diagrama Base Datos 

![Diagrama-de-basesdedatos-reestructurado-mejor](https://user-images.githubusercontent.com/116891108/217953743-557048e9-f86d-41cc-a58a-9eb870cd9226.png)

## Diagrama UserFlow

![user flow zoo drawio](https://user-images.githubusercontent.com/116891108/217953885-f5ad960f-d334-4df7-8a4e-b2212e1ef340.png)


# :heavy_check_mark: Herramientas utilizadas:
- Figma
- Jira
- HTML5
- SASS (SCSS)
- JS
- VUE3
- Vite
- Pinia
- Java
- Maven
- Apache
- Tomcat
- Xamp
- MsQL
- Workbench
- Postman
- SpringBoot
- Vuetify

## Recommended IDE Setup

[VSCode](https://code.visualstudio.com/) + [Volar](https://marketplace.visualstudio.com/items?itemName=Vue.volar) (and disable Vetur) + [Vue Plugin (Volar)](https://marketplace.visualstudio.com/items?itemName=Vue.vscode-vue-plugin).

## Customize configuration

See [Vite Configuration Reference](https://vitejs.dev/config/).

## Project Setup

```sh
npm install
```

# frontend

This template should help get you started developing with Vue 3 in Vite.

For go to Frontend used this commands

```sh
cd src/main/frontend
```

For see on Server used this command

```sh
npm run dev
```
## Springboot

For install go to documentation : https://spring.io/

## Vuetify

For install go to documentation : https://vuetifyjs.com/en/

## Recommended IDE Setup

[VSCode](https://code.visualstudio.com/) + [Volar](https://marketplace.visualstudio.com/items?itemName=Vue.volar) (and disable Vetur) + [TypeScript Vue Plugin (Volar)](https://marketplace.visualstudio.com/items?itemName=Vue.vscode-typescript-vue-plugin).

## Customize configuration

See [Vite Configuration Reference](https://vitejs.dev/config/).

## Project Setup

```sh
npm install
```

### Compile and Hot-Reload for Development

```sh
npm run dev
```

### Compile and Minify for Production

```sh
npm run build
```

### Run Unit Tests with [Vitest](https://vitest.dev/)

```sh
npm run test:unit
```
# backend

  ```sh
mvn clean package
```
  
 ### Autores

- Product Owner => Guillermo J Trigueros Martin https://github.com/Guillermo292
- Scrum Master => Jehisel Ramos https://github.com/JehiselRuth
- Saúl Aguinaga https://github.com/SaulAguinaga
- David Daza https://github.com/drdaza
- Alicia Fernández https://github.com/alcfdez

