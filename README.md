# Examen Ruben 13/5/2024

# Link Repositorio: https://github.com/AssilAB02/ExamenRuben13.git

## Entregas 1 y 2: Patrones de Construcción y Estructuración

### Descripción General

En estas dos entregas, nos centramos en dos aspectos fundamentales del desarrollo del sistema:

1. **Patrones de Construcción:**
   - Utilizamos el patrón Factory Method para crear diferentes tipos de medios digitales, como libros, revistas y periódicos.
   - Implementamos el patrón Builder para facilitar la creación de medios digitales con configuraciones complejas.

2. **Patrones de Estructuración:**
   - Empleamos el patrón Composite para representar tanto medios individuales como colecciones de medios de forma jerárquica.
   - Utilizamos el patrón Adapter para integrar diferentes formatos de archivos sin cambiar la interfaz de usuario.

#### Funcionamiento del Factory Method

El Factory Method permite crear objetos sin especificar la clase exacta del objeto que se creará. 

1. **Interfaz Media:** Define el comportamiento de los medios digitales, como `displayInfo()`.

2. **Clases concretas:** Implementan la interfaz Media y representan tipos específicos de medios digitales, como libros, revistas y periódicos.

3. **Interfaz MediaCreator:** Declara el método `createMedia()` que las fábricas concretas deben implementar.

4. **Fábricas concretas:** Implementan la interfaz MediaCreator y proporcionan la lógica para crear instancias de medios digitales específicos.

#### Funcionamiento del Composite

El patrón Composite se utiliza para tratar tanto objetos individuales como composiciones de objetos de manera uniforme. En el contexto de la biblioteca digital, podríamos usarlo para representar tanto medios individuales como colecciones de medios.

1. **Componente (Interface Media):** Define el comportamiento común para todos los elementos de la estructura, como la operación `displayInfo()`.

2. **Hoja (Clases concretas, como Book y Magazine):** Representan elementos individuales de la estructura.

3. **Composite (Clase MediaGroup):** Representa la estructura compuesta, que puede contener tanto hojas como otros composites. Implementa operaciones que se aplican tanto a las hojas como a los composites, lo que permite recorrer la estructura de forma recursiva.

#### Funcionamiento del Adapter

El patrón Adapter se utiliza para integrar diferentes interfaces o clases que tienen interfaces incompatibles. En el contexto de la biblioteca digital, podríamos usarlo para permitir que diferentes formatos de archivos se muestren de manera uniforme en la interfaz de usuario.

1. **Interfaz Media:** Define el comportamiento común para todos los medios digitales, como displayInfo().

2. **Clases concretas (como Book y Magazine):** Implementan la interfaz Media y representan medios digitales en diferentes formatos.

3. **Clase Adapter (MediaAdapter):** Permite que una clase existente (por ejemplo, un archivo) se utilice como un medio digital al adaptar su interfaz a la interfaz Media.

