# virta-otp-rest-api
REST API for VIRTA-Opintotietopalvelu (https://www.csc.fi/virta)

## Development
### Running in development mode
`$ sh gradlew bootRun`
### Building executable jar
`$ sh gradlew build`

Artifact is located in path:

`build/libs`

## Install
1. Copy builded executable jar to server.
2. Create symbolic link for jar to `/etc/init.d/opintotieto-api` to run app as service.
3. Copy configuration file `config/app.conf` to same directory where executable jar is located and rename it with same name as the jar file.
    - Config arguments:
        1. --profile, is application running profile (dev, test, stage, prod). Default is dev.
        2. --server.port is application running port. Default is 8080.
        3. --db.username is database connection username.
        4. --db.password is database connection password.
4. Edit configuration file and enter correct information.
5. Start service `$ sudo service opintotieto-api start`