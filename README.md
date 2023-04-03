# template-camunda-client

## Deployment of workflows

Auto deploy is configured with camunda.autoDeploy.enable=true
This way every bpmn, dmn file in the resource foulder gets deployed on camunda url with /engine-rest endpoint on microservice start-up

## Start of the new process
Process instance is started on POST call of microservice /start endpoint 
