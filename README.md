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
### Flujo general del sistema
1. La aplicación **Spring Boot** obtiene los datos desde **Oracle Database**.
2. Calcula y agrupa métricas relevantes, como:
   - Total de vuelos por origen y destino.
   - Número total de personas registradas.
3. Expone las métricas a través del endpoint `/actuator/prometheus`.
4. **Prometheus** realiza la recolección (*scraping*) periódica de estas métricas.
5. Los datos recolectados se almacenan como series temporales en Prometheus.
6. **Grafana** consulta Prometheus y visualiza las métricas mediante paneles interactivos.
7. Los dashboards permiten monitorear en tiempo real la actividad de vuelos y personas del sistema.


