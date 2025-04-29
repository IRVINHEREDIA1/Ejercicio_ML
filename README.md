#Ejecución de ejercicio de práctica, Mercado libre

#Requerimientos mínimos para ejecutar el proyecto.
Tener instalado:
Java
Java Development Kit (JDK) 21
Maven
IntelliJ
Google Chrome (se sugiere la vs 135.0.7049.115 en adelante)

#Instalación.

git clone https://github.com/IRVINHEREDIA1/Ejercicio_ML.git

#Ejecución con Maven
Para ejecutar las pruebas y generar los reportes correspondientes, utilice el siguiente comando:
mvn clean verify

#Visualización del reporte.
El comando anterior generará un informe de pruebas de Serenity en el directorio target/site/serenity/index.html
El reporte debe abrir con el navegador que tenga instalado

#Consideraciones adicionales:

Para garantizar una ejecución correcta del ejercicio y la generación de reporte, se recomienda no estar conectado una
VPN o un proxy activo, desactivar ambas
En caso se tenga errores en ejecución con el reporte, puede ejecutar desde la clase TestRunner.
src/test/java/com/magento/runner/TestRunner.java











