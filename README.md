# microservicetrial


# Microservice Architecture Considerations:

Since the Kubernetes based deployment has become a defacto in Microservice architecture, I will attempt to consider those issues as a part of this. This is an attempt to learn larger architecture pattern and not meant as a narrow view of microservice application design.

1. Protocol : which protocol to choose from 
a. gRPC - HTTP 2/h2
b. json/REST - HTTP 1.1
c. Anything else
2. Pattern of Service:
      a. Event Driven
      b. Request/Response based
      c. Various scenrio/Design patterns
          a. temporary state management (Semi-synchornous patterns like) 
              1) I will call you, dont call me back 
              2) call me back after x time-period, 
              3) Call me sychronously for x attempts
 3. Service Mesh 
      Aspects of micro services why a servicemesh is required:
      
      a. Isitio
      b. KEvent
      c. 
