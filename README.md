# callcenter_microservices_refactor
## Introduction:
This project is a self-study project that is being built from the previous one - callcenter_microservices. Since the callcenter_microservices focused on how services/components in the system connect together
and the way that requests/messages from the client are sent through the services in an business executing process by applying Event-Driven Architecture thanks to Apache Kafka implementation.

However, in the previous version, we used Firebase service, so all the services relating to Auth, Database, User Role,... completely take advantage of the Firebase services.
This time, a self-study project, as the recommended target, we are going to alter some components depending on the Firebase services and also the Firebase Database by self-implementation elements that provide the same
roles/functions. Obviously, this creates some problems/questions that we have to solve in the process of implementation but it also gives us chances to face some challenges that we were lucky to be solved by third-party services.

## Target:
Self-study project
