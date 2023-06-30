## Introduction
This is a sample implementation of feature togglz patterns using Togglz(Feature Flag for Java Platform). This application exposes one endpoint */api/v1/products* which list some product info with their price. When the feature flag *discount_applied* is true it return discounted price. Check the response by enabling and disabling feature flag.

### Running the application
```mvn spring-boot:run```
### Togglz Console
Togglz console can be accessed by going to http://localhost:8080/togglz-console/index.

