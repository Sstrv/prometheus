#  Proyecto Vuelos Prometheus
Este proyecto tiene como objetivo integrar una aplicación Java con **Prometheus** para la recolección y exposición de métricas, permitiendo su visualización y monitoreo a través de **Grafana**.


##  Tecnologías utilizadas

- **Java 17+**
- **Spring Boot**
- **Prometheus**
- **Grafana**
- **Gradle**
- **Oracle Database**

##  Descripción general

La aplicación expone métricas personalizadas sobre vuelos y personas mediante el **endpoint `/actuator/prometheus`**.  
Estas métricas son recolectadas automáticamente por Prometheus y se pueden visualizar en paneles de Grafana.

##  Ejecución del proyecto

### 1. Clonar el repositorio
```bash
git clone https://github.com/Sstrv/prometheus
```
### Instalacionde dependencias

Se instala lan deperndencias por el archivo **docker-compose.yml** teniendo en cuanta bque primero se debe autenticar con cuenta oficial en oracle
```bash
docker login container-registry.oracle.com
```
,en su defecto cambiar el contenedor a el free en el archivo **docker-compose.yml** 
```bash
image: container-registry.oracle.com/database/free:latest
```
o si se posee una base de datos difernte o en local quitar el servicio **Oracle**, cambiar las propiedades y el draiver de ser requerido 
### Descipcion del sistema 


