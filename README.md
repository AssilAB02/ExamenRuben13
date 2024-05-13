# Examen Ruben 13/5/2024

# Link Repositorio:

## Entregas 1 y 2: Patrones de Construcción y Estructuración

### Descripción General

En estas dos entregas, nos centramos en dos aspectos fundamentales del desarrollo del sistema:

1. **Patrones de Construcción:**
   - Utilizamos el patrón Factory Method para crear diferentes tipos de medios digitales, como libros, revistas y periódicos.
   - Implementamos el patrón Builder para facilitar la creación de medios digitales con configuraciones complejas.


#### Funcionamiento del Factory Method

El Factory Method permite crear objetos sin especificar la clase exacta del objeto que se creará. 

1. **Interfaz Media:** Define el comportamiento de los medios digitales, como `displayInfo()`.
   
2. **Clases concretas:** Implementan la interfaz Media y representan tipos específicos de medios digitales, como libros, revistas y periódicos.
   
3. **Interfaz MediaCreator:** Declara el método `createMedia()` que las fábricas concretas deben implementar.
   
4. **Fábricas concretas:** Implementan la interfaz MediaCreator y proporcionan la lógica para crear instancias de medios digitales específicos.

### Contenido de las Entregas

#### Entrega 1: Patrones de Construcción

- **Factory Method:**
  - Creamos interfaces y clases concretas para representar diferentes tipos de medios digitales (libros, revistas, periódicos).
  - Implementamos fábricas concretas para cada tipo de medio digital, permitiendo la creación de objetos sin especificar su clase exacta.

- **Builder:**
  - Definimos una clase Media para representar cualquier tipo de medio digital.
  - Creamos una interfaz MediaBuilder que declara métodos para configurar los atributos de un medio digital.
  - Implementamos un constructor concreto (BookBuilder) que implementa la interfaz MediaBuilder para construir libros con configuraciones específicas.

