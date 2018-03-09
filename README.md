# lotus
   lotus is a service management system , the main purpose list as below:
   1. fast deploy java jar application services to native linux os cluster
   2. enables user to dynamic management logic service cluster nodes
   3. has the ability of service auto-scaling
   4. resource limit and isolation
   5. the service resource performance monitoring and feedback [as 3rd target implies]
   6. service node auto fail-over recovering
   7. service to service routing config
   8. fast test with distributed jar running mode as a spring boot application
   
   the architecture is easy to extend or customize:
   1. its based on spring boot
   2. it divided as master-web-control and agent . Agent is responsible for invoke deployed jars
      application and ,all command and args is accepted from master-web-control node.
      Agent is also responsible for collect monitoring data and feedback to master node.
      Master will decide to auto-scaling with the Agent's feedback,or auto recover the node
      if needed.
