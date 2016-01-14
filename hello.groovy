// This is an first flintbit tutorial

log.info("Welcome to flintibi!")

response=call.connector("db")
              .set("action","insert" )
              .set("query","insert into user (name, active) values ('test', 1)")
              .sync()

log.info "did it"
output.set("message","Hello World!")
