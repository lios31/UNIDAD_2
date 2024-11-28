# UNIDAD_2-Unidad_4
# Sistema de Gestión de Contenidos Audiovisuales

Este proyecto es una aplicación que permite gestionar películas, series de TV, documentales y sus actores, implementada utilizando los principios de programación orientada a objetos, el patrón MVC y los principios SOLID. Además, incluye lectura/escritura desde archivos CSV y pruebas unitarias con JUnit.

#Índice
-Descripción del Proyecto
-Características
-Estructura del Proyecto
-Requisitos Previos
-Instrucciones de Instalación
-Ejecución del Proyecto
-Ejecución de Pruebas
-Cambios Realizados
-Contribuciones
-Licencia

#Descripción del Proyecto
El sistema permite gestionar una biblioteca de contenidos audiovisuales que incluye películas, series de TV y documentales. Los datos se leen y almacenan en archivos CSV para mantener la persistencia de la información. La aplicación sigue el patrón de diseño MVC y aplica los principios SOLID para un diseño limpio y escalable.

#Características
Lectura y escritura de archivos CSV: Importar y exportar contenidos audiovisuales desde/hacia archivos CSV.
Gestión de contenidos: Agregar, listar y mostrar detalles de películas, series y documentales.
Patrón MVC: Separación clara entre lógica de negocio (Modelo), interacción del usuario (Vista) y lógica de control (Controlador).
Aplicación de principios SOLID: Código modular, reutilizable y extensible.
Pruebas unitarias con JUnit: Cobertura de las clases principales para garantizar la calidad del código.



## Estructura del Proyecto

/src
│   ├── modelo/
│   │   ├── ContenidoAudiovisual.java
│   │   ├── Pelicula.java
│   │   ├── SerieDeTV.java
│   │   ├── Documental.java
│   │   ├── Temporada.java
│   │   ├── Actor.java
│   │   └── Investigador.java
│   │
│   ├── controlador/
│   │   └── Controlador.java
│   │
│   ├── vista/
│   │   └── Vista.java
│   │
│   └── util/
│       └── ArchivoCSV.java
│
/test
│   ├── ControladorTest.java
│   ├── VistaTest.java
│   └── Otros tests...


#Requisitos Previos
Antes de ejecutar el proyecto, asegúrate de tener instalado lo siguiente:


-Java Development Kit (JDK) 8 o superior
-Eclipse IDE o cualquier IDE compatible con Java
-JUnit 5 para ejecutar las pruebas unitarias


#Instrucciones de Instalación
-Clonar el repositorio:
git clone <URL-del-repositorio>
cd <nombre-del-proyecto>


#Abrir en un IDE:
Importa el proyecto como un proyecto de Java en tu IDE preferido.


#Configurar dependencias (si es necesario):
Asegúrate de que JUnit esté disponible en el classpath para ejecutar las pruebas.


Ejecución del Proyecto
Ejecutar la aplicación principal:


#Abre Controlador.java o la clase principal de tu aplicación.
-Ejecuta el programa desde el IDE o mediante la consola:
Copiar código
java -cp bin controlador.Controlador


#Interacción en la consola:
La interfaz de usuario se mostrará en la consola, permitiendo ingresar y visualizar contenidos audiovisuales.


#Ejecución de Pruebas
Ejecutar las pruebas unitarias:


Desde el IDE, selecciona la carpeta test y ejecuta todas las pruebas.
Alternativamente, desde la consola:


Copiar código
java -cp bin:lib/junit-5.7.0.jar org.junit.runner.JUnitCore test.ControladorTest


Verificar resultados:
Las pruebas verificarán la funcionalidad de las clases Controlador, Vista y otros módulos.



#Cambios Realizados

--Implementación del patrón MVC:
Separación del modelo (ContenidoAudiovisual), vista (Vista) y controlador (Controlador).
--Lectura y escritura de archivos CSV:
Creación de la clase ArchivoCSV para gestionar la persistencia de datos.
--Aplicación de principios SOLID:
Refactorización para cumplir con SRP, OCP, LSP, ISP y DIP.
--Pruebas unitarias:
Implementación de pruebas para garantizar el correcto funcionamiento de los métodos principales.




#Licencia
Este proyecto está bajo la Licencia MIT. Consulta el archivo LICENSE para más detalles.
