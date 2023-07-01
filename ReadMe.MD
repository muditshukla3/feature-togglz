## Introduction
This is a sample implementation of feature togglz patterns using Togglz(Feature Flag for Java Platform). This application exposes one endpoint *http://localhost:8080/api/v1/products* which list some product info with their price. When the feature flag *discount_applied* is true it return discounted price. Check the response by enabling and disabling feature flag.

### JDBCStateRepository
State repositories are data stores which are responsible for persisting the state of a feature. This repo contains sample implementation of JDBCStateRepository which persist the state of a Feature in a SQL database. Here, it persists the Feature state in in-memory H2 database. When application starts for the first time it creates a table named *TOGGLZ*.
### Running the application
```mvn spring-boot:run```
### Togglz Console
Feature can be enabled and disabled using Togglz console. Togglz console can be accessed by going to http://localhost:8080/togglz-console/index.
### H2 Console
H2 console can be accessed using following url http://localhost:8080/h2-console

