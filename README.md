## API Rest with Spring Boot, Hibernate and MySQL ​​

#####  :small_blue_diamond: ​Intro

For run this application in your computer, you must have:

:white_check_mark: MySQL

:white_check_mark: Java 11

:white_check_mark: ​Eclipse (or any other one IDE)

:white_check_mark: ​Maven

:white_check_mark: ​Postman

This project is a simple API-Rest example, build with **spring boot framework** using as dependencies:

1.  Spring Web :heavy_check_mark:
2. MySQL Driver :heavy_check_mark:
3. Spring Data JPA :heavy_check_mark:
4. Validation :heavy_check_mark:

This API has only one model .class *Person*. Receives as data: **name, e-mail, date of birth, and CPF**.  Besides, it has a treatment to not allow the insertion of duplicate e-mail and CPF with exception handling.![img](https://lh6.googleusercontent.com/ylRwQujfBCLDi9A83TLGmzt7bfyX3vQlGqfZza-c-K11t7ISo6KSI7S6_5q1P1sCyzCQP1SpN95vSUh49hVtPkLTVxJV68LT6d9WcMOFmte7uf7DgEv0xBQnjoTfkPH_c4N6HVjX)



##### :small_blue_diamond: ​Config

After you created your project in **spring initiazr** this it'll be yourproject structure:

<img src="https://lh5.googleusercontent.com/jKvWvSkRxewo6qRzxYAM0fshiLptfe9IN7eq5UcbJ6rTvkwTnrWDU0dwAw2HYrW_yhytqr70jMBdbG-sQCgKvcMORVFGn_T6EnQYk03T6mY7qEF5RzMr35K8hPdIhWDF8f9QLAyi" alt="img" />

Go to ***src/main/resources/application.propertties*** and type the following commands to set up the database connection:

![img](https://lh6.googleusercontent.com/Ohook3zuSQkfvOF_QQLadobbhUs_IljcL9JPTZMyKRiG3tDZh_bkL7TS_EkYHOQ9cV9D-jrpoN29ET2FedNV6sw3e927EF_DNheRKoxkbihkmLCSgAqdmp5yVRQ4haDPSWWkR5gh)

- *spring.jpa.hibernate.ddl-auto=update*: when we connect with the bank, the data and tables will be updated, keeping everything that we gonna insert by the application.
- *srping.datasource.url:* application's connection driver with the bank and the address **localhost: 3306/api-rest**, api-rest being our database. We'll need to use Timezone, otherwise there will be an error with the bank.
- *spring.datasource.username:* username of the bank, in this case it'll be **root**, by default.
- *spring.datasource.password:* the password connection
