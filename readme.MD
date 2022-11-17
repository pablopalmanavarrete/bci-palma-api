# BCI-PALMA-API

## Consideraciones
- Se utiliza openjdk 11
- Adicionalmente se adjunta el archivo "BCI-palma.postman_collection.json" con los endpoint creados.
- El aplicativo se configuro con maven y una "arquitectura" hexagonal, en donde se pueden destacar
  - domain (core de la aplicacion, validaciones y conversiones de datos)
  - infrastructure (adaptadores)
    - inbound (adaptadores de entrada Ej. RestController)
    - outbound (adaptadores de salida Ej. Repository)
- Se realizan test unitarios con junit
- se documenta con openApi libreria que tiene swagger que se puede visitar en http://localhost:8095/self-service/api-palma/swagger-ui/index.html
- La aplicación usa el puerto 8095


## Instrucciones
- En la carpeta resources se encuentra el archivo .sql para la creación del modelo "00_creacion_modelo.sql".
- La aplicación se configuró para utilizar h2 en formato embebido file y la ubicacion seria "C:/ejercicio/api"
- La aplicación se puedes ejecutar desde Intellij o cualquier ide compatible con spring boot, en su defecto desde consola se puede usar el comando "mvnw spring-boot:run" en la raiz del proyecto.
- Para detener la aplicación en ejecución por consola, solo basta apretar "ctrl+c".