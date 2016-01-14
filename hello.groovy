// This is an first flintbit tutorial

log.info("Welcome to flintibi!")

response=call.connector("db")
              .set("action","insert" )
              .set("query", "insert into engineers (age,lastname,city) values(27,'ani','mumbai')",
              .sync()

log.info "did it"
output.set("message","Hello World!")
