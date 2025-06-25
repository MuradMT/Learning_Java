<h1>I follow the JAVA course from Sarkhan Rasullu(UDEMY).</h1>
<h2>Course link:https://www.udemy.com/course/sifirdan-sona-java-2024</h2>
Java 8 features(lambda expressions):

1.foreach working in background like this:we implement consumer class and oveeride its accept method then do some actions.

We can send lambda expression or method reference inside foreach:

```java
list.forEach((s)-> System.out.println(s));
list.forEach(System.out::println);
//lambda useful when we have multiple lines such as
// (s)-> { //do1 //do2 }
```

foreach generally used to loop over elements and print then ,do not modify elements.

2.optional ifPresent simply checks and prints,example:

```java
 Optional<String> optional = Optional.of("as");
          optional.ifPresent(System.out::println);
          //replaces this one
//          if(optional.isPresent()){
//              System.out.println(optional.get());
//          }else{
//              System.out.println(Optional.empty());
//          }
```

3.Lambda expressions main goal is to implement ***functional programming i***n java.

4.filter helps us to add specific condition and get data,we use with stream and collect together or we can directly print the result of filter,example:

```java
list.stream().filter(s->s.equals("a")).forEach(System.out::println);
List<String> b = list.stream().filter(s -> s.equals("b")).
collect(Collectors.toList());
```

5.We can create stream list directly with Stream.of

6.parallelStream() creates async stream.

7.We can add findAny findFirst methods at the end of filter and use it with ifPresent together :

```java
list.stream().filter(s -> s.equals("c"))
.findAny().ifPresent(System.out::println);
```

8.Maps general functions is to change the existing elemnts of list,we use it like this:

```java
 list.stream().map(String::toUpperCase).forEach(System.out::println);
 //make all elements f list uppercase and prints with foreach
 //we can also collect again
```

9.In c# we have special delegates called action func predicate etc send references.In java we have ***functional interfaces***:

***Consumer→***gets parameter returns void,foreach use it

***Function→***gets parameter returns value , map uses it.

***Predicate→***gets parameter returns boolean,filter uses it.

10.Optional has orElse and orElseThrow.

11.mapToInt does convertion of current tstream to. integer stream,sum() sums this,example usage:

```java
int sum = list.stream().mapToInt(String::length).sum();
        System.out.println(sum);
```

12.Or we can simply use reduce:

In Java, `reduce()` is a **terminal operation** in the Stream API that combines elements of a stream into a **single result**(like a sum, product, concatenation, etc.) using an **accumulator function**.

---

---

## Basic Example – Sum of Integers

```java
java
CopyEdit
List<Integer> numbers = List.of(1, 2, 3, 4, 5);

int sum = numbers.stream()
    .reduce(0, Integer::sum);

System.out.println(sum); // Output: 15

```

- `0` is the **identity** (starting value)
- `(a, b) -> a + b` is the **accumulator** (adds each number)

---

## Without Identity – Returns Optional

```java
java
CopyEdit
List<String> list = List.of("a", "b", "c");

Optional<String> result = list.stream()
    .reduce((s1, s2) -> s1 + s2);

result.ifPresent(System.out::println); // Output: abc

```

13.flatmap combines 2 lists together.

14.Intermediate operations vs Terminal ones:

map vs foreach

filter vs reduce

<h1>Spring Security</h1>
1.Encode with base 64 hashing md5

called basic token ,not preffered due to data leak

2.Wireshark listens on ports

3.Bearer token

4.JWT Token,public private key

header payload token validation

5.Oath2 protocol

steps how it works:

first we work with authorization server

1)send request→get authorization grant

2)send authorization grant→get access token

3)use access token→get protected resource

client id client secret grant type openid ssl

6.We have authorization,resource and security configs

7.csrf

[8.In](http://8.In) real life projects,we do not focus to implement everything with spring security.We use som ekind of middlewars 3 parties such as keycloak,istio or something.They handle it.We generally focus on to write business logic.

9.md5 sha hashing, encrypt decrypt encode

10.

### Step-by-step: Password Hashing in Java (with BCrypt)

---

### 1. **Add the Dependency**

If you're using **Maven**, add:

```xml
xml
CopyEdit
<dependency>
  <groupId>org.springframework.security</groupId>
  <artifactId>spring-security-crypto</artifactId>
  <version>6.2.1</version> <!-- use latest -->
</dependency>

```

If you're using **Gradle**:

```groovy
groovy
CopyEdit
implementation 'org.springframework.security:spring-security-crypto:6.2.1'

```

---

### 2. **Create a Utility Class**

```java
java
CopyEdit
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

public class PasswordUtil {

    private static final BCryptPasswordEncoder encoder = 
    new BCryptPasswordEncoder();

    // Hash the password
    public static String hashPassword(String rawPassword) {
        return encoder.encode(rawPassword);
    }

    // Verify raw password with hashed password
    public static boolean verifyPassword(String rawPassword, String hashedPassword) {
        return encoder.matches(rawPassword, hashedPassword);
    }
}

```

---

### 3. **Usage Example**

```java
java
CopyEdit
public class Main {
    public static void main(String[] args) {
        String password = "mySecret123";

        // Step 1: Hash the password
        String hashed = PasswordUtil.hashPassword(password);
        System.out.println("Hashed: " + hashed);

        // Step 2: Verify
        boolean match = PasswordUtil.verifyPassword("mySecret123", hashed);
        System.out.println("Match: " + match);  // true
    }
}

```

11.@GetMapping(consumes=”application.json”,produces=”application.json”) is default type things

This is restful consume,produce,accept concepts.

12.@Builder-lombok builder style setter

13.Keycloak usage,authentication authorization

14.@hasRole(”User”) requires from us ROLE_User

15.@Preauthorize authoorizes directly

16.@hasAuthority→checks the scope,for instance you can do read write etc

17.issuer uri server url

18.we can return token from our app using keycloak service and builder

19.grant type is like which type you select password social auth etc,scope is like your authority,what you can do for instance read or write etc

20.session,session key

<h1>Microservices</h1>

***1.***Microservices main advantages:

Traffic(Load),Maintenance,Scalability

### What is Microservices Architecture?

**Microservices** is an architectural style where an application is built as a **collection of small, independent services**, each responsible for a single piece of business functionality. These services **communicate over lightweight protocols**(typically HTTP/REST or messaging like Kafka).

Each microservice:

- Is **deployed independently**
- Has its own **database** (often)
- Is owned by a **small team**
- Can be **written in any language** (Java, Node.js, etc.)

---

## Advantages of Microservices (with focus on Traffic, Maintenance, and Scalability)

### 1. **Traffic (Load Handling) – Better Load Distribution**

**Benefit**: You can scale **only the services** that need more capacity.

- In a monolith, high traffic to one feature can overload the whole app.
- With microservices, if your "Search" service gets a lot of traffic, you can **replicate only that** service.

*Real-life*: Netflix scales their "Recommendation" and "Streaming" services independently during peak hours.

---

### 2. **Maintenance – Easier to Update & Debug**

**Benefit**: Codebases are **small**, **focused**, and **easier to change**.

- Teams can update a single microservice without redeploying the entire system.
- If a bug is in "PaymentService", it doesn't affect "UserService".

*Real-life*: Amazon deploys thousands of microservices multiple times a day with minimal downtime.

---

### 3. **Scalability – Horizontal Scaling Per Service**

**Benefit**: Each service can be **scaled independently**, optimized for its workload.

- Some services may need **more CPU** (e.g. video encoding), others more **memory** (e.g. caching).
- Deploying multiple containers for only the needed services saves cost and resources.

*Real-life*: Uber’s dispatch system scales separately from its driver onboarding.

***2.***

### What is Docker?

**Docker** is a platform used to **build, run, and manage containers**. Containers are lightweight, portable, and self-sufficient units that package **an application and everything it needs to run** — including code, libraries, dependencies, and environment settings.

---

### Key Concepts

| Term | Description |
| --- | --- |
| **Image** | A read-only template used to create containers. Like a class. |
| **Container** | A running instance of an image. Like an object. |
| **Dockerfile** | A script that defines how to build an image. |
| **Docker Hub** | A public registry where Docker images are shared. |

---

### Why Use Docker?

- **Portability**: Runs the same on any machine (local/dev/prod)
- **Isolation**: Avoids dependency conflicts
- **Speed**: Containers start fast, unlike VMs
- **Consistency**: Ensures "works on my machine" = works everywhere
- **Microservices**: Ideal for deploying microservices

***3.***

### What is Orchestration?

**Orchestration** in the context of containers means **automating** the deployment, scaling, networking, and lifecycle management of containerized applications.

When you have **many containers** running different parts of your system (e.g., microservices), orchestration tools make sure:

- They run on the right machines
- They restart if they fail
- They scale up/down as needed
- They can discover and talk to each other
- They're updated without downtime

---

### What is Kubernetes?

**Kubernetes (K8s)** is the most popular **container orchestration platform**. Originally developed by Google, it’s now open-source and maintained by the Cloud Native Computing Foundation.

It helps manage containerized applications (like those built with Docker) **at scale**, across **clusters of machines**.

---

### What Can Kubernetes Do?

| Feature | Description |
| --- | --- |
| **Deployment** | Deploy containers automatically |
| **Scaling** | Auto-scale containers based on load (CPU, memory) |
| **Load balancing** | Distributes traffic across containers |
| **Self-healing** | Restarts failed containers |
| **Rolling updates** | Updates containers with zero downtime |
| **Service discovery** | Lets containers find each other |
| **Secrets & config** | Manages sensitive data and environment configs |

### Why Use Kubernetes?

- You have **many microservices**
- You want **zero-downtime deployments**
- You need **auto-scaling & recovery**
- You use **CI/CD pipelines**
- You're deploying to **cloud environments**

***4.***

### What is CI/CD?

**CI/CD** stands for:

- **CI – Continuous Integration**

  Automatically **builds and tests** your code every time you push changes to a repository (like GitHub or GitLab).

  Ensures the codebase stays **working and tested** at all times.

- **CD – Continuous Delivery / Continuous Deployment**
    - **Continuous Delivery**: Automatically prepares builds for deployment (e.g., packages Docker images), but **requires manual approval** to release.
    - **Continuous Deployment**: Fully **automated release** to production after successful tests – no manual steps.

---

### Why CI/CD?

| Goal | What It Does |
| --- | --- |
| Automates builds | No more manual packaging or compiling |
| Catches bugs early | Each push triggers automated tests |
| Faster deployments | Teams release multiple times per day |
| Increases reliability | Ensures quality through repeatable steps |

---

### Typical CI/CD Workflow

```
css
CopyEdit
Developer pushes code to GitHub → CI server runs tests → If tests pass → Build Docker image → Push to registry → CD deploys to staging/prod

```

---

### Current CI/CD Tools (2025)

### CI/CD Platforms:

| Tool | Description |
| --- | --- |
| **GitHub Actions** | Built into GitHub, fast adoption |
| **GitLab CI/CD** | Integrated with GitLab repos |
| **Jenkins** | Open source, highly customizable |
| **CircleCI** | Cloud-native, fast pipelines |
| **Travis CI** | Popular in open source, easy to set up |
| **Bitbucket Pipelines** | Integrated into Bitbucket |
| **Azure DevOps** | Enterprise-ready Microsoft solution |
| **Argo CD** | Kubernetes-native continuous deployment |
| **Tekton** | Cloud-native, open-source pipelines |

***5.***

The **Saga Pattern** is a way to manage **data consistency** in **microservices** when you can’t use a single database transaction.

---

### Simple Explanation

Instead of using a big transaction across multiple services (which doesn't scale), you **break it into small local transactions**, and use **events or messages** to coordinate them.

If something fails, you **run a compensation action** to undo the previous steps.

---

### Example: Online Order

1. **Order Service**: creates order
2. **Payment Service**: charges money
3. **Inventory Service**: reserves items
4. If Inventory fails → Payment is refunded, Order is canceled

---

### Two Types

| Type | How it Works |
| --- | --- |
| **Choreography** | Services listen to each other’s events |
| **Orchestration** | A central service coordinates everything |

***6.***

### What is a Message Queue?

A **message queue** is a system that lets **different parts of your application talk to each other asynchronously** by sending messages into a queue.

- One part **sends** a message → goes into the queue
- Another part **reads** (or "consumes") it later
- They **don’t need to run at the same time**

---

### Simple Analogy

> Think of a message queue like a to-do list in an office:
>
> - A receptionist writes tasks (messages) on sticky notes (queue)
> - Different workers pick them up and do the job
> - Even if someone is on lunch, the task is still there waiting

---

### Real Examples

| Tool | Description |
| --- | --- |
| **RabbitMQ** | Lightweight, widely used for simple message passing |
| **Apache Kafka** | Handles large volumes of real-time data, great for streaming |
| **ActiveMQ** | Older, stable, used in enterprise apps |
| **Amazon SQS** | AWS cloud-based message queue |
| **Redis Pub/Sub** | In-memory message passing, not persisted |

---

### How It Helps

- **Decouples services**: Sender and receiver don’t depend on each other
- **Improves reliability**: Messages stay in queue even if service crashes
- **Allows scaling**: Multiple consumers can handle high load

---

### Use Case Example

**Order Service** → puts message into queue →

**Email Service** → reads it later and sends confirmation

Let me know if you want to set up RabbitMQ or Kafka in a Spring Boot app.

***7.***

### Event Sourcing

**Event Sourcing** is a way of storing data by **recording every change (event)** that happens to an object, **instead of just storing the latest state**.

---

### Imagine a Car System (Car Rental App)

Instead of storing:

```json
json
CopyEdit
{
  "carId": 1,
  "status": "rented",
  "location": "London"
}

```

You store events like:

1. `CarCreated(carId=1)`
2. `CarMoved(carId=1, location=Manchester)`
3. `CarRented(carId=1, userId=123)`
4. `CarMoved(carId=1, location=London)`

Each event **represents something that happened** to the car.

---

### How It Works

- The system **replays all events** in order to rebuild the car’s current state.
- Nothing is lost — every action is **recorded as a fact**.
- If a bug corrupts the state, just replay events again to recover.

---

### Why Use It?

| Benefit | Why It Matters |
| --- | --- |
| **Full history** | You know exactly what happened and when |
| **Audit friendly** | Great for compliance, logs all changes |
| **Undo possible** | You can reverse actions by replaying events differently |
| **Debuggable** | Easier to trace where a mistake occurred |

---

### Real-World Analogy

> Like a car’s black box or driving recorder:
>
>
> Instead of just saying "car is now in London", it stores *everything that happened* to get it there.
>

***8.***

### What is CQRS (Command Query Responsibility Segregation)?

**CQRS** is a design pattern that **separates read and write operations** for a data model.

---

### In Simple Terms:

> Instead of using one model for both reading and writing, you split them into two:
>
- **Commands** = modify data (Create, Update, Delete)
- **Queries** = read data (Get)

---

### Real-World Analogy (Car App)

Imagine a car rental app:

- You **write data** with commands:
    - `RentCarCommand(carId, userId)`
    - `ReturnCarCommand(carId)`
- You **read data** with queries:
    - `GetAvailableCarsQuery()`
    - `GetCarHistoryQuery(carId)`

These use **different models, DTOs, and even databases** if needed.

---

### Why Use CQRS?

| Benefit | Description |
| --- | --- |
| **Scalability** | Read-heavy apps can scale queries separately |
| **Flexibility** | Different models for reads and writes = cleaner code |
| **Performance** | Queries can be optimized for fast reads |
| **Security** | Easier to restrict writes but allow open reads |
| **Event sourcing** | Pairs well with event sourcing for history/replay |

***9.Spring Cloud***

helps us to implement microservice patterns

***10.***

### What is a Circuit Breaker ?

A **circuit breaker** is a pattern used to **prevent your system from repeatedly calling a failing service**, which could lead to performance issues or crashes.

---

### Real-World Analogy:

> Think of a circuit breaker in your house. If there's too much current (a fault), it trips to prevent damage.
>
>
> In software, if a service fails too many times, the circuit breaker **trips** and stops further calls temporarily.
>

---

### Why Use It?

| Problem | Circuit Breaker Fix |
| --- | --- |
| Service is down | Stop hitting it repeatedly |
| Slow response / timeout | Avoid wasting resources |
| Dependent service overload | Let it recover before retrying |

---

### States of a Circuit Breaker

1. **Closed** – Calls go through as normal
2. **Open** – Too many failures → stop all calls for a while
3. **Half-Open** – Try a few calls to see if service recovered

---

### Example (Car App)

- Your app calls `LocationService` to get live GPS of cars
- That service goes down or slows
- Circuit breaker notices failures and **stops trying**
- After some time, it **retries a few calls**
- If it works again, it **resumes normally**

---

### Tools in Java/Spring

| Tool | Description |
| --- | --- |
| **Resilience4j** | Lightweight, used in Spring Boot apps |
| **Hystrix** (deprecated) | Older Netflix library |
| **Spring Cloud Circuit Breaker** | Wrapper for tools like Resilience4j |

***11.***

### What is Service Discovery?

**Service Discovery** is a system that **automatically finds the location (IP/port)** of microservices in a distributed system.

---

### Simple Explanation

In a microservices architecture, services often:

- Start/stop dynamically
- Change IP addresses (especially in cloud or containers)

**Service discovery** solves the problem of:

> “How does one service know where to find another?”
>

---

### Without Service Discovery:

You hardcode URLs:

```java
java
CopyEdit
http://user-service:8080/api/users

```

If `user-service` moves or scales →  it breaks.

---

### With Service Discovery:

- Services **register** themselves when they start
- Other services **ask a central registry** for the latest address

---

### Types of Service Discovery

| Type | Who finds who? |
| --- | --- |
| **Client-side** | Clients ask the registry and call services directly |
| **Server-side** | Clients call a load balancer, which queries the registry |

---

### Tools for Service Discovery

| Tool | Description |
| --- | --- |
| **Eureka** | Netflix’s service registry (used with Spring Cloud) |
| **Consul** | Service registry with health checks |
| **Zookeeper** | Also used for coordination and discovery |
| **Kubernetes** | Has built-in DNS-based service discovery |

---

### Spring Boot Example (Using Eureka)

1. `user-service` registers itself with Eureka
2. `order-service` asks Eureka for the location of `user-service`
3. Eureka returns the current IP/port
4. `order-service` calls `user-service` without knowing its real address

---

### Summary

> Service Discovery = a dynamic address book for services
>

It allows services to find and talk to each other **without hardcoding IPs or ports**, enabling **scalability, flexibility, and fault tolerance** in microservice systems.

Let me know if you want to implement Eureka in Spring Boot.

***12.***

### What is the ELK Stack?

The **ELK Stack** is a powerful set of tools used for **log management**, **monitoring**, and **data visualization**.

---

### ELK stands for:

| Tool | Purpose |
| --- | --- |
| **Elasticsearch** | Stores and searches large volumes of log data |
| **Logstash** | Collects, parses, and transforms logs before indexing |
| **Kibana** | Visualizes data with dashboards and graphs |

---

### Use Case (Simple Example)

Imagine your application logs millions of lines like:

```
pgsql
CopyEdit
[INFO] 2025-06-24 10:02:17 User logged in: murad123

```

With the ELK Stack, you can:

1. **Ship logs** (with Logstash or Filebeat)
2. **Index and store them** in Elasticsearch
3. **Search & visualize** patterns (e.g., failed logins, errors) in Kibana

---

### How They Work Together

```
scss
CopyEdit
Your App Logs
     ↓
[ Filebeat / Logstash ]
     ↓
Elasticsearch ←→ Kibana (Dashboards, Charts, Filters)

```

---

### Why Use ELK Stack?

| Feature | Benefit |
| --- | --- |
| **Centralized logging** | All app logs in one place |
| **Full-text search** | Search by username, error message, etc. |
| **Data visualization** | Beautiful, real-time dashboards |
| **Scalability** | Handles millions of log lines easily |
| **Alerting** | Set alerts for specific error patterns |

---

### Alternatives

- **EFK** = Elasticsearch + Fluentd + Kibana
- **OpenSearch Stack** (AWS fork of ELK)
- **Graylog**, **Datadog**, **Prometheus + Grafana** (for metrics)

***13.***

### What is a Config Server?

A **Config Server** in Spring Cloud is a **centralized service** that provides **external configuration** for all applications in a system.

Instead of hardcoding settings in each app (like DB URLs, secrets, API keys), you store them in **one place** — typically a **Git repository** — and apps fetch them at startup.

---

### Why Use a Config Server?

| Benefit | Description |
| --- | --- |
| **Central management** | One source of truth for config |
| **Dynamic updates** | Apps can refresh config without redeploy |
| **Environment-specific** | Separate configs for dev, test, prod |
| **Secure secrets** | Externalize credentials (often encrypted) |

---

### How It Works (Simple Flow)

1. You push configs to a Git repo:

    ```
    sql
    CopyEdit
    application.yml
    user-service.yml
    order-service-dev.yml
    
    ```

2. The **Spring Cloud Config Server** reads this Git repo.
3. Your microservices (clients) request their config like:

    ```
    bash
    CopyEdit
    GET http://localhost:8888/user-service/dev
    
    ```

4. The config server returns the correct settings for `user-service` in the `dev` environment.

---

### Basic Setup

### 1. Config Server (Spring Boot App)

```java
java
CopyEdit
@SpringBootApplication
@EnableConfigServer
public class ConfigServerApp {
    public static void main(String[] args) {
        SpringApplication.run(ConfigServerApp.class, args);
    }
}

```

**application.yml**

```yaml
yaml
CopyEdit
server:
  port: 8888

spring:
  cloud:
    config:
      server:
        git:
          uri: https://github.com/your/config-repo

```

---

### 2. Client App (e.g., user-service)

**bootstrap.yml**

```yaml
yaml
CopyEdit
spring:
  application:
    name: user-service
  cloud:
    config:
      uri: http://localhost:8888

```

Now, when `user-service` starts, it will fetch config from:

```
bash
CopyEdit
http://localhost:8888/user-service/default

```

---

### Summary

> Spring Cloud Config Server lets you externalize all config files, fetch them dynamically, and manage them from a single location (usually Git).
>

***14.***

### What is Tracing (in Microservices)?

**Tracing** is the process of **tracking a request as it flows through multiple services** in a distributed system.

---

### Why Do We Need It?

In microservices, one user request might:

```
css
CopyEdit
→ API Gateway
   → Auth Service
      → Order Service
         → Payment Service

```

If something fails or is slow, you need to **see the full path** of what happened — **that’s what tracing does**.

---

### What It Helps With

| Use Case | Example |
| --- | --- |
| **Debugging** | Which service caused a 500 error? |
| **Performance** | Which step is slow in a user flow? |
| **Monitoring** | How many requests fail at step 3? |

---

### How Tracing Works

Each request is assigned a **unique trace ID**, and each step gets a **span ID**. Tools collect this info and let you **visualize the journey** of a request.

---

### Popular Tracing Tools

| Tool | Description |
| --- | --- |
| **Zipkin** | Lightweight tracing system from Twitter |
| **Jaeger** | CNCF project, used by Uber, good with Kubernetes |
| **OpenTelemetry** | Vendor-neutral standard for metrics, logs, traces |
| **Spring Cloud Sleuth** | Auto-generates trace/span IDs in Spring apps and sends to Zipkin or Jaeger |

---

### Example (Spring Boot with Sleuth + Zipkin)

```xml
xml
CopyEdit
<!-- pom.xml -->
<dependency>
  <groupId>org.springframework.cloud</groupId>
  <artifactId>spring-cloud-starter-sleuth</artifactId>
</dependency>
<dependency>
  <groupId>org.springframework.cloud</groupId>
  <artifactId>spring-cloud-starter-zipkin</artifactId>
</dependency>

```

**application.yml**

```yaml
yaml
CopyEdit
spring:
  zipkin:
    base-url: http://localhost:9411
  sleuth:
    sampler:
      probability: 1.0  # 100% sampling for demo

```

---

### Summary

> Tracing = full visibility into what your app is doing across services.
>

***15.***

### What is Istio?

**Istio** is a **service mesh** — a powerful infrastructure layer that manages **communication between microservices**.

It helps you control **how** services interact with each other, without changing your application code.

---

### What Istio Can Do

| Feature | Description |
| --- | --- |
|  **Traffic Control** | Route traffic based on rules (e.g., canary, A/B testing) |
|  **Security** | Encrypt traffic with mTLS, enforce policies |
|  **Observability** | Trace requests, monitor metrics, log traffic |
|  **Resilience** | Retries, timeouts, circuit breakers |
|  **Authentication & Authorization** | Control who can access what |

---

### Simple Analogy

> Think of Istio as air traffic control for your microservices.
>
>
> It decides where requests go, watches for failures, encrypts traffic, and logs everything — **without touching your app code**.
>

---

### How It Works

Istio uses:

- **Envoy**: a sidecar proxy injected next to each service pod (in Kubernetes)
- **Control Plane**: the brain of Istio, configures the proxies

Your service → [Envoy] → Network → [Envoy] → Other service

You define Istio behavior using **YAML configs** like `VirtualService`, `DestinationRule`, etc.

---

### Example Use Case

You want:

- 90% of users to go to `v1` of a service
- 10% to test `v2`

With Istio, you can do this **with one config file**, no app code change.

---

### Common Components

| Component | Role |
| --- | --- |
| **Envoy** | Sidecar proxy handling traffic |
| **Pilot** | Distributes traffic rules to Envoy |
| **Mixer** (removed now) | Used to enforce policies (deprecated) |
| **Citadel** | Manages certificates for mTLS |
| **Ingress Gateway** | Manages external traffic into the mesh |

---

### When to Use Istio

- You're running **microservices in Kubernetes**
- You want **fine-grained traffic control**
- You need **zero-trust security**
- You want built-in **tracing, logging, and monitoring**

***16.***

### What is Prometheus + Grafana?

**Prometheus + Grafana** is a popular open-source combo used for **monitoring** and **visualizing metrics** in real-time systems, especially in **microservices** and **Kubernetes** environments.

---

### Simple Explanation

| Tool | What It Does |
| --- | --- |
| **Prometheus** | Collects and stores metrics (numbers over time) from your apps |
| **Grafana** | Visualizes those metrics using dashboards and charts |

---

### 🛠 How They Work Together

1. Your application exposes metrics (e.g., `/metrics` endpoint)
2. **Prometheus** scrapes that data every few seconds
3. Prometheus stores the data with timestamps
4. **Grafana** connects to Prometheus and lets you create dashboards

---

### Example Metrics

- CPU and memory usage
- HTTP request count, latency, errors
- Custom business metrics (e.g., orders per minute)

---

### Example (Spring Boot + Prometheus + Grafana)

### 1. Add Micrometer + Prometheus dependency

```xml
xml
CopyEdit
<!-- pom.xml -->
<dependency>
  <groupId>io.micrometer</groupId>
  <artifactId>micrometer-registry-prometheus</artifactId>
</dependency>

```

### 2. Enable Prometheus endpoint

```yaml
yaml
CopyEdit
# application.yml
management:
  endpoints:
    web:
      exposure:
        include: prometheus

```

Now your app exposes metrics at:

```
bash
CopyEdit
http://localhost:8080/actuator/prometheus

```

---

### 3. Run Prometheus

**prometheus.yml**

```yaml
yaml
CopyEdit
global:
  scrape_interval: 15s

scrape_configs:
  - job_name: 'spring-boot-app'
    static_configs:
      - targets: ['host.docker.internal:8080']

```

Start Prometheus:

```bash
bash
CopyEdit
docker run -p 9090:9090 -v $(pwd)/prometheus.yml:/etc/prometheus/prometheus.yml prom/prometheus

```

---

### 4. Run Grafana

```bash
bash
CopyEdit
docker run -d -p 3000:3000 grafana/grafana

```

- Open Grafana at `http://localhost:3000`
- Default login: `admin / admin`
- Add Prometheus as a **data source**
- Create dashboards using queries like:

    ```
    nginx
    CopyEdit
    http_server_requests_seconds_count
    
    ```


---

### Summary

| Tool | Job |
| --- | --- |
| **Prometheus** | Collects & stores metrics from apps |
| **Grafana** | Displays metrics in charts and graphs |

***17.***

### **Caching** in microservices is the practice of storing frequently used data temporarily in memory to avoid repeated, expensive operations like database queries or remote service calls.

---

### Why Use Caching?

| Benefit | Description |
| --- | --- |
| Faster responses | Data is served from memory instead of fetching from the database or another service. |
| Reduces load | Fewer calls to the database or downstream services. |
| Better scalability | Helps handle more users without performance drops. |
| Increases reliability | If a backend system is temporarily unavailable, cached data may still be served. |

---

### Where Caching Is Applied

1. **In the service layer** – Cache commonly accessed data like user info, configs, or static lists.
2. **At the API Gateway** – Cache responses to repeated external requests.
3. **Between services** – Cache shared or computed data that doesn't change often.

---

### Common Caching Tools

| Tool | Type | Description |
| --- | --- | --- |
| Redis | Distributed | Fast in-memory key-value store, supports TTL and persistence. |
| Memcached | Distributed | Lightweight cache, simple key-value pairs, no persistence. |
| Caffeine | In-process | High-performance Java cache library for local use. |
| Ehcache | In-process / Distributed | Java-based caching, integrates with Spring. |
| Hazelcast | Distributed | In-memory data grid, used for large-scale caching and clustering. |

---

### Example: Caching in Spring Boot with Redis

1. **Dependencies**

```groovy
groovy
CopyEdit
// build.gradle
implementation 'org.springframework.boot:spring-boot-starter-data-redis'
implementation 'org.springframework.boot:spring-boot-starter-cache'

```

1. **Enable Caching**

```java
java
CopyEdit
@SpringBootApplication
@EnableCaching
public class Application { }

```

1. **Use Cache in Service**

```java
java
CopyEdit
@Cacheable("products")
public Product getProductById(Long id) {
    return productRepository.findById(id).orElseThrow();
}

```

This tells Spring to first check the Redis cache. If the product is not there, it fetches from the database and stores it in the cache.

---

### Cache Strategies

| Strategy | Description |
| --- | --- |
| Cache-aside | Application manually reads/writes to cache. Most common. |
| Read-through | Cache automatically loads data if missing. |
| Write-through | Writes go to cache and data source simultaneously. |
| Write-behind | Writes go to cache first, then to DB after delay. |
| TTL (Time-To-Live) | Automatically expires items after a set duration. |
